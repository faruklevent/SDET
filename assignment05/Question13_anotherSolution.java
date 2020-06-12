package aa_assignments.assignment05;

public class Question13_anotherSolution {

	public static void main(String[] args) {
		/*	Print following chess board using nested for loops.
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W
		NOTE:
		1. Total 8 rows and 8 columns.
		2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find
		consecutive W or B.
	*/
		boolean flag=true;
	
		for(int i=1; i<=8; i++) {
			
			for(int j=1; j<=8; j++) {
				
				if(flag) { System.out.print("W "); }
				else	 { System.out.print("B "); }
				
				flag=!flag;
			}
			System.out.println();
			flag=!flag;
			
		}

	}

}
