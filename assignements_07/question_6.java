package assignements.assignements_07;

public class question_6 {

	public static void main(String[] args) {
		/*
		 * Question-6
Write a Java program to print the following pattern

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
		 */

		int rows=6;
		int columns=6;
		
		for(int i=1;i<=rows;i++) {
			int k =columns-1;
			int m = i;
			for(int j = i;j>=1;j--){
				System.out.print(m + " ");
				m=m+k--;
			}
			System.out.println();
		}
		
	}

}
