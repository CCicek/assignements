package assignements.assignements_3;

public class Question_4 {

	public static void main(String[] args) {
		/*Declare 2 variables (Num1, Num2)

Swap values between Num1 and Num2

Display new values of Num1 and Num2

      Sample output:

      n1=10
      n2=20

      ----------

      n1=20
      n2=10 */
		
		int num1,num2;
		
		num1=88;
		num2=99;
		
		System.out.println("n1 = " + num1  + " \nn2 = " + num2  );
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("\n\n\nn1 = " + num1 + " \nn2 = " + num2  );
		

	}

}
