package assignements.assignements_06;

public class question_5 {

	public static void main(String[] args) {
		
		/*
		 * Question-5:

Write a program for the following logic:
Print all the odd numbers in comma-separated form from 1 till the end (you may change it):
if end = 10, OUTPUT = 1, 3, 5, 7, 9
if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11

You should use while loop and if-else statements. Note that, there should not be any comma after the last digit.
		 */
		int end=60;
		for(int i=1;i<=end;i++) {
			if(i%2==1) {
				System.out.print(i);
				if(i==end||(i+1)==end) {
					break;
				}else {
					System.out.print(", ");
				}
			}
		}
		
		
		
	}

}
