package ArrayStack;

public class ArrayStack {

    int count = 0;
    private int[] data;
    private int[] data2;

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
        // test against the array first then add element
        if (size() == data.length) {
            extendArray();
        }
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

    public boolean find(int element) { // return true if the number is in the stack
        for (int i = 0; i < size(); i++) {
            if (element == data[i])
                return true;
        }
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

    public void extendArray(){
        int[] newArray = data.clone();
        data2 = new int[newArray.length*2];
        System.arraycopy(newArray, 0, data2, 0, newArray.length);
        data = data2;
    }
}