package aa_assignments.lab01;

public class Question5 {

	public static void main(String[] args) {
		/*You are driving a little too fast, and a police officer stops you. 
		 *Write a method to compute the result: 
		 *0=no ticket, 1=small ticket, 2=big ticket. 
		 *If speed is 60 or less, the result is 0. 
		 *If speed is between 61 and 80 inclusive, the result is 1. 
		 *If speed is 81 or more, the result is 2. 
		 *Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

				caughtSpeeding(60, false) --> 0
				caughtSpeeding(65, false)--> 1
				caughtSpeeding(65, true)--> 0
		*/
		caughtSpeeding(86, true);
		caughtSpeeding(85, true);
		caughtSpeeding(85, false);
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
	}

	public static void caughtSpeeding(int speed, boolean isBirthday) {

		byte result;
		System.out.print("Your speed is " + speed + ". ");
		
		if(isBirthday) {
			speed=speed-5;  
			System.out.print("Today is your birthday. "); 
		}
		
		if(speed>=81) result=2;
		else if(speed>=61 ) result=1;
		else result=0;
		
		
		switch (result) {
		case 0:
			System.out.println("Result is 0 = no ticket." );
			break;
		case 1:
			System.out.println("Result is 1 = small ticket." );
			break;
		case 2:
			System.out.println("Result is 2 = big ticket." );
			break;
			
		}
		
	}

}
