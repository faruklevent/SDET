package aa_assignments.assignment05;

public class Question08 {

	public static void main(String[] args) {
		// Write a program to calculate the sum of the numbers from 1 till upper bound.
		// If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
		// If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
		// If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.
		// You should use a while loop.

		int upperBound=100;
		long sum=0;
		
		int i=1; 
		while(i<=upperBound) {
			sum=sum+i;
			i++;
		}
		
		System.out.println(sum);
	}

}
