package Week4DogFactory;

public class Poodle extends Dog {
    public Poodle() {
        type = "Poodle";
        color = "White";

        Hair.add("Short Curly");
    }

    public void Bark() {
        System.out.println("Bark: WOOF WOOF");
    }

    public void Growl() {
        System.out.println("Growl: Growls loudly");

    }

}
