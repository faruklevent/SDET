package aa_assignments.assignment4;
import java.util.*;

public class Question3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter year:");
		int year=scan.nextInt();
		
		boolean leapYear;
		
		if(year%100==0) {
			if(year%400==0) leapYear=true;
			else leapYear=false;
		}else if(year%4==0) leapYear=true;
		else leapYear=false;
		
		if(leapYear) System.out.println("Leap Year");
		else System.out.println("NOT a Leap Year");
	}

}
