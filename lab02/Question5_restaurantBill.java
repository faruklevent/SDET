package aa_assignments.lab02;
import java.util.Scanner;

public class Question5_restaurantBill {

	public static void main(String[] args) {
	/* Write a program that computes the tax and tip on a restaurant bill. 
	 * The program should ask the user to enter the charge for the meal. 
	 * The tax should be 6.75 percent of the meal charge. The tip should 
	 * be 20 percent of the total after adding tax. Display the 
	 * meal charge, tax amount, tip amount, and total bill on the screen.
	 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the charge for the meal: $");
		double charge=sc.nextDouble();
		
		double tax=charge*6.75/100;
		double tip=(charge+tax)*0.20;
		double bill=charge+tax+tip;
		
		System.out.println("Meal charge: $"+charge);
		System.out.println("Tax amount: $"+tax);
		System.out.println("Tip amount: $"+tip);
		System.out.println("Total bill: $"+bill);
		
		sc.close();		
	}

}
