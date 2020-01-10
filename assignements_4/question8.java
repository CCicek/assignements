package assignements.assignements_4;

public class question8 {

	public static void main(String[] args) {
		/*
		 * A software company sells a package that retails for $99. Quantity discounts are given according to the following table:

Quantity	Discount
10-19	20%
20-49	30%
50-99	40%
100 or more	50%
Write a program that lets the user declare the number of packages purchased. The program should then display the amount of discounts(if any) and the total amount of the purchase after discount.
		 */
		int price,quantity;
		double totalprice,totalPriceAfterDiscount,amountOfDiscount,discount=0.1;
		price=99;
		quantity=55;
		totalprice=quantity*price;
		
		if(quantity>=10 && quantity<20) {
			discount=0.2;
			amountOfDiscount=(int)(discount*price*quantity);
			totalPriceAfterDiscount=totalprice-amountOfDiscount;
			System.out.println("You buy " + quantity + " package total price is $" + totalprice + " and your discount is $" +  amountOfDiscount + " Total amoun of purchase after discount is $" + totalPriceAfterDiscount);
		}else if(quantity<10 && quantity>0) {
			discount=0;
			amountOfDiscount=(int)(discount*price*quantity);
			totalPriceAfterDiscount=totalprice-amountOfDiscount;
			System.out.println("You buy " + quantity + " package total price is $" + totalprice + " and your discount is $" +  amountOfDiscount + " Total amoun of purchase after discount is $" + totalPriceAfterDiscount);
		}else if(quantity>=20 && quantity <50) {
			discount=0.3;
			amountOfDiscount=(int)(discount*price*quantity);
			totalPriceAfterDiscount=totalprice-amountOfDiscount;
			System.out.println("You buy " + quantity + " package total price is $" + totalprice + " and your discount is $" +  amountOfDiscount + " Total amoun of purchase after discount is $" + totalPriceAfterDiscount);
		}else if(quantity>=50 && quantity<100) {
			discount=0.4;
			amountOfDiscount=(int)(discount*price*quantity);
			totalPriceAfterDiscount=totalprice-amountOfDiscount;
			System.out.println("You buy " + quantity + " package total price is $" + totalprice + " and your discount is $" +  amountOfDiscount + " Total amoun of purchase after discount is $" + totalPriceAfterDiscount);
		}else if(quantity>=100) {
			discount=0.5;
			amountOfDiscount=(int)(discount*price*quantity);
			totalPriceAfterDiscount=totalprice-amountOfDiscount;
			System.out.println("You buy " + quantity + " package total price is $" + totalprice + " and your discount is $" +  amountOfDiscount + " Total amoun of purchase after discount is $" + totalPriceAfterDiscount);
		}else {
			System.out.println("Wrong operator");
		}
		
		
		
	}

}
