package ArrayStack;

public class ArrayStack {

    int count = 0;
    private int[] data;

    public ArrayStack(int size) {

        data = new int[size];

    }

    public void clear() {
        do {
            for (int i = 0; i < size(); i++)
                pop();
        } while (size() > 0);
    }

    public void push(int element) {
        data[count] = element;
        count++;
    }

    public int pop() {
        count--;
        return data[count];
    }

    public int size() {
        return count;
        //implement size the array
    }



    public boolean find(int element) {
        for (int i = 0; i < size(); i++) {
            if (element == data[i])
                return true;
        }
               // return true if the number is in the stack
        return false;
    }

    public int indexOf(int element) {
        for (int i = 0; i < size(); i++) {
            if (element == data[i])
                return i;
        }
        //return the location (index of the number within the stack)...else return -1 if the element is not present
        return -1;
    }

}