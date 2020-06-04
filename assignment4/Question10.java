package aa_assignments.assignment4;
import java.util.*;

public class Question10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter total calories in the food item:");
		int totalCal=scan.nextInt();
		System.out.println("Enter fat grams in the food item:");
		double fat=scan.nextDouble();
		
		double fatCal=fat*9;
		
		if(fatCal>totalCal) System.out.println("Invalid input!");
		else {
			double perc=100*(fatCal/totalCal);
			System.out.println("The percentage of calories from fat is: "+perc);
			if (perc<30) System.out.println("The food is low in fat.");
		}
		
	}

}
