package Week4DogFactory;

public class Husky extends Dog {
    public Husky() {
        type = "Husky";
        color = "Grey";

        Hair.add("Short");
    }

    public void Bark() {
        System.out.println("Bark: Howls");
    }

    public void Growl() {
        System.out.println("Growl: Loud mean growl");
    }
}
