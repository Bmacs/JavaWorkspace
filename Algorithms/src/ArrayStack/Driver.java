package ArrayStack;

public class Driver {
    public static void main(String[] args) {

        ArrayStack as = new ArrayStack(2);

        as.push(10);

        as.push(11);

        as.push(1);

        as.push(0);

        as.push(5);

        System.out.println("Size:");
        System.out.println(as.size()); // this should print 5

        System.out.println("Pop:");
        System.out.println(as.pop()); // this should print 5

        System.out.println("Index of 11:");
        System.out.println(as.indexOf(11));

        System.out.println("Find 1 True OR False:");
        System.out.println(as.find(1));



        System.out.println("Size:");
        System.out.println(as.size());

        as.clear();

        System.out.println("Size:");
        System.out.println(as.size());

        //System.out.println(as.indexOf(11));

    }
}
