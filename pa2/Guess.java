// Guess.java
// Billy Kwong
// bqkwong
// pa2
// Interactive guessing game

import java.util.Scanner;

class Guess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Declaration of variables
		int n, x, y, z;
		n =(int)(Math.random()*10+1);

		//Begin the game
		System.out.println();
		System.out.println("I'm thinking of an integer in the range 1 to 10.  You have three guesses.");
		System.out.println();

		//Enter first guess
		System.out.print("Enter your first guess: ");
		x = sc.nextInt();
		
		//Tells you if number entered is low, high, or correct
		if (x<n) {
			System.out.println("Your guess is too low.");
		}else if (x==n) {
			System.out.println("You win!");
			System.exit(0);
		}else {
			System.out.println("Your guess is too high.");
		}
		System.out.println();
	
		//Enter second guess
		System.out.print("Enter your second guess: ");
		y = sc.nextInt();
		
		//Tells you if number entered is low, high, or correct
		if (y<n) {
			System.out.println("Your guess is too low.");
		}else if (y==n) {
			System.out.println("You win!");
			System.exit(0);
		}else {
			System.out.println("Your guess is too high.");
		}
		System.out.println();

		//Enter third guess
		System.out.print("Enter your third guess: ");
		z = sc.nextInt();
		
		//Tells you if number entered is low, high, or correct
		if (z<n) {
			System.out.println("Your guess is too low.");
		} else if (z==n) {
			System.out.println("You win!");
			System.exit(0);
		}else {
			System.out.println("Your guess is too high.");
		}
		
		//Prints end message if game is lost.
		System.out.println();
		System.out.print("You lose.  The number was " +n+ ".");
		System.out.println();
		System.out.println();
	}
}
