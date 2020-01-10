package assignements.assignements_5;

public class question_03 {

	public static void main(String[] args) {
		/*
		 * Declare and assign value for a number variable

Using Multi-Branch if statements, check if the number is positive, negative or zero. Please follow the below examples and print message accordingly:


number = 10
10 is positive


number = -55
-55 is negative


number = 0
it is zero
		 */
		int number=0;
		System.out.println("number = " + number);
		if (number<0) {
			System.out.println(number + " is negative");
		}else if(number>0) {
			System.out.println(number + " is positive");
		}else if(number==0) {
			System.out.println("it is zero");
		}else {
			System.out.println("Invalid Operator");
		}
	}

}
