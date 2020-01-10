package assignements.assignements_4;

public class question6 {

	public static void main(String[] args) {
		/*
		 * Question 6:

Scientists measure an object's mass in kilograms and its weight in Newton. If you know the amount of mass that an object has, you can calculate its weight, in Newtons, with the following formula:

             Weight = Mass * 9.8
Write a program that asks the user to enter an object's mass, and then calculate its weight. If the object weighs more than 1000 Newtons, display a message indicating that it is too heavy.
 If the object weighs less than 10 Newtons, display a message indicating that the object is too light.

		 */

		double weight,mass=10;
		
		weight=mass*9.8;
		
		if(weight>1000) {
			System.out.println("Object is to heavy");
		}else if(weight<10) {
			System.out.println("Object is too light");
		}else {
			System.out.println("object is normal weight");
		}
		
		
	}

}
