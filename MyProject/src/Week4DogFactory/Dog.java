package Week4DogFactory;

import java.util.ArrayList;

public abstract class Dog {
    String type;
    String color;

    ArrayList<String> Hair = new ArrayList<>();

    public void createDog() {
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println("Poof");
        System.out.println("You got a new dog");
    }

    void Bark() {
        System.out.println("Woof!");
    }

    void Growl() {
        System.out.println("Growl");
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
