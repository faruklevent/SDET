package aa_assignments.assignment05;

import java.util.Scanner;

public class Question06_anotherSolution {

	public static void main(String[] args) {

		// Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1,
		// 1, 2, 3, 5, 8, 13, 21, 34,......

		Scanner scanner=new Scanner(System.in);
				
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		System.out.println("Fibonacci series of " + num + " numbers:");
				
		// n =	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	...
		// fn =	0	1	1	29	3	5	8	13	21	34	55	89	144	233	377	
		
		long term1=0, term2=1, fn;
		
		for(int i=0; i<=num; i++) {
			fn=term1+term2;
			System.out.print(term1+ " ");
			term1=term2;
			term2=fn;
		}
		scanner.close();
	}

}
