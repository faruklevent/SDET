package aa_assignments.assignment4;
import java.util.*;

public class Question11 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the medium \"air\", \"water\" or \"steel\" :");
		String medium=scan.nextLine();
		System.out.println("Enter the distance in feet:");
		int dist=scan.nextInt();
		
		double time=0;
		
		switch(medium) {
		case "Air": case "air": case "AIR":
			time=dist/1100.0;
			break;
		case "Water": case "water": case "WATER":
			time=dist/4900.0;
			break;
		case "Steel": case "steel": case "STEEL":
			time=dist/16400.0;
			break;
		}
		System.out.println("In "+medium+", sound travels "+dist+" feet in "+time+" seconds.");
				
	}

}
