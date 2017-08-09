package Week4Lab;

public class Drink {
    private boolean empty;
    private boolean filled;
    private static Drink uniqueInstance;
    private Drink() {
        empty = false;
        filled = true;
    }

    public static Drink getInstance() {
        if( uniqueInstance == null )
            uniqueInstance = new Drink();
        return uniqueInstance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isFilled() {
        return filled;
    }

    public void notFilled() {
        if ( isEmpty() ) {
            empty = true;
            filled = false;
        }
    }

    public void dump() {
        if ( !isEmpty() && isFilled() ) {
            empty = true;
            filled = false;
        }
    }

    public void fill() {
        if ( !isEmpty() )
            filled = true;
    }
}
