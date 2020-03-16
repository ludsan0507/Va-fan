package eyyyooo;

import java.util.Scanner;
public class talspelet {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	String guess;
	int guessIntedger;
	int tries;
	int randomint;
	System.out.println(" Välkommen till mitt talspel");
	System.out.println("");
	System.out.println(" Välj svårighets grad, Lätt eller svårt?");
	System.out.println("");

	

	
	 int easyhard = input.nextInt();
	 boolean played = true;
	 switch (easyhard) {
	 
	 case 1: 
			System.out.println(" Du har 10 försök på dig!");
			break;
	 case 2:
			System.out.println("Du har 5 fösök på dig!");
			break;
	 }
		System.out.println(" Grattis du har vunnit!!!!!!!!!");
		System.out.println(" Du har gissat fel, Försök igen!");
	}
	
} 
	
	


