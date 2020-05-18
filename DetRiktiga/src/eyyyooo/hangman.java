package eyyyooo;

import java.util.ArrayList;
import java.util.Scanner;

public class hangman {

	private static Scanner input = new Scanner(System.in);

	private static ArrayList<String> _wordlist = new ArrayList<String>();
	private static ArrayList<String> _wrongGuess = new ArrayList<String>();
	private static ArrayList<String> _hangman = new ArrayList<String>();

	private static String progressWord = "";
	
	private static final int _maxTries = 10;

	public static void main(String[] args) {
		printWelcome();
		play();
		printGoodbye();
	}

	private static void play() {
		while (true) {
			int difficulty = getDifficulty();
			if (difficulty != 0) {
				startGame(difficulty);
				System.out.println("Vill du spela igen! 1 = Yes Något annat nummer= No");
				int response = getValidIntegerInput();
				input.nextLine();
				if (response == 1){
					_wrongGuess.clear();
					continue;
				}
			}
			break;
		}
	}
	
	private static void startGame(int difficulty) {

		switch (difficulty) {
		case 1:
			easyGame();
			break;
		case 2:
			normalGame();
			break;
		case 3:
			hardGame();
			break;
		default:
			System.out.println("De stress idiot!! Ta ett nummer mellan 1-3!! ");
			break;
		}
	}
	private static void easyGame() {
		populateEasyWordList();
		gameCore(_maxTries);
	}
	private static void normalGame() {
		populatenormalWordList();
		gameCore(_maxTries);
	}
	private static void hardGame() {
		populatehardWordList();
		gameCore(_maxTries);
	}
	private static void gameCore(int maxTries) {
		String answer = getRandomWord();
		_hangman();
		initProgress(answer);
		for (int tries = 0; tries < maxTries; tries++) {
			char guess = getGuess();
			if (answer.toLowerCase().contains(Character.toString(guess).toLowerCase())) {
				printStatus(true, answer, guess, maxTries - tries);
				if (progressWord.equals(answer.toLowerCase())) {
					System.out.println(" Du gissa rätt!");
					tries--;
					break;
				}
				tries--;
				continue;
			}
			if (_wrongGuess.contains(Character.toString(guess).toLowerCase())) {
				System.out.println(" Du har redan gissat denna bokstaven.");
				tries--; 
				continue;
			}
			printStatus(false, answer, guess, maxTries - tries);
		}
	}
	private static void initProgress(String answer) {
		progressWord = "";
		for (int i = 0; i < answer.length(); i++) {
			progressWord += "_";
		}
	}
	private static void printChar(String answer, char guess) {
		char[] Word = progressWord.toCharArray();
		for (int i = 0; i < answer.length(); i++) {
			if (answer.toLowerCase().charAt(i) == Character.toLowerCase(guess) ) {
				Word[i] = guess;
			}
		}
		progressWord = String.copyValueOf(Word);
		System.out.println(progressWord);
	}

	private static void printStatus(boolean correctGuess, String answer, char guess, int triesLeft) {
		if(correctGuess) {
			System.out.println("Din gissning var: " + guess);
			printChar(answer, guess);
			System.out.println("");
			System.out.println(triesLeft);
			System.out.println(_hangman.get(10 - triesLeft - 1));
			
		}
		else {
			System.out.println("Din gissning var: " + guess);
			System.out.println(progressWord);
			
			_wrongGuess.add(Character.toString(guess));
			System.out.println(_wrongGuess.toString());
			System.out.println(triesLeft);
			System.out.println(_hangman.get(10 - triesLeft));
		}
	}
	private static String getRandomWord() {
		int range = _wordlist.size();
		int randomIndex = (int) (Math.random() * range);
		return _wordlist.get(randomIndex);
	}
	private static void populateEasyWordList() {
		_wordlist.clear();
		_wordlist.add("Spel");
		_wordlist.add("Bil");
		_wordlist.add("Dator");
	}

	private static void populatenormalWordList() {
		_wordlist.clear();
		_wordlist.add("Datorspel");
		_wordlist.add("Sportbil");
		_wordlist.add("Biosalong");
	}

		private static void populatehardWordList() {
		_wordlist.clear();
		_wordlist.add("Ambassadsekreterare");
		_wordlist.add("Lastbilschafför");
		_wordlist.add("Försäkringstjänsteman");
	}
	private static char getGuess() {
		String inText = "";
		while (true) {
			System.out.println("Gissa en bokstav.");
			inText = input.nextLine();
			if (inText.length() != 1) {
				System.out.println("Får bara vara en ");
				continue;
			}
			return inText.toCharArray()[0];
		}
	}
	private static int getDifficulty() {
		System.out.println("Välj en svårighets grad 1-3 (1 = Lätt, 2 = mellan, 3 = svår)");
		int difficulty = getValidIntegerInput();
		input.nextLine();
		return difficulty;
	}
	private static int getValidIntegerInput() {
		while (true) {
			if (!input.hasNextInt()) {
				System.out.println("Skriv ett nummer, idiot!");
				input.nextLine();
				continue;
			}
			return input.nextInt();
		}
	}
	private static void _hangman() {
		_hangman.clear();
		_hangman.add("   _________\n  /         \\\n /           \\\n|             |");
		_hangman.add("     |\n     |\n     |\n     |\n   __|______\n  /         \\\n /           \\\n|             |");
		_hangman.add("     ______\n     |\n     |\n     |\n     |\n   __|______\n  /         \\\n /           \\\n|             |");
		_hangman.add("     ______\n     |    |\n     |\n     |\n     |\n   __|______\n  /         \\\n /           \\\n|             |");
		_hangman.add("     ______\n     |    |\n     |    O\n     |\n     |\n   __|______\n  /         \\\n /           \\\n|             |");
		_hangman.add("     ______\n     |    |\n     |    O\n     |    |\n     |\n   __|______\n  /         \\\n /           \\\n|             |");
		_hangman.add("     ______\n     |    |\n     |    O\n     |   /|\n     |\n   __|______\n  /         \\\n /           \\\n|             |");
		_hangman.add("     ______\n     |    |\n     |    O\n     |   /|\\\n     |\n   __|______\n  /         \\\n /           \\\n|             |");
		_hangman.add("     ______\n     |    |\n     |    O\n     |   /|\\\n     |   /\n   __|______\n  /         \\\n /           \\\n|             |");
		_hangman.add("     ______\n     |    |\n     |    O\n     |   /|\\\n     |   / \\\n   __|______\n  /         \\\n /           \\\n|             |");
	}

	
	private static void printWelcome() {
		System.out.println("Välkommen till hängagubben!");
	}

	private static void printGoodbye() {
		System.out.println("Hade gött!");
	}
}