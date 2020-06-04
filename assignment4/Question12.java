package aa_assignments.assignment4;
import java.util.*;

public class Question12 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter package \"A\", \"B\" or \"C\":");
		String pack=scan.next();
		System.out.println("Enter hours of internet used: ");
		int hours=scan.nextInt();
		
		double bill=0;
		
		switch(pack) {
		case "A": case "a":
			if(hours<=10) bill=9.95;
			else bill=9.95+(hours-10)*2;
			break;
		case "B": case "b":
			if(hours<=20) bill=13.95;
			else bill=13.95+(hours-20)*1;
			break;
		case "C": case "c":
			bill=19.95;
			break;
		}
		System.out.println("Total charges : $ "+bill);
	}

}
