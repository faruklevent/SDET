package aa_assignments.lab01;

public class Question2 {

	public static void main(String[] args) {
	/* The number 6 is a truly great number.
	 * Write a method that accepts num1 and num2,
	 * prints true if either one is 6.
	 * Or if their sum or difference is 6.
		love6(6, 4) -> true
		love6(4, 5) -> false
		love6(1, 5) -> true
		love6(12, 6) -> true
	*/

		ichLiebe6(6,12);
	}

	public static void ichLiebe6(int i, int j) {

		if(i==6 || j==6 || i+j==6 || i-j==6 || j-i==6) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
