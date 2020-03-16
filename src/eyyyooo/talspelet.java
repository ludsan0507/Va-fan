package eyyyooo;

import java.util.Scanner;

public class talspelet {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean played = true;
		while(played) {
			int randomint;
			System.out.println(" Välkommen till mitt talspel");
			System.out.println("");
			System.out.println(" Välj svårighets grad, Lätt eller svårt?");
			System.out.println("");
	
			int easyhard = input.nextInt();
			switch (easyhard) {
	
			case 1:
				System.out.println(" Du har 10 försök på dig! Gissa ett tal mellan 1-25");
				randomint = 0 + (int) (Math.random() * ((25 - 0) + 1));
			
				for (int tries = 0; tries < 10; tries++) {
					int gissning = input.nextInt();
					if (gissning == randomint) {
						System.out.println(" Grattis du har vunnit!!!!!!!!!");
						break;
					} 
					else if (gissning > randomint)
						System.out.println(" Du har gissat för högt, Försök igen!");
					else if (gissning < randomint)
						System.out.println(" Du har gissat för lågt, Försök igen!");
	
				}
				break;
			case 2:
				System.out.println("Du har 5 fösök på dig! Gissa ett tal mellan 1-50");
				randomint = 0 + (int) (Math.random() * ((50 - 0) + 1));
				
				for (int tries = 0; tries < 5; tries++) {
					int gissning = input.nextInt();
					if (gissning == randomint) {
						System.out.println(" Grattis du har vunnit!!!!!!!!!");
						break;
					} 
					else if (gissning > randomint)
						System.out.println(" Du har gissat för högt, Försök igen!");
					else if (gissning < randomint)
						System.out.println(" Du har gissat för lågt, Försök igen!");
						
				}

				break;
				
			}
			System.out.println(" Vill du spela igen? 1 för ja 2 för nej");
			int playagain = input.nextInt();
			if (playagain == 2) {
				played = false;
			}
		}
	}
}
