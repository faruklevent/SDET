package aa_assignments.lab01;

public class Question1 {

	public static void main(String[] args) {
		
	/*	Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String

		stringTimes("Hi", 2); = > HiHi
		stringTimes("Hi", 3); = > HiHiHi
		stringTimes("Hi", 1); = > Hi
	*/
		stringTimes("BlackLivesMatter", 20);
	}

	public static void stringTimes(String str, int times) {

		for(int j=1; j<=times; j++) {
			System.out.print(str);
		}
	}

}
