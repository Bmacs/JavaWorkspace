package Week4;

public class Driver1 {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(new Integer(7));
        queue.enqueue(new Integer(10));
        queue.dequeue();

        System.out.print(queue.firstEl());
    }
}