import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

class passwordGenerator {
	
	public static void main(String[] args) throws InterruptedException {

		while(true) {
			Scanner keyboard = new Scanner(System.in);
			Random rand = new Random();
			
			String passwordArray[] = {
				"0","1","2","3","4","5","6","7","8","9",
				"a","b","c","d","e","f","g","h","i","j","k","l","m",
				"n","o","p","q","r","s","t","u","v","w","x","y","z",
				"A","B","C","D","E","F","G","H","I","J","K","L","M",
				"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"
			}; // all possible characters and numbers we can use in password that we will create.
			
			System.out.println("\n[1] Create a Random Password");
			System.out.println("[2] How the Program Generates the Password?");
			System.out.println("[0] Quit");

			System.out.print("\n> ");
			String password = "";
			
			if(keyboard.hasNextInt()) { // if type of choice variabale is integer
				int choice = keyboard.nextInt();
																						
				if(choice == 1) {
					Cls();
					System.out.print("\nEnter the number of digits: $~ ");
					int number = keyboard.nextInt();

					for(int i = 1; i <= number; i++) {
						int randomFromArray = rand.nextInt(passwordArray.length);
						String addPasswordCharacter = passwordArray[randomFromArray];
						password += addPasswordCharacter; // We make the 'password' variable a String because 'passwordArray' is an array which type of String.  

						if(i == number) { // Now we created all of the password. Time to show it to user.
							BigInteger possibilities = BigInteger.valueOf(passwordArray.length).pow(number); // 62 ^ number = 62x62x62x62x62x62...
							Cls();
							System.out.println("Password is being created..");
							Thread.sleep(1500);
							Cls();
							Draw(number);

							System.out.println("|" + password + "|");

							Draw(number);

							System.out.println("\nIf cyberbullies try to crack your password, they will have to deal with " + possibilities+ " different password combinations!");
							break;
						}
					} 
				} else if(choice == 2) {
					Cls();
					System.out.println("\nThe program generates a password with the number of digits you want. Each digit can contain up to 62 different characters, creating a highly secure password.\n");
					System.out.println("n = Number of digits of your password");
					System.out.println("Number of possible password combinations = n ^ 62");
					pressEnter();
					Cls();
				} else if(choice == 0) {
					Cls();
					System.out.println("Wait a second..");
					Thread.sleep(2000);
					Cls();
					break; // closing program.
				} else {
					System.out.println("\nWrong choice. Try again.");
				}
			} else { // if type of choice variable isnt integer
				Cls();
				System.out.println("\nYou didnt enter a number. The numbers you can enter are 1, 2 and 0. Press enter to continue.");
			}
		} 
	}

	public static void pressEnter() {
		System.out.print("\nPress enter to continue..");
		Scanner read = new Scanner(System.in);
		read.nextLine();
	} 

	public static void Draw(int number) {
		for(int k = 1; k <= number + 2; k++) { // draw ----... just aesthetic
			System.out.print("-");

			if(k == number + 2) {
				System.out.println();
			}
		}
	}
	
	public static void Cls() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (Exception E){
			System.out.println(E);
		}
	}
}
