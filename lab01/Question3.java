package aa_assignments.lab01;

public class Question3 {

	public static void main(String[] args) {
	/*	We'll say a number is special if it is a multiple of 11 or 
	 * if it is one more than a multiple of 11. Write a method 
	 * that accepts a number and prints true if the given number is special.

		specialEleven(22)	true
		specialEleven(23)	true
		specialEleven(24)	false
	*/
		specialEleven(112233);
	}

	public static void specialEleven(int i) {

		if(i%11==0 || i%11==1) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
