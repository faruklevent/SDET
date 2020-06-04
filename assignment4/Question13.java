package aa_assignments.assignment4;
import java.util.*;

public class Question13 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of checks written for the month:");
		int checks=scan.nextInt();
		
		double checkFees=0, baseFee=10;
		
		if(checks<20) checkFees=checks*0.10;
		else if(checks>=20 && checks<=39) checkFees=checks*0.08;
		else if(checks>=40 && checks<=59) checkFees=checks*0.06;
		else if(checks>=60) checkFees=checks*0.04;
		
		double totalFees=baseFee+checkFees;
		
		System.out.println("Total service fees for the month : $ "+totalFees);
	}

}
