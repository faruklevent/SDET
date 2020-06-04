package aa_assignments.assignment4;
import java.util.*;

public class Question1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds:");
		int pounds=scan.nextInt();
		System.out.println("Enter your height in feet:");
		int feet=scan.nextInt();
		System.out.println("Enter your height in additional inches:");
		int inches=scan.nextInt();
		
		float kgs=pounds/2.2f;
		int totalInches=inches+feet*12;
		float meters=totalInches*0.0254f;
		float bmi=kgs/(meters*meters);
		
		String risk="N/A";
		if(bmi<18.5) risk="Underweight";
		else if(bmi>=18.5 && bmi<25) risk="Normal Weight";
		else if(bmi>=25 && bmi<30) risk="Overweight";
		else if(bmi>=30) risk="Obese";
		
		System.out.println("Your weight in pounds: "+pounds);
		System.out.println("Your height in feet followed by a space then additional inches: "+feet+" "+inches);
		System.out.println("Your BMI is "+bmi);
		System.out.println("Your risk factory is "+risk);
	}

}
