package Week4DogFactory;

public class testDog {
        public static void main(String[] args)
        {
            DogStore ds = new DogFactory();

            Dog dog = ds.orderDog("small");
            System.out.println("Customer ordered a " + dog.getColor() + " " + dog.getType());

            dog = ds.orderDog("medium");
            System.out.println("Customer ordered a " + dog.getColor() + " " + dog.getType());

            dog = ds.orderDog("big");
            System.out.println("Customer ordered a " + dog.getColor() + " " + dog.getType());
        }
}
