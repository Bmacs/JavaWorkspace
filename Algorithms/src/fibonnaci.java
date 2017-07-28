
public class fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int times = 89;
		long num1 = 1;
		long num2 = 1;
		long num3;
		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
		
		for (int i = 0; i < times; i++) {
			
			
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
			
			System.out.println(num3 + " ");
			
			
			
		}

	}

}
