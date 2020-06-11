package aa_assignments.assignment05;

public class Question11 {

	public static void main(String[] args) {
	/* Print the following output using nested for loops.
		4       3       2      1
	        3       2      1
	            2       1
	                1
	 */
		
		for(int i=4; i>=1; i--) {

			for(int k=1; k<=4-i; k++) {
				System.out.print("    ");
			}
			
			for(int j=i; j>=1; j--) {
				System.out.print(j + "       ");
			}
			System.out.println();
		}
		
	}

}
