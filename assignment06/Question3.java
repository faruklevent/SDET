package aa_assignments.assignment06;

public class Question3 {

	public static void main(String[] args) {
	/*	Write a Java program to print the following pattern
		1 2 3 4 5 6 7	//row1  0 spaces + 1-7  ==> number of spaces: row-1,  numbers: from row till 7
		 2 3 4 5 6 7	//row2  1 space  + 2-7  ==> same above
		  3 4 5 6 7		//row3  2 spaces + 3-7  ==> same above
		   4 5 6 7		//row4  3 spaces + 4-7  ==> same above
		    5 6 7		//row5  4 spaces + 5-7  ==> same above
		     6 7		//row6  5 spaces + 6-7  ==> same above
		      7			//row7  6 spaces + 7-7  ==> same above
		     6 7		//row8  5 spaces + 6-7  ==> number of spaces: 6-row%7,  numbers:from 7-row%7 till 7
		    5 6 7		//row9  4 spaces + 5-7  ==> same above
		   4 5 6 7		//row10 3 spaces + 4-7  ==> same above  
		  3 4 5 6 7		//row11 2 spaces + 3-7  ==> same above
		 2 3 4 5 6 7	//row12 1 space  + 2-7  ==> same above
		1 2 3 4 5 6 7   //row13 0 spaces + 1-7  ==> same above
	*/
		
		for(int row=1; row<=13; row++) {
			
			if(row<=7) {
				for(int j=1; j<row; j++)  { System.out.print(" ");     } //print spaces
				for(int k=row; k<=7; k++) { System.out.print(k + " "); } //print numbers
				System.out.println();
			}
			else{
				for(int j=1; j<7-(row%7); j++)  { System.out.print(" ");     } //print spaces
				for(int k=7-(row%7); k<=7; k++) { System.out.print(k + " "); } //print numbers
				System.out.println();
			}
			
		}
		
	}

}
