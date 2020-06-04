package aa_assignments.assignment4;
import java.util.*;

public class Question9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the weight of package in pounds:");
		double pounds=scan.nextDouble();
		System.out.println("Enter the miles shipped:");
		int miles=scan.nextInt();
		double rate=0;
		
		if(pounds<=2) rate=1.10;
		else if(pounds>2 && pounds<=6) rate=2.20;
		else if(pounds>6 && pounds<=10) rate=3.70;
		else if(pounds>10) rate=3.80;
		
		int miles_f;
		if(miles%500==0) miles_f=miles/500;
		else miles_f=1+(miles/500);
		
		double charge=rate*miles_f;
		
		System.out.println("Shipping charge is : $ "+charge);
	
	}

}
