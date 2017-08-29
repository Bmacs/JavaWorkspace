package LinkedListLab;

public class IntSLList {
	protected IntSLLNode head, tail;
	private int size;
	public IntSLList() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addToHead(int el) {
		head = new IntSLLNode(el, head);
		if (tail == null)
			tail = head;
		size++;
	}
	
	public void addToTail(int el) {
		if (!isEmpty()) {
			tail.next = new IntSLLNode(el);
			tail = tail.next;
		}
		else head = tail = new IntSLLNode(el);
		size++;
	}
	
	public int deleteFromHead() {
		int el = head.info;
		if (head == tail) {
			head = tail = null;
		}
		else {
			head = head.next;
			size--;
		}
		return el;
	}
	
	public int deleteFromTail() { 
		int el = tail.info;
		if (head == tail) {
			head = tail = null;
		}
		else {
			IntSLLNode tmp;
			for (tmp = head; tmp.next != tail; tmp = tmp.next);
			tail = tmp;
			tail.next = null;
			size--;
		}
		return el;
	}
	
	public void printAll() {
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next) {
			System.out.println(tmp.info + " ");
		}
	}
	
	public boolean isInList(int el) {
		IntSLLNode tmp;
		for (tmp = head; tmp != null && tmp.info != el; tmp = tmp.next);
		return tmp != null;
	}
	
	public void delete(int el) {
		if (!isEmpty())
			if (head == tail && el == head.info)
				head = tail = null;
			else if (el == head.info)
				head = head.next;
			else {
				IntSLLNode pred, tmp;
				for (pred = head, tmp = head.next;
					tmp != null && tmp.info != el;
					pred = pred.next, tmp = tmp.next);
				if (tmp != null) {
					pred.next = tmp.next;
					if (tmp == tail) {
						tail = pred;
					}
				}
			}
	}

	public int Sum() {
		int sum = 0;
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next) {
			sum = sum + tmp.info;
		}
		return sum;
	}

	public int Max() {
		int max = 0;
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.info > max)
				max = tmp.info;
		}
		return max;
	}

	public int Min() {
		int min = head.info;
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next) {
			if (tmp.info < min)
				min = tmp.info;
		}
		return min;
	}

	public int getSize() {
		return size;
	}

	public void removeDuplicates() {
		int dup = 0;
		for (IntSLLNode tmp = head; tmp != null; tmp = tmp.next) {
			int num = tmp.info;
			dup = 0;
			for (IntSLLNode temp = head; temp != null; temp = temp.next) {
				if (num == temp.info)
					dup++;
				if (num == temp.info && dup == 2) {
					System.out.println("removing " + temp.info);
					delete(temp.info);
					size--;
				}
			}
		}
	}

	public void removeMedian() {
		sort();
		int median = findMiddle();
		delete(median);
	}

	public int findMiddle() {
		IntSLLNode slow_ptr = head;
		IntSLLNode fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			//System.out.println("The middle element is [" + slow_ptr.info + "] \n");
		}
		return slow_ptr.info;
	}

	public void sort() {
		if (size > 1) {
			boolean changed;
			do {
				IntSLLNode current = head;
				IntSLLNode previous = null;
				IntSLLNode next = head.next;
				changed = false;

				while (next != null) {
					if (current.info > next.info) {
						changed = true;
						if (previous != null) {
							IntSLLNode sig = next.next;
							previous.next = next;
							next.next = current;
							current.next = sig;
						} else {
							IntSLLNode sig = next.next;
							head = next;
							next.next = current;
							current.next = sig;
						}
						previous = next;
						next = current.next;
					} else {
						previous = current;
						current = next;
						next = next.next;
					}
				}
			} while (changed);
		}
	}
}
