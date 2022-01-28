//tester
import java.util.Scanner;

public class WordleTester {
	public static void main(String[] args) {
		Wordle m1 = new Wordle();
		
		Scanner keyboard = new Scanner(System.in);
		int a = 1;
		int b = 1;
		System.out.println(" ");
		System.out.println("Welcome to the Worlde!");
		System.out.println("Would you like to play?");
		System.out.print("Yes or No : ");
		String playButton = keyboard.nextLine();
		while ( a == 1) {
			if (playButton.equals("Yes") || playButton.equals("yes")) {
				m1.rules();
				m1.buildBoard();
				m1.makeGuess();
				m1.guessBoard();
				m1.gameEnd();
				a = 0;
				while ( b == 1) {
					Scanner question = new Scanner(System.in);
					System.out.println("\nWould you like to play again?");
					System.out.print("Yes or No : ");
					String playAgain = keyboard.nextLine();
					if ( playAgain.equals("Yes") || playAgain.equals("yes")) {
						b = 1;
						a = 0;
						m1.rules();
						m1.buildBoard();
						m1.makeGuess();
						m1.guessBoard();
						m1.gameEnd();
					}
					else if ( playAgain.equals("No") || playAgain.equals("no"))  {
						b = 0;
						a = 0;
						System.out.println("\nThanks for playing! See you again next time!");
					}
					else {
						System.out.println("\nPlease type Yes or No.\n");
						b = 1;
					}
				}
			}
			else if (playButton.equals("No") || playButton.equals("no")) {
				System.out.println("Ok! See you next time!");
				a = 0;
			}
			else {
				System.out.print("Please type Yes or No: ");
				playButton = keyboard.nextLine();
				a = 1;
			}
		}
	}
}
