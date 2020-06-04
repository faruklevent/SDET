package aa_assignments.assignment4;
import java.util.*;

public class Question2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your income:");
		int income=scan.nextInt();
		double tax=0;
		
		double tax_a = 150_000_000*0.25; //tax portion (0 - 150,000,000) to be used when income is between 150,000,000 and 300,000,000
		double tax_b = tax_a + 150_000_000*0.30; //tax portion (0 - 300,000,000) to be used when income is between 300,000,000 and 600,000,000
		double tax_c = tax_b + 300_000_000*0.35; //tax portion (0 - 600,000,000) to be used when income is between 600,000,000 and 1,200,000,000
		double tax_d = tax_c + 600_000_000*0.40; //tax portion (0 - 1,200,000,000) to be used when income is over 1,200,000,000
		
		if		(income<=150_000_000) tax=income*0.25;
		else if	(income>150_000_000 && income<=300_000_000) tax = tax_a + (income-150_000_000)*0.30;
		else if	(income>300_000_000 && income<=600_000_000) tax = tax_b + (income-300_000_000)*0.35;
		else if	(income>600_000_000 && income<=1200_000_000) tax = tax_c + (income-600_000_000)*0.40;
		else if	(income>1200_000_000) tax = tax_d + (income-1200_000_000)*0.50;
		
		System.out.println("The tax amount you have to pay: "+tax);
	}

}
