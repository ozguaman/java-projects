import java.util.Scanner;

class Project {
	public static void main(String[] args) {
		boolean run = true;

		while(run) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("*-- PRODUCT SYSTEM FOR MARKET --*\n");
            
			String userName = "admin";
			int password = 123;

			System.out.println("[1] Open the System");
			System.out.println("[2] Quit");
			System.out.print("(1,2): $ ");
			int choice = keyboard.nextInt();

			switch(choice) {
				case 1:
					System.out.println("\nUsername and password are included in the source code.\n");
					System.out.print("Username: ");
					String enteredUserName = keyboard.next();
					System.out.print("Password: ");
					int enteredPass = keyboard.nextInt();		

					if(enteredUserName.equals(userName)  && enteredPass == password) {
						System.out.println("Login successful! \n\n");
						System.out.print("If you want to enter a product into the system, type '/login'.:$ ");
						String komut = keyboard.next();

						boolean run2 = true;

						while(run2) {
							if(komut.equals("/login")) {
								System.out.print("How many products do you want to add? ");
								int enteredProduct = keyboard.nextInt();
								double totalPrice = 0;
								String productList = "\n";

								for(int i = 1; i<= enteredProduct; i++) {
									System.out.print("Product name: ");
									String name = keyboard.next();
									System.out.print("Number of products: ");
									int number = keyboard.nextInt();
									System.out.print("Product price(for example; 2, 6,5): "); 
									double price = keyboard.nextDouble();

									totalPrice = totalPrice + price*number;
									productList =  productList + "| " + "[" + i + "] " + name + " | " + "#" + number + " | " + price + "$ | " + "Total: " + number*price + "$ |\n" + "---------------------------------------------------------\n";

									System.out.println("Added Product: " + name + ", #" + number + ", " + price + "$\n");

									if(i == enteredProduct) {
										System.out.println("-$- PRODUCTS -$-");
										System.out.println("----------------------------\n");
									    System.out.print("---------------------------------------------------------");
										System.out.println(productList);
										System.out.println("Total Price: " + totalPrice + "$\n");
										System.out.println("----------------------------");


										System.out.println("[1] Change Products");
										System.out.println("[2] Back to Menu	");
										System.out.print("(1,2): $ ");
										int choice2 = keyboard.nextInt();

										switch(choice2) {
											case 1:
												break;
											case 2:
												run2 = false;
										}
									}
								}
							} else {
								System.out.println("You entered the command incorrectly. Please try again.");
							}
						}	
					} else {
						System.out.println("You entered your username or password incorrectly.");
						continue;
					}
					break;
				case 2:
					run = false;
					break;
			}
		}
	}
}
