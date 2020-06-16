package aa_assignments.lab01;

public class Question4 {

	public static void main(String[] args) {
	/*	The deers in VA spend most of the day playing. 
	 *  In particular, they play if the temperature is between 60 and 90. 
	 *  Unless it is summer, then the upper limit is 100 instead of 90.
		Write a method that accepts temperature and a boolean isSummer, 
		prints true if the deers play and false otherwise.

		deerPlay(70, false); - > true
		deerPlay(95, false); - > false
		deerPlay(95, true); - > true
	*/
		deerPlay(99, true);
	}

	public static void deerPlay(int temperature, boolean isSummer) {

		int lowerLimit=60, upperLimit=90;
		
		if(isSummer) {	upperLimit=100;	}
		
		if(temperature>=lowerLimit && temperature<=upperLimit) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
