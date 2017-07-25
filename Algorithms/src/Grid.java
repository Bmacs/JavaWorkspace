
public class Grid {


	public int num = 8;
	public char arr[][] = new char[num][num];
	int bossx = (int) (Math.random()*num);
	int bossy = (int) (Math.random()*num);
	int b = 0;
	public void makeGrid() {
		// TODO Auto-generated constructor stub
		 int l = 0; 

			for (int k = 0; k < num; k++) {
					 if (k == bossx && l == bossy) {
						 arr[k][0] = 'x';
						 //System.out.print('x');
					 }
					 else {
						 arr[k][0] = 'l';
							//System.out.print("o");

					 }
				for (l = 1; l < num; l++) {
					 if (k == bossx && l == bossy) {
						 arr[k][l] = 'x';
						 //System.out.print('x');
					 }
					 else {
						 arr[k][l] = 'l';
					 }
				}					
			}
		
	}
	
	public void findBoss() {
		for (int z = 0; z < num; z++) {
			if (arr[z][0] == 'x') {
				System.out.println("Found the boss at " + z + " " + "0");
			}
			for (b = 1; b < num; b++) {
				if (arr[z][b] == 'x') {
					System.out.println("Found the boss at " +  z + " " + (b - 1));
				}
				
			}
		}
	}
	


}
