package assignements.assignements_5;

public class question_07 {

	public static void main(String[] args) {
		/*
		 * Write a program that will return mid number out of three numbers. No need to do any calculations.


Declare and assign 3 int variables: num1, num2, num3.

Example 1:

num1 = 14

num2 = 52

num3 = 25

Medium value is: 25

Example 2:

num1 = 140

num2 = 34

num3 = 1

Medium value is: 34
		 */

		int num1,num2,num3;
		
		num1=1300;
		num2=6500;
		num3=6060;
		
		System.out.println("num1 = " + num1 + "\nnum2 = " + num2 + "\nnum3 = " + num3); 
		
		      if (num1>num2 && num1>num3) {
			if(num2>num3) {
				System.out.println("Medium value is : " + num2);
			}else {
				System.out.println("Medium value is : " + num3);
			}
		}else if (num2>num1 && num2>num3) {
			if(num1>num3) {
				System.out.println("Medium value is : " + num1);
			}else {
				System.out.println("Medium value is : " + num3);
			}
		}else if (num3>num2 && num3>num1) {
				if(num2>num1) {
				System.out.println("Medium value is : " + num2);
		}else {
				System.out.println("Medium value is : " + num1);
	      	}
		 }
		
		
	 }	
	}

