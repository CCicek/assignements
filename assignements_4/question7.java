package assignements.assignements_4;

public class question7 {

	public static void main(String[] args) {
		/*
		 * Question 7:

Write a program that lets the user declare a number in seconds.

There are 60 seconds in a minute. If the number of seconds is greater than or equal to 60, the program should display the number of minutes in that many seconds.
There are 3600 seconds in an hour. If the number of seconds is greater than or equal to 3600, the program should display the number of hours in that many seconds.
There are 86400 seconds in a day. If the number of seconds is greater than or equal to 86400, the program should display the number of days in that many seconds.
		 */

		int second,minute,hour,day;
		second=36000000;
		
		if(second>=0 && second<60) {
	       System.out.println(second + " second");
	    }else if (second>=60 && second < 3600) {
			
			minute=second/60;
			second=second%60;
			System.out.println(minute + " minute " + second + " second");
		}else if(second>=3600 && second <86400 ) {
		    hour=second/3600;
		    second=second%3600;
		    System.out.println(hour + " hour " + second + " second");
		}else if(second>=86400) {
			day=second/86400;
			second=second%86400;
			System.out.println(day + " day " + second + " second");
		}
		
		
		
	}

}
