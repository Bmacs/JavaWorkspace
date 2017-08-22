package Midterm;

import java.util.Random;
import sun.misc.Queue;

public class BankSimulation {
    static Random rd = new Random();
    static int Option(int percents[]) {
        int i = 0, perc, choice = Math.abs(rd.nextInt()) % 100 + 1;
        for (perc = percents[0]; perc < choice; perc += percents[i+1], i++);
        return i;
    }

    public static void main(String[] args) {
        int[] arrivals = {15,20,25,10,30};
        int[] service = {0,0,0,10,5,10,10,0,15,25,10,15};
        int[] clerks = {1,1,1,1}; // hint: vary this set from 6 clerk entries to 1
        int clerksSize = clerks.length;
        int customers, t, i, numOfMinutes = 100, x = 0;
        double maxWait = 0.0, thereIsLine = 0.0, currWait = 0.0;
        Queue simulQ = new Queue();
        for (t = 1; t <= numOfMinutes; t++) {
            System.out.print(" t = " + t);
            for (i = 0; i < clerksSize; i++)
                if (clerks[i] < 60)
                    clerks[i] = 0;
                else clerks[i] -= 60;
            customers = Option(arrivals);
            for (i = 0; i < customers; i++) {
                x = Option(service)*10;
                simulQ.enqueue(new Integer(x));
                currWait += x;
            }
            // dequeue customers when clerks are available
            for (i = 0; i < clerksSize && !simulQ.isEmpty();)
                if (clerks[i] < 60) {
                    try {
                        x = ((Integer) simulQ.dequeue()).intValue();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // assign more than one customer
                    clerks[i] += x; //to a clerk if service time
                    currWait -= x;  //is still below 60
                }
                else i++;
            if (!simulQ.isEmpty()) {
                thereIsLine++;
                System.out.print(" wait = " + ((long)(currWait/6.0)) / 10.0);
                if (maxWait < currWait)
                    maxWait = currWait;
            }
            else System.out.print(" wait = 0;");
        }
        System.out.println("\nFor " + clerksSize + " clerks, there was a line "
                                    + thereIsLine/numOfMinutes*100.0 + "% of the time;\n"
                                    + "maximum wait time was " + maxWait/60.0 + " min.");
    }
}
