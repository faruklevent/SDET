package aa_assignments.assignment4;
import java.util.*;

public class Question6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the object's mass in kg: ");
		double mass=scan.nextDouble();
		
		double weight=mass*9.8;
		
		System.out.println("Object's weight in Newtons is : "+weight);
		if(weight>1000) System.out.println("It is too heavy.");
		else if(weight<10) System.out.println("It is too light.");
	}

}
