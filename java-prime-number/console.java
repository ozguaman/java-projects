import java.util.Scanner;

class Project {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("*** - IS THE ENTERED NUMBER PRIME ? - ***\n");
		
		System.out.print("Enter a number(1, 9223372036854775807):$  ");
		long a = keyboard.nextLong();

		boolean isPrime = true;

		if(a == 0 || a == 1) {
			System.out.println("The entered number isnt prime.");
		} else if ( a == 2 ) {
			System.out.println("The entered number is prime.");
		} else if(a >= 3) {
			for(int j = 2; j < a; j++) {
				if(a % 2 == 0 || a % j == 0) {
					System.out.println("The entered number isnt prime.");
					isPrime = false;
					break;
				} 
			}
			if(isPrime) {
				System.out.println("The entered number is prime."); 
			}
		} else {
			System.out.println("You entered an invalid number or character.");
		}
	}
}
