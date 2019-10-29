package eyyyooo;

public class Laxa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*lol();
		System.out.println(max(20, 30));
		count(100);
		System.out.println(kelvin(37));
		System.out.println(fahrenheit(100));
		*/
		stair(4);
	}

	public static void lol() {
		System.out.println("HAHAHAHAHAHAHA");
	}

	public static int max(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}

	public static void count(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}

	}

	public static double kelvin(double celsius) {
		return celsius - 273.15;
	}

	public static double fahrenheit(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}

	public static void ageControl(int age) {
		if (age <= 5) {
			System.out.println("Sm�barn f�r inte g�ra n�got");
		} else if (age <= 12) {
			System.out.println("Du f�r spela fortnite");
		} else if (age <= 14) {
			System.out.println("Du �r ton�ring");
		} else if (age <= 17) {
			System.out.println("Du f�r k�ra moppe");
		} else if (age <= 20) {
			System.out.println("Du f�r k�ra bil");
		} else if (age <= 64) {
			System.out.println("Du f�r vuxen straff om du g�r n�tt dumt");
		} else if (age <= 99) {
			System.out.println("Du �r pension�r");
		} else {
			System.out.println("R.I.P?");
		}
	}

	public static void stair(int steps) {
		char x = 'X';
		char y = ' ';
		int ha = 1;
		for (int i = 1; i <= steps; i++) {
			for (int j = ha; j < steps; j++) {
				System.out.print(y);
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print(x);
			}

			ha++;
			System.out.println();
		}
	}
}
