import java.util.concurrent.TimeUnit;

public class fibonnaci {

	public static long fib(long times) {
		
		if ( times == 0 || times == 1) 
			return times;
		else {
			return fib(times - 1) + fib(times - 2);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		long times = 55;
		
		
		for (int i = 0; i < times; i++) {
			long start = System.nanoTime();
			System.out.println(fib(i));
			long end = System.nanoTime();
			
		    long difference = end - start;
			
			System.out.println ("Execution Time in Nanoseconds " + TimeUnit.NANOSECONDS.convert(difference, TimeUnit.NANOSECONDS));
		    System.out.println ("Execution Time in Microseconds " + TimeUnit.MICROSECONDS.convert(difference, TimeUnit.NANOSECONDS));
		    System.out.println ("Execution Time in Milliseconds " + TimeUnit.MILLISECONDS.convert(difference, TimeUnit.NANOSECONDS));
		    System.out.println ("Execution Time in Seconds " + TimeUnit.SECONDS.convert(difference, TimeUnit.NANOSECONDS));
	        System.out.println ("Execution Time In Minutes " + TimeUnit.MINUTES.convert(difference, TimeUnit.NANOSECONDS));
		}
		
		System.out.println("Process Done");
	

	}


}
