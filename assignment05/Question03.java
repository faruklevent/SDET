package aa_assignments.assignment05;

public class Question03 {

	public static void main(String[] args) {
		// Write a program that displays the number of even numbers between 5 and 50
		// (included)
		
		int numberOfEvenNumbers=0;
		
		for(int i=5; i<=50; i++) {
			
			if(i%2==0) {
				numberOfEvenNumbers++;
			}
		}
		System.out.println("There are "+ numberOfEvenNumbers + " even numbers between 5 and 50.");

	}

}
