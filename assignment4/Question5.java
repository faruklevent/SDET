package aa_assignments.assignment4;
import java.util.*;

public class Question5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Now I want you to declare a date.\n First enter the month (in numeric form):");
		int month=scan.nextInt();
		System.out.print(" Enter the day:");
		int day=scan.nextInt();
		System.out.print(" Enter the year (two-digit):");
		int year=scan.nextInt();
		
		if(month*day==year) System.out.println("Wow, this date is magic!");
		else System.out.println("This date is not magic, sorry!");
	}

}
