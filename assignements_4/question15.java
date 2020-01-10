package assignements.assignements_4;

public class question15 {

	public static void main(String[] args) {
		/*
		 * Question-15:

Write a switch-case program:

1- Declare a number

2- IF the number is 0,1 or 2 print "Low Number. IF the number is 3,4,5 print "Medium Number". IF the number is is not between 0-5 then print "Other Number"
		 */

		
		int number=85;
		
		switch(number) {
		case 1:case 2: case 0:
			System.out.println("Low Number");
			break;
		case 3 : case 4 : case 5:
			System.out.println("Medium Number");
			break;
		default:
		System.out.println("Other Number");		
		}
		
			
		
		
	}

}
