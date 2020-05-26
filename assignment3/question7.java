package assignments.assignment3;

public class question7 {

	public static void main(String[] args) {

		int price=35;
		int change=100-price;
		int quarters=change/25;
		int dimes=(change%25)/10;
		int nickels=((change%25)%10)/5;
		
		System.out.println("Price in cents: "+price);
		System.out.println("Your change is "+quarters+" quarter(s), "+dimes+" dime(s) and "+nickels+" nickel(s).");
		
	}

}
