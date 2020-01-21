package assignements.assignements_06;

public class question_7 {

	public static void main(String[] args) {
		/*
		 * Question-7:

Print the following output using nested for loops.

4       3       2      1

     3       2      1

         2       1

              1
		 */

		int rows=4;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i;j++) 
			{
				System.out.print("    " );
			}
			for(int k=rows;k>=i;k--)
			{
				System.out.print(k + "      ");
			}
			System.out.println();
		}
		
	}
}
