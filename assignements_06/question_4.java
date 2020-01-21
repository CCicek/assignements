package assignements.assignements_06;

public class question_4 {

	public static void main(String[] args) {
		/*
		 * Question-4:

Write a program to calculate the sum of the numbers from 1 till upper bound.
If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

You should use a while loop.
		 */

		int total=0;
		int upperBound=100;
		int tolal=0;
		for(int i=1;i<=upperBound;i++) {
			System.out.print(i +  " + ");
			total=total+i;
		}
		System.out.println(" = " + total );
		
	}

}
