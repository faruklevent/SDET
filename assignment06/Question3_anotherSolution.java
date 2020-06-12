package aa_assignments.assignment06;

public class Question3_anotherSolution {

	public static void main(String[] args) {
		/*	Write a Java program to print the following pattern
		1 2 3 4 5 6 7	//row1  0 spaces + 1-7  
		 2 3 4 5 6 7	//row2  1 space  + 2-7  
		  3 4 5 6 7		//row3  2 spaces + 3-7  
		   4 5 6 7		//row4  3 spaces + 4-7  
		    5 6 7		//row5  4 spaces + 5-7  
		     6 7		//row6  5 spaces + 6-7  
		      7			//row7  6 spaces + 7-7  
		     6 7		//row8  5 spaces + 6-7  
		    5 6 7		//row9  4 spaces + 5-7  
		   4 5 6 7		//row10 3 spaces + 4-7   
		  3 4 5 6 7		//row11 2 spaces + 3-7  
		 2 3 4 5 6 7	//row12 1 space  + 2-7  
		1 2 3 4 5 6 7   //row13 0 spaces + 1-7  
	*/

		int space=0;
		
		for(int i=1; i<=13; i++) {
			
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			
			for(int k=space+1; k<=7; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
			
			if(i<7) space++;
			else space--;
			
			
		}
	}

}
