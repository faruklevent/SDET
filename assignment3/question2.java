package assignments.assignment3;

public class question2 {

	public static void main(String[] args) {

		String name="Faruk";
		int birthYear=1999;
		int currentYear=java.time.Year.now().getValue();
		int age=currentYear-birthYear;
		
		System.out.println("Hello, "+name+"! Based on your input, your age is "+age+" :)");
				
	}

}
