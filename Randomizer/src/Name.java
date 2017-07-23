import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	    long start = System.nanoTime();
		
	  	ArrayList<String> array = new ArrayList<>();
        array.add("");

        String name = "My Name Is Brendan";

        for(int i = 0; i < name.length(); i++)
          if(name.charAt(i) == ' ')
            array.add("");
          else {
            String s = array.get(array.size() - 1);
            s += name.charAt(i);
            array.set(array.size() - 1, s);
          }

        for(int i = array.size(); i != 0; i--)
          System.out.println(array.get(i - 1));
	
		
        long end = System.nanoTime();
        
        long difference = end - start;
        
        System.out.println ("Execution Time in Nanoseconds " + TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println ("Execution Time in Microseconds " + TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println ("Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println ("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference, TimeUnit.NANOSECONDS));
        System.out.println("Execution Time In Minutes" + TimeUnit.MINUTES.convert(difference, TimeUnit.NANOSECONDS));



	}
	

}
