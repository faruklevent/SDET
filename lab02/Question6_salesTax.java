package aa_assignments.lab02;
import java.util.Scanner;

public class Question6_salesTax {

	public static void main(String[] args) {
	/*	Write a program that will ask the user to enter the amount of a purchase. The program
		should then compute the state and county tax sales tax. Assume the state sales tax is
		4 percent and the county sales tax is 2 percent. The program should display the
		amount of the purchase , the state sales tax, the county sales tax, the total sales tax,
		and the total of the sale (which is the sum of the amount of purchase plus the total
		sales tax)
	*/
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the amount of purchase : $");
		double p=sc.nextDouble();
		
		double stateTax=p*0.04;
		double countyTax=p*0.02;
		double totalTax=stateTax+countyTax;
		double totalOfTheSale=p+totalTax;
		
		System.out.println("The amount of the purchase : $"+p);
		System.out.println("The state sales tax\t: $"+stateTax);
		System.out.println("The county sales tax\t: $"+countyTax);
		System.out.println("The total sales tax\t: $"+totalTax);
		System.out.println("The total of the sale\t: $"+totalOfTheSale);
		
		sc.close();
	}

}
