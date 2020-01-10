package assignements.assignements_4;

public class question1 {

	public static void main(String[] args) {
		/*
		 *Question-1
The body mass index (BMI) is used to estimate the risk of weight-related problems based on a subject's height and mass. It was designed by the mathematician Adolphe Quetelet in the 1800s and
 is sometimes referred to as the Quetelet index. The BMI is computed as:

       BMI = mass / (height * height)

In this formula, mass is in kilograms and height is in meters. The health risk associated with a BMI value is

      - Underweight<18.5

      - Normal Weight>=18.5 and <25

      - Overweight>=25 and <30

      - Obese>=30

In this case study, the users input their weight in pounds and height in feet and inches. 
The program then outputs the BMI and associated health risk. To do this we must first make our program convert from pounds to kilograms. One kilogram is 2.2 pounds.
 Additionally, the program must convert height in feet and inches to meters. If we convert the height to all inches, then we can multiply by 0.0254 to convert inches to meters.

Sample Output:

Your weight in pounds:  150

Your height in feet followed by a space then additional inches: 5 5

Your BMI is 25.01349811736

Your risk factory is Overweight 
		 */
		double kg,meter,BMI;
		int pound,inches,feet,inch2;
		kg=115;
		meter=1.75;
		
		pound=(int) (kg*2.2);
		inches=(int) (meter/0.0254);
		feet=(int)(inches/12);
		inch2=(int)(inches%12);
		
		BMI=kg/(meter*meter);
		
		System.out.println("Your weight in pounds " + pound);
		System.out.println("Your height in inches " + feet + "ft " + inch2 + "inch");
		System.out.println("Your BMI is " + BMI);
		
		System.out.println("*********************************");
		
		if(BMI<18.5) {
			System.out.println("You must eat dude \nYour resolution is  Underweight");
		}else if(BMI>=18.5 && BMI <25) {
			System.out.println("You are doing good man \nYour resolution is Normal Weight");
		}else if(BMI>=25 && BMI<30) {
			System.out.println("You must start sport bro \nYour resolution is Overweight");
		}else if(BMI>30) {
			System.out.println("Ohh man!! start running now!! \nYour resolution is Obese");
		}else { 
			System.out.println("You enter Invalid operator check your height and weight again;)");
		}
		
		
	}

}
