package Week4DogFactory;

public class testDog {
        public static void main(String[] args)
        {

            Dog dog = DogFactory.getDog("small");
            System.out.println("Ordered a " + dog.getColor() + " " + dog.getType());
            dog.Bark();

            dog = DogFactory.getDog("medium");
            System.out.println("Ordered a " + dog.getColor() + " " + dog.getType());
            dog.Bark();

            dog = DogFactory.getDog("big");
            System.out.println("Ordered a " + dog.getColor() + " " + dog.getType());
            dog.Bark();
        }
}
