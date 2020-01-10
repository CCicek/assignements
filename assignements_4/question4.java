package assignements.assignements_4;

public class question4 {

	public static void main(String[] args) {
		/*
		 * Question-4

Telephone Bill
Write a Java program to calculate the monthly telephone bills as per the following rule: 
Minimum $200 for up to 100 calls. 
Plus $0.60 per call for the next 50 calls. 
Plus $0.50 per call for the next 50 calls. 
Plus $0.40 per call for any call beyond 200 calls.
		 */
		int call=150;
		double totalprice=0;
		
		if(call<=100) {
			totalprice=200;
		}else if(call>100 && call<=150) {
			totalprice=200+0.6*(call-100);
		}else if(call>150 && call<=200) {
			totalprice=230+0.5*(call-150);
		}else if(call>200) {
			totalprice=255+0.4*(call-200);
		}
		System.out.println("You make " + call + "calls \nYour telephone bill is $" + totalprice);
		
		
	}

}
