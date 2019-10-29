package eyyyooo;

import java.util.Scanner;

public class Quadrant {

public static void main(String[] args) {

int x = 0;
int y = 0;
int kvadrant = 0;

Scanner input = new Scanner (System.in);

x = input.nextInt();

y = input.nextInt();


if(x > 0 & y > 0) {
	
	kvadrant = 1;
}


else if(x < 0 & y > 0) {
	
	kvadrant = 2;
}

else if(x < 0 & y < 0) {
	
	kvadrant = 3;
}

else {
	kvadrant = 4;
}



System.out.println(kvadrant);





}


}
