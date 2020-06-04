package aa_assignments.assignment4;
import java.util.*;

public class Question4 {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter number of calls:");
			int calls=scan.nextInt();
			
			double bill=0;
			
			if(calls<=100) bill=200;
			else if(calls>100 && calls<=150) bill=200+(calls-100)*0.60;
			else if(calls>150 && calls<=200) bill=200+(50*0.60)+(calls-150)*0.50;
			else if(calls>200) bill=200+(50*0.60)+(50*0.50)+(calls-200)*0.40;
			
			System.out.println("Your telephone bill is : "+bill);
	}

}
