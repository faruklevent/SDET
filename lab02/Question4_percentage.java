package aa_assignments.lab02;
import java.util.Scanner;

public class Question4_percentage {

	public static void main(String[] args) {
	/* Write a program that asks user for the number of males and 
	 * the number of females registered in a class. The program should 
	 * display the percentage of males and females in the class.
	 */

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number females: ");
		int f=sc.nextInt();
		
		System.out.print("Enter the number males: ");
		int m=sc.nextInt();
		
		float fperc=(float)100*f/(m+f);
		float mperc=(float)100*m/(m+f);
		
		System.out.println("Your class consists of "+fperc+"% females and "+mperc+"% males.");
		sc.close();		
	}

}
