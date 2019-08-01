package rockpaperscissors;
import java.util.Scanner;

public class EventHandlers {
	
	static Scanner userInput = new Scanner(System.in);
	static boolean validInput;
	static String userPick;
	static int parsedUserPick;
	static String[] choices = {"rock","paper","scissors"};
	
	static void userPick() {
		System.out.println("Pick from these following choices:\n1)Rock\n2)Paper\n3)Scissors");
		validInput = false;
		while (validInput == false) {
			try {
				String userPick = userInput.nextLine();
				parsedUserPick = Integer.valueOf(userPick);
				if (parsedUserPick < 1 | parsedUserPick > 3) {
					System.out.println("Please pick a number from 1-3, corresponding to your previous options.");
				} else {
					validInput = true;
				}
			} catch (Exception e){
				System.out.println("You fool! Pick a *number* from the list!");
			}
		}
	}
	static void Game() {
		int computerPick = ComputerGenerator.computerPick();
		System.out.println("The computer picked " + (computerPick + 1) + ", or " + choices[computerPick] + ".");
		switch ((parsedUserPick - 1) - computerPick) {
			case (-2):
				System.out.println("You've won!");
				break;
			case (1):
				System.out.println("You've won!");
				break;
			case (0):
				System.out.println("You've tied!");
				break;
			default:
				System.out.println("You've lost.");
		}
	}
	static void tryAgain() {
		System.out.println("Would you like to play again? Yes or no?");
		userPick = userInput.nextLine();
		if (userPick.equalsIgnoreCase("yes")) {
			System.out.println();
			userPick();
			Game();
			tryAgain();
		} else if (userPick.equalsIgnoreCase("no")) {
			System.out.println("Well, thanks for playing!");
		} else {
			System.out.println("That's invalid! Again...\n");
			tryAgain();
		}
	}
}