package aa_assignments.lab02;
import java.util.Scanner;

public class Question2_cookieCalories {

	public static void main(String[] args) {
	/*	A bag of cookies holds 40 cookies. The calorie information on the bag claims that there
		are 10 serving in the bag and that a serving equals 300 calories. write a program that
		lets the user enter the number of cookies he or she actually ate and then reports the
		number of total calories consumed.
	*/
		//If 40 cookies is 10 serving, then 1 serving has 4 cookies.
		//If 1 serving equals 300 calories, 1 cookie is 75 calories.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many cookies did you eat?");
		byte eaten=scan.nextByte();
		
		System.out.println("You consumed " + eaten*75 + " calories in total.");
		scan.close();
	}

}
