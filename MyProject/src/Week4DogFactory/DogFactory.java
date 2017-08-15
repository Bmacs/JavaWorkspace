package Week4DogFactory;

public class DogFactory extends DogStore {
    protected Dog getDog(String type)
    {
        if ( type.equals("small") )
            return new Pug();
        else if ( type.equals("medium") )
            return new Poodle();
        else if ( type.equals("big") )
            return new Husky();

        return null;
    }
}
