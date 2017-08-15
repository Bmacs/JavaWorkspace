package Week4DogFactory;


public abstract class DogStore {
    public Dog orderDog(String type) {
        Dog dog;

        dog = getDog(type);

        dog.createDog();
        dog.Bark();
        dog.Growl();

        return dog;
    }

    protected abstract Dog getDog(String type);
}
