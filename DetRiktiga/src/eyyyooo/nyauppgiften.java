package eyyyooo;

import java.util.Scanner;

public class nyauppgiften {


public static void main(String[] args) {

int digit ; 
int sum = 0;
int number;



Scanner input = new Scanner(System.in);

System.out.println("Skriv din ålder: ");


number = input.nextInt();

while (number !=0) {
	
	digit = number % 10; 
	sum += digit;
	number /= 10;
	
	


}


System.out.println("Du kommer dö om " + sum +" år!");




}
}
