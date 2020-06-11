package aa_assignments.assignment06;

public class Question5 {

	public static void main(String[] args) {
	/*  Write a Java program to print the following pattern
		1111111		row1: 6*1 1*1	print 7-row times 1 and print row times row
		1111122		row2: 5*1 2*2	print 7-row times 1 and print row times row
		1111333				same above
		1114444				same above	
		1155555				same above
		1666666				same above
		7777777		row7: 0*1 7*7	same above
	*/
		
		for(int row=1; row<=7; row++) {
			
			for(int j=1; j<=7-row; j++) {
				System.out.print(1);
			}
			
			for(int k=1; k<=row; k++) {
				System.out.print(row);
			}
			System.out.println();
		}
		
	}

}
