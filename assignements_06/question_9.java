package assignements.assignements_06;

public class question_9 {

	public static void main(String[] args) {
		/*
		 * Question-9:

Print following chessboard using nested for loops.
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W

NOTE:
1. Total 8 rows and 8 columns.
2. "W" and "B" are in alternate positions (row-wise or column-wise), you will not find consecutive W or B.
		 */
		String a="W";
		String b="B";
		for(int i=0;i<8;i++) {
			if(i%2==0) {
			for(int j=0;j<4;j++) {
				System.out.print(a + b);
			}System.out.println();
			}else {
				for(int j=0;j<4;j++) {
					System.out.print(b + a);
			}
			System.out.println();
		}

	}
	}
}
