package assignements.assignements_07;

public class question_3 {

	public static void main(String[] args) {
		/*
		 * Question-3

Write a Java program to print the following pattern

1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
		 */

				
		
int rows=7;
		
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" " );
			}
			for(int k=rows;k>=i;k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
for(int i=rows;i>=1;i--) {
			
			for(int j=1;j<=i;j++) 
			{
				System.out.print(" " );
			}
			for(int k=rows;k>=i;k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		
	}

}
