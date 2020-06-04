package aa_assignments.assignment4;
import java.util.*;

public class Question8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of packages purchased:");		
		int pckg = scan.nextInt();
		
		double disRate=0;
				
		if(pckg>=10 && pckg<=19) disRate=0.2;
		else if(pckg>=20 && pckg<=49) disRate=0.3;
		else if(pckg>=50 && pckg<=99) disRate=0.4;
		else if(pckg>=100) disRate=0.5;
		
		System.out.println("Discount : $ "+99*pckg*disRate);
		System.out.println("Total    : $ "+99*pckg*(1-disRate));
	}

}
