package assignements.assignements_4;

public class question13 {

	public static void main(String[] args) {
		/*
		 * Question-13:

A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:

                $.10 each for less than 20 checks

                $.08 each for 20-39 checks  

                $.06 each for 40-59 checks

                $.04 each for 60 or more checks

Write a program that lets the user declare the number of checks written for the month. The program should then calculate and display the bank's service fees for the month. 
		 */
		
		double check,servicefee;
		check=40;
		servicefee=1000;
		
		if (check<20 && check>=0) {
			servicefee=10+(0.1*check);
		}else if(check>=20 && check<40) {
			servicefee=10+(0.08*check);
		}else if(check>=40 && check<60) {
			servicefee=10+(0.06*check);
		}else if(check>=60) {
			servicefee=10+(0.04*check);
		}else {
			System.out.println("Invalid Operator");		
		}
		
		System.out.println("You use " + check + " check\nYour monthly service fee is $" + servicefee);
		
		
		
	}

}
