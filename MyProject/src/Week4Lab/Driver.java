package Week4Lab;

public class Driver {
    public static void main(String[] args) {
        Drink drink = Drink.getInstance();

        drink.fill();
        System.out.println(drink.isFilled());
        System.out.println(drink.isEmpty());
        drink.dump();
        System.out.println(drink.isFilled());
       // System.out.println(drink.isEmpty());
        System.out.println("cb object memory address = " + drink.toString());

        Drink drink2 = Drink.getInstance();
        System.out.println("cb object memory address = " + drink2.toString());

        Drink drink3 = Drink.getInstance();
        System.out.println("cb object memory address = " + drink3.toString());

    }
}
