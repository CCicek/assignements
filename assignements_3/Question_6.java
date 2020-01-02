package assignements.assignements_3;

public class Question_6 {

	public static void main(String[] args) {
		/*Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.

A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup of coffee has approximately 160 mg of caffeine.

In one gram there is 1000 mg.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose*/
		
	int cola,cafe,lethal,overdose;
	
	lethal=10000;
	cola=34;
	cafe=160;
	overdose=lethal/cola;
	
	System.out.println("12-ounce cola has " + cola + "mg cafeine");
	System.out.println("It would take about " + overdose + " drinks for lethal overdose" );
	
	overdose=lethal/cafe;
	
	System.out.println("\n\n16-ounce cup of coffee has " + cafe + "mg cafeine");
	System.out.println("It would take about " + overdose + " drinks for lethal overdose" );
		
		
	}

}
