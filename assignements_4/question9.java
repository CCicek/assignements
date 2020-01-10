package assignements.assignements_4;

public class question9 {

	public static void main(String[] args) {
		/*
		 * Question-9:

The Fast Freight Shipping Company charges the following rates:

Weight of Package	Rate per 500 Miles Shipped
2 pounds or less	$1.10
Over 2 pounds but not more than 6 pounds	$2.20
Over 6 pounds but not more than 10 pounds	$3.70
Over 10 pounds	$3.8
The shipping charges per 500 miles are not prorated. For example,
 if a 2-pound package is shipped 550 miles, the charges would be $2.20. Write a program that lets the user declare the weight of a package and then displays the shipping charges.
		 */

		
		double weight,charge,rate;
		int mile;
		mile=2444;
		weight=6;
	    charge=1;
		if(mile%500!=0) {
			rate=mile/500+1;
		}else {
			rate=mile/500;
		}
		//System.out.println(rate);
		
		if (weight<= 2) {
			charge=1.1;
		}else if(weight>2 && weight<=6) {
			charge=2.2;
		}else if(weight>6 && weight<=10) {
			charge=3.7;
		}else if(weight>10) {
			charge=3.8;
		}
		
		System.out.println(weight + " pound package for " + mile + " miles \nYou must pay $" + (charge*rate) );
		
	}

}
