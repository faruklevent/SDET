package aa_assignments.assignment05;
import java.util.*;

public class Question04 {

	public static void main(String[] args) {
		// Write a while loop that lets the user enter a number. The number should be multiplied
		// by 10, and the result stored in the variable product. The loop should iterate as long as
		// product contains a value less than 100.

		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a number:");
		int product=10*scanner.nextInt();
		
		while(product<100) {
			System.out.println("Enter another number:");
			product=10*scanner.nextInt();
		}
		
		System.out.println("Out of loop.");
		
		/* Alternative code with do-while:
		int product;
		do {
			System.out.println("Enter a number:");
			product=10*scanner.nextInt();
					
		} while(product<100);
		
		System.out.println("Out of loop.");
		*/
		scanner.close();
	}

}
