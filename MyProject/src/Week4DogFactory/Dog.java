package Week4DogFactory;

import java.util.ArrayList;

public abstract class Dog {
    String type;
    String color;

    ArrayList<String> Hair = new ArrayList<>();

    void createDog() {
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println("Poof");
        System.out.println("You got a new dog");
        for (int i = 0; i < Hair.size(); i++) {
            System.out.println(" Hair: " + Hair.get(i));
        }
    }

    abstract void Bark();

    abstract void Growl();

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
