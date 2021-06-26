import java.util.Scanner;

public class YahtzeeGame {
	
	public static void main(String[] args) {
		YahtzeeDice gameDice = new YahtzeeDice();
		Scoreboard gameBoard = new Scoreboard();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 13; i++) {
			playRound(i, gameDice, gameBoard, scanner);
		}
		System.out.println("Game Over!");
		System.out.println("You final score is: " + gameBoard.getTotalScore());
	}
	
	private static void playRound(int m, YahtzeeDice dice, Scoreboard board, Scanner input) {
		dice.reset();
		dice.roll();
		System.out.println("Round " + (m + 1));
		System.out.println(dice.toString());
		
		for (int j = 1; j < 3; j++) {
			dice.reset();
			System.out.println("You have " +  (3 - j) + " turns left this round");
			System.out.println("Would you like to roll again? ");
			String userInput = input.nextLine();
			if (userInput.equalsIgnoreCase("yes"))	{
				if (j != 2)	{
					holdDice(input, dice);
					for (int l = 0; l < 5; l++) {
						if (!dice.checkIfHeld(l)) {
							dice.rollDieAt(l);
						}
					}
					System.out.println(dice.toString());
				} else {
					holdDice(input, dice);
					for (int l = 0; l < 5; l++) {
						if (!dice.checkIfHeld(l)) {
							dice.rollDieAt(l);
						}
					}
					System.out.println(dice.toString());
					System.out.println(board);
					chooseCombination(input, dice, board);
				}
			} else if (userInput.equalsIgnoreCase("no")){
				System.out.println(board);
				chooseCombination(input, dice, board);
				break;
			}
		}
	}
	
	private static void chooseCombination(Scanner scan, YahtzeeDice setOfDice, Scoreboard scores) {
		System.out.println("Make a Choice: ");
		int userChoice = Integer.parseInt(scan.nextLine());
		while (scores.checkIfUsed(userChoice - 1)) {
			System.out.println("You already did this combination. Try again: ");
			System.out.println("Make a Choice: ");
			userChoice = Integer.parseInt(scan.nextLine());
		}
		scores.updateScoreboard(userChoice - 1, setOfDice.getDiceValues());
		System.out.println(scores);
	}
	
	private static void holdDice(Scanner sc, YahtzeeDice groupOfDice) {
		for (int k = 0; k < 5; k++) {
			System.out.println("Do you want to hold die # " + (k + 1) + "?");
			if (sc.nextLine().equalsIgnoreCase("yes")) {
				groupOfDice.hold(k);
			} else {
				continue;
			}
		}
	}
}
