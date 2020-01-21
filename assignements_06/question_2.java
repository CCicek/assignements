package assignements.assignements_06;

public class question_2 {

	public static void main(String[] args) {

		int n=1;
		
		for(int i=0;i<1000;i+=n) {
			n=i+n;
			System.out.print(i +",");
			System.out.print(n + ",");
		}
		
	}

}
