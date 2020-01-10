package assignements.assignements_4;

public class question10 {

	public static void main(String[] args) {
		/*
		 * Question-10:

Write a program that lets the user declare a number of calories and fat grams in a food item. 
The program should display the percentage of calories that come from fat. One gram of fat has 9 calories; therefore:

                Calories from fat = Fat grams * 9

The percentage of calories from fat can be calculated as follows:

                Calories from fat/Total Calories

If the calories from fat are less than 30 percent of the total calories of the food, it should also display a message indicating the food is low in fat.

Note: The number of calories from fat can not be greater than the total number of calories in the food item. 
If the program determines that the number of calories from fat is greater than the number of calories in the food item, it should display an error message indicating that the input is invalid.
		 */

		double fatgr,calfrfat,totalcal,perc;
		
		fatgr=10000;
		totalcal=100000;
		
		calfrfat=fatgr*9;
		perc=calfrfat/totalcal;
		
		if(perc<0.3) {
			System.out.println("The food is low in fat");
		}
		
		if(perc>1) {
			System.out.println("ERROR!!! YOUR INPUT IS INVALID");
		}
		
		System.out.println("%" + (perc*100) + " of calories coming from fat");
		
	}

}
