package assignements.assignements_4;

public class question5 {

	public static void main(String[] args) {
		/*
		 * Question 5:

The date June 10, 1960, is special because when we write it in the following format, the month times the day equals the year:  6/10/60

Write a Java program that lets the user declare a month (in numeric form), a day, and a two-digit year. The program should then determine
 whether the month times the day is equal to the year. If so, it should display a message saying the date is magic. Otherwise, it should display
  a message saying the date is not magic.
		 */

		int day,month,year;
		day=3;
		month=8;
		year=24;
		
		if(year==day*month) {
			System.out.println("The date is magic");
		}else {
			System.out.println("date is not magic");
		}
		
		
	}

}
