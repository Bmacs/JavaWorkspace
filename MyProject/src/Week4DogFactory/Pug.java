package Week4DogFactory;

public class Pug extends Dog {
    public Pug() {
        type = "Pug";
        color = "Black";

        Hair.add("Short");
    }

    public void Bark() {
        System.out.println("Bark: Woof");
    }

    public void Growl() {
        System.out.println("Growl: Growls quietly");
    }
}
