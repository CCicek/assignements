package assignements.assignements_4;

public class question11 {

	public static void main(String[] args) {
		/*
		 * The following table shows the approximate speed of sound in air, water, and steel:

Medium	Speed
Air	1100 feet per second
Water	4900 feet per second
Steel	16400 feet per second
Write a program that let the user declare a variable to enter "air", "water",  or "steel", and distance that a sound wave will travel in the medium. 
The program should then display the amount of time it will take. You can calculate the amount of time it takes sound to travel in the air with the following formula:

                  Time=Distance/1100

You can calculate the amount of time it takes sound to travel in water with the following formula:

                  Time=Distance/4900

You can calculate the amount of time it takes sound to travel in steel with the following formula:

                  Time=Distance/16400
		 */
		
		String material="steel";
		double distance,time;
		distance=1000858;
		time=3943;
		
		switch (material) {
		case "air":
			time=distance/1100;
			break;
		case "water":
			time=distance/4900;
			break;
		case "steel":
			time=distance/16400;
			break;
		}
		System.out.println("Sound will travel on " + material + " for " + distance + "feet in amount of time " + time + " seconds");
		

	}

}
