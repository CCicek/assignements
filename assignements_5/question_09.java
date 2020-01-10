package assignements.assignements_5;

public class question_09 {

	public static void main(String[] args) {
		/*
		 * In this task, you need to slice an integer and print numbers one by one from the new line.


Example # 1
Your number: 12345

-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

Your number: 45678

-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8
		 */
		int number=65443;
		System.out.println("-Display prompt: " + (number/10000));
		System.out.println("-Display prompt: " + (number/1000)%10);
		System.out.println("-Display prompt: " + (number/100)%10);
		System.out.println("-Display prompt: " + (number/10)%10);
		System.out.println("-Display prompt: " + (number%10));
		
		
		

	}

}
