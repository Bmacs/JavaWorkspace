package Week4Singleton;

public class Driver {

    public static void main(String[] args) {
        ChocolateBoiler cb = ChocolateBoiler.getInstance();

        cb.fill();
        cb.drain();
        System.out.println("cb object memory address = " + cb.toString());

        ChocolateBoiler cb2 = ChocolateBoiler.getInstance();
        System.out.println("cb object memory address = " + cb2.toString());

        ChocolateBoiler cb3 = ChocolateBoiler.getInstance();
        System.out.println("cb object memory address = " + cb3.toString());

    }
}
