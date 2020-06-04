package aa_assignments.assignment4;
import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of seconds:");
		int num=scan.nextInt();
		
		if(num>=60) System.out.println("Number of minutes in "+num+" seconds is : "+(num/60));		
		if(num>=3600) System.out.println("Number of hours in "+num+" seconds is : "+(num/3600));		
		if(num>=86400) System.out.println("Number of days in "+num+" seconds is : "+(num/86400));
	}

}
