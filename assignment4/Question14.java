package aa_assignments.assignment4;
import java.util.*;

public class Question14 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of books you purchased this month:");
		int num=scan.nextInt();
		
		int points=0;
		
		if(num==0) points=0;
		else if(num==1) points=5;
		else if(num==2) points=15;
		else if(num==3) points=30;
		else if(num>=4) points=60;
		
		System.out.println("Points awarded: "+points);
	}

}
