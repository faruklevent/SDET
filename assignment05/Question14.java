package aa_assignments.assignment05;

public class Question14 {

	public static void main(String[] args) {
	/*	Write nested loop to draw this pattern
		##          
		#  #        
		#   #       
		#    #      
		#     #    
		#      #    
		#        #  
	*/
		
		for(int i=1; i<=7; i++) {
			
			System.out.print("#");
			
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			
			System.out.println("#");
			
		}
		
	}

}
