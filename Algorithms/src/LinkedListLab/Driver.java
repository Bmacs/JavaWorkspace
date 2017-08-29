package LinkedListLab;
public class Driver {

	public static void main(String[] args){
		IntSLList ll = new IntSLList();
		ll.addToHead(4);
		ll.addToHead(5);
		ll.addToHead(5);
		ll.addToTail(26);
		ll.addToTail(22);
		ll.addToHead(96);
		ll.addToTail(193);
		ll.addToHead(203);


		ll.printAll();
		System.out.println();
		System.out.println("Size: " + ll.getSize());
		System.out.println("Sum: " + ll.Sum());
		System.out.println("Max: " + ll.Max());
		System.out.println("Min: " + ll.Min());
		ll.removeDuplicates();
		System.out.println();
		ll.printAll();
		System.out.println("Size: " + ll.getSize());
		System.out.println();
		System.out.println("Delete from tail " + ll.deleteFromTail());
		System.out.println("Size: " + ll.getSize());
		ll.printAll();
		System.out.println();
		System.out.println("Delete from head " + ll.deleteFromHead());
		System.out.println("Size: " + ll.getSize());
		ll.printAll();
		ll.sort();
		System.out.println();
		System.out.println("Sorted: ");
		System.out.println();
		System.out.println("All");
		ll.printAll();
		System.out.println("Median " + ll.findMiddle());
		ll.removeMedian();
		System.out.println();
		ll.printAll();
		System.out.println("Median " + ll.findMiddle());
		System.out.println("In list is " + ll.isInList(4));
		System.out.println("In list is " + ll.isInList(1));
		
	}
	
}
