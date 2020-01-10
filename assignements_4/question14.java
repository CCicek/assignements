package assignements.assignements_4;

public class question14 {

	public static void main(String[] args) {
		/*
		 * Question-14:

ABC Booksellers has a book club that awards points to its customers based on the number of books purchased each month. The points are awarded as follows:

If a customer purchases 0 books, he or she earns 0 points.
If a customer purchases 1 book, he or she earns 5 points.
If a customer purchases 2 books, he or she earns 15 points.
If a customer purchases 3 books, he or she earns 30 points.
If a customer purchases 4 books or more books, he or she earns 60 points.
Write a program that lets the user declare the number of books that he or she has purchased this month and then display the number of points awarded.
		 */

		int book=10,point=0;
		
		if (book==0) {
			point=0;
		}else if(book==1) {
			point=5;
		}else if(book==2) {
			point=15;
		}else if(book==3) {
			point=30;
		}else if(book>=4) {
			point=60;
		}else {
			System.out.println("Point not calculated!");
		}
		
		System.out.println("You buy " + book + " book and your award point is " + point);
		
	}

}
