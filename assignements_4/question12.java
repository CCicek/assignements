package assignements.assignements_4;

public class question12 {

	public static void main(String[] args) {
		/*
		 * Question-12:

An internet service provider has three different subscription packages for its customers:

Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour

Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour

Package C: For $19.95 per month unlimited access is provided

Write a program that calculates a customer's monthly bill. 
It should let the user declare the letter of the package the customer has purchased (A, B, or C) and the number of hours that were used. It should then display the total charges.
		 */

		double hour,total;
		hour=50;
		total=1;
		char pack= 'A';
		
		switch(pack) {
		
		case 'A' :{
			
			if(hour>10) {
		total=9.95+((hour-10)*2);						
			}else {
				total=9.95;
			}
		}
		break;
		case 'B' :{
			
			if(hour>20) {
				total=13.95+((hour-20)*1);						
			}else {
				total=13.95;	
			}
		}
		break;
		case 'C' :{
				total=19.95;	
			}
		}
		
		
		System.out.println("You are using package " + pack + " and you used " + hour + " hour internet\nYour Total charge is $" +total);
		
		
	}

}
