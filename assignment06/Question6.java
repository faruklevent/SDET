package aa_assignments.assignment06;

public class Question6 {

	public static void main(String[] args) {
	/*  Write a Java program to print the following pattern
		1		print row#
		2 6		print row# and row#+4
		3 7 10		print row# and row#+4 and row#+4+3
		4 8 11 13	print row# and row#+4 and row#+4+3 and row#+4+3+2
		5 9 12 14 15	print row# and row#+4 and row#+4+3 and row#+4+3+2 and row#+4+3+2+1
	*/

		int row=5;	//Assign any number to row and see the amazing result!!
		
		for(int i=1; i<=row; i++){
			
			int k=0;

			for(int j=1; j<=i; j++) {
				System.out.print(i+k + " ");
				k+=row-j;
			}
			System.out.println();
		}
		
	}
	
}
