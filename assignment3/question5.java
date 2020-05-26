package assignments.assignment3;

public class question5 {

	public static void main(String[] args) {

		int inputSeconds, hours, minutes, seconds;
		inputSeconds=28562;
		
		seconds=inputSeconds%60;
		minutes=(inputSeconds/60)%60;
		hours=(inputSeconds/60)/60;
		
		
		System.out.println("Your inputSecond is "+inputSeconds+".");
		System.out.println("That makes "+hours+" hour(s), "+minutes+" minute(s) and "+seconds+" second(s).");
		
				
				
				
		
	}

}
