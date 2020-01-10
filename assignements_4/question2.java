package assignements.assignements_4;

public class question2 {

	public static void main(String[] args) {
		/*
		 * Question-2

Tax Calculator:

    - Let user enter his income

    - Calculate the tax amount according to below table

    - Print the tax amount

Income	Tax Ratio
income ≤150,000,000	%25
income ≤ 300,000,000	%30
income ≤ 600,000,000	%35
income ≤ 1,200,000,000	%40
income > 1,200,000,000	%50
Sample Output-1

Your Income : 1500

The tax amount you have to pay : 375.0

Sample Output-2

Your Income : 1200000

The tax amount you have to pay : 300000.0

Note: IF Your Income is 200,000,000, your 
tax will be calculated this way: %25 for 
150,000,000 and %30 for the rest of the amount
 which is 50,000,000
		 */

		int income=2000000;
		double tax=0;
		
		if(income<=150_000_000) {
			tax=income*0.25;
		}else if(income>150_000_000 && income <=300_000_000) {
			if(income==200_000_000) {
				tax=(150_000_000*0.25)+(50_000_000*0.30);
			}else {
				tax=income*0.3;
			}
		}else if(income>300_000_000 && income<=600_000_000) {
			tax=income*0.35;
		}else if(income>600_000_000 && income<=1_200_000_000) {
			tax=income*0.40;
		}else if(income>1_200_000_000) {
			tax=income*0.5;
		}else {
			System.out.println("Invalid Operator");
		}
		tax=(int)tax;
		System.out.println("Your income : " + income);
		System.out.println("The tax amount you have to pay :" + tax);
		
		
	}

}
