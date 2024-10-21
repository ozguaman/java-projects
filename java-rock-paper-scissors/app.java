import java.util.Scanner;

class RockPaperScissors {

	public static void main(String[] args) {

		System.out.println("\n?*! ~ ROCK PAPER SCISSORS ~ !*?\n");
		System.out.println("   ~ The two sides will write their moves respectively.\n   ~ Type 'r' for rock, 's' for scissors, 'p' for paper.\n   ~ 3 times winner won the game.\n");

		Scanner keyboard = new Scanner(System.in);
		boolean run = true;

		while(run) {
			System.out.println("[g] Start Game");
			System.out.println("[q] Quit Game\n");
			System.out.print("$ /.home/game/ ~ ");
			String command = keyboard.next();

			if(command.equals("g")) {

				int playerA, playerB;
				int round, maxRound;

				maxRound = 5;
				round = 0;
				playerA = 0;
				playerB = 0;

				for(int j = 0; j <= maxRound; j++) {
					System.out.print("\nPlayer A's move(r, p, s):  ");
					String secimA = keyboard.next();
					System.out.print("Player B's move(r, p, s):  ");
					String secimB = keyboard.next();

					if(secimA.equals("r")) {
						if(secimB.equals("p")) {
							playerB++;
							round++;
							System.out.println("\nPlayer B WON!\n");
							System.out.println("SCORE");
							System.out.println("A: " + playerA + " B: " + playerB);
						} else if(secimB.equals("s")) {
							playerA++;
							round++;
							System.out.println("\nPlayer A WON!\n");
							System.out.println("SCORE");
							System.out.println("A: " + playerA + " B: " + playerB);
						} else if(secimB.equals("r")) {
							System.out.println("\nDRAW!\n");
							System.out.println("SCORE");
							System.out.println("A: " + playerA + " B: " + playerB);
							j--;
						} else {
							System.out.println("\nWrong move. Try again! 8)\n");
							j--;
						}
					} else if(secimA.equals("p")) {
						if(secimB.equals("s")) {
							playerB++;
							round++;
							System.out.println("\nPlayer B WON!\n");
							System.out.println("SCORE");
							System.out.println("A: " + playerA + " B: " + playerB + "\n");
						} else if(secimB.equals("r")) {
							playerA++;
							round++;
							System.out.println("\nPlayer A WON!\n");
							System.out.println("SCORE");
							System.out.println("A: " + playerA + " B: " + playerB + "\n");
						} else if(secimB.equals("p")) {
							System.out.println("\nDRAW!\n");
							System.out.println("SCORE");
							System.out.println("A: " + playerA + " B: " + playerB + "\n");
							j--;
						} else {
							System.out.println("\nWrong move. Try again! 8)\n");
							j--;
						}
					} else if(secimA.equals("s")) {
						if(secimB.equals("r")) {
							playerB++;
							round++;
							System.out.println("\nPlayer B WON!\n");
							System.out.println("SCORE");
							System.out.println("A: " + playerA + " B: " + playerB + "\n");
						} else if(secimB.equals("p")) {
							playerA++;
							round++;
							System.out.println("\nPlayer A WON!\n");
							System.out.println("SCORE");
							System.out.println("A: " + playerA + " B: " + playerB + "\n");
						} else if(secimB.equals("s")) {
							System.out.println("\nDRAW!\n");
							System.out.println("SCORE");
							System.out.println("A: " + playerA + " B: " + playerB + "\n");
							j--;
						} else {
							System.out.println("\nWrong move. Try again! 8)\n");
							j--;
						}
					}  else {
						System.out.println("\nWrong move. Try again! 8)\n");
						j--;
					}

					if(playerA == 3 || playerB == 3) {
						if(playerA == 3) {
							System.out.println("\nPlayer A WON THE GAME !!!\n");
							break;
						} else if(playerB == 3) {
							System.out.println("\nPlayer B WON THE GAME !!!\n");
							break;
						}
					}
				}
			} else if(command.equals("q")) {
				run = false;
			} else {
				System.out.println("\nWrong command. Try again..\n");
			}
		}
	}
}