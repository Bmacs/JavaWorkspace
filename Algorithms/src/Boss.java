import java.util.concurrent.TimeUnit;

public class Boss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();

		
		Grid grid = new Grid();
		grid.makeGrid();
		grid.findBoss();
		
		long end = System.nanoTime();
		
	    long difference = end - start;
		
		System.out.println ("Execution Time in Nanoseconds " + TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
	    System.out.println ("Execution Time in Microseconds " + TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
	    System.out.println ("Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
		
		
	}

}


