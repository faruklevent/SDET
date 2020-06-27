package aa_assignments.lab02;
import java.util.Scanner;

public class Question1_largestSmallest {

	public static void main(String[] args) {
	/*	Write a program with a loop that lets the user enter a series of integer numbers. After
		all the numbers have been entered, the program should display the largest and
		smallest numbers entered.
	*/
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		int smallest=num, largest=num;
				
		do {
			System.out.print("Enter another number: ");
			num=scan.nextInt();
			if(num>largest) {
				largest=num;
			}else if(num<smallest){
				smallest=num;
			}
			
			System.out.print("Do you want to enter another number: 0-No, 1-Yes ");
			byte yesNo=scan.nextByte();
			if(yesNo==0) {
				System.out.println("The smallest number you entered : " + smallest);
				System.out.println("The largest number you entered  : " + largest);
				break;
			}
		}while(true);
		scan.close();
	}

}
