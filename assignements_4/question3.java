package assignements.assignements_4;

public class question3 {

	public static void main(String[] args) {
		/*
		 * Question-3
 
Any year is input by the user. Write a program to determine whether the year is a leap year or not.
Leap Years are any year that can be evenly divided by 4.  A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.

Example : 
1992      Leap Year
2000      Leap Year
1900      NOT a Leap Year
		 */
		
		int year=1900;
		
			if((year%4)==0) {
			  if(((year%400)!=0) && ((year%100)==0)) {
				System.out.println("Not a Leap Year");
			}else { 
				System.out.println("Leap Year");
			}
			  }else{
				System.out.println("Not a leap year");
			}
		
		
		
		
		
		

	}

}
