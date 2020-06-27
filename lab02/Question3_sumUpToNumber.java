package aa_assignments.lab02;
import java.util.Scanner;

public class Question3_sumUpToNumber {

	public static void main(String[] args) {
	//	Write a program that asks the user for a positive nonzero integer value. The program
	//	should use a loop to get the sum of all the integers from 1 up to the number entered. 

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("Sum of all numbers between 1-"+num+" is "+sum+".");
		sc.close();
	}
}
