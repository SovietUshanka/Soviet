//Name: Jacob Wenner
//CS 110: Section 11
//Lab 9

import java.util.Random;
import java.util.Scanner;
public class Assignment9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		assignment9Menu(input);
	}

	public static void guessTheNumber(Scanner input){

		System.out.println("Guess The Number Challenge");
		System.out.println("I have chosen a number between 0 and 30!");
		System.out.println("Make A Guess:");
		Random random = new Random();
		int randomNumber = random.nextInt(31);
		int guessNumber = input.nextInt();
		int tries = 1;
		input.nextLine();

		while (guessNumber != randomNumber) {

			if (guessNumber > randomNumber) {
				System.out.println("Too High!");
				System.out.println("Make Another Guess:");
				guessNumber = input.nextInt();
			}

			if (guessNumber<randomNumber) {
				System.out.println("Too Low!");
				System.out.println("Make Another Guess:");
				guessNumber = input.nextInt();
			}

			tries++;
		}

		System.out.println("Correct!");
		System.out.println("My number was " + randomNumber + "!");
		System.out.println("It only took you " + tries + " tries!");
		input.nextLine();

	}

	public static void rectangleMaker(int length, int width) {

		int x;
		int y;

		for (x = 0; x < width; x++) {
			System.out.print("*");	
		}

		System.out.print("  ");

		for(x = 0; x < width; x++) {
			System.out.print("*");
		}

		System.out.println("");

		for(y = 1; y < length - 1; y++) {
			for(x = 0; x < width; x++) {
				System.out.print("*");
			}

			System.out.print("  ");

			for(x = 1; x < width; x++) {
				if (x == 1)
					System.out.print("*");
				if (x == width - 1)
					System.out.println("*");
				else 
					System.out.print(" ");
			}
		}

		for (x = 0; x < width; x++){
			System.out.print("*");
		}

		System.out.print("  ");

		for (x = 0; x < width; x++) {
			System.out.print("*");
		}

		System.out.println("");


	}

	public static int exitCheck (Scanner input) {
	
		System.out.println("Are you sure you would like to exit? Type 'Exit' to exit the program.");
		String userInput = input.next();
		String exitWord = "Exit";

		int option = 1;

		/*if (userInput.equals(exitWord)){
			option = 1;
			
			
		}

		else{
			option = 0;
		}
		 */
		return option;

	}

	public static void assignment9Menu (Scanner input) {
		System.out.println("Welcome to Assignment 9");
		System.out.println("Please Choose an Option:");
		System.out.println("1. Guess The Number Challenge");
		System.out.println("2. Make A Rectangle");
		System.out.println("3. Exit");
		int selection = input.nextInt();
		int option = 0;


		do {

			 {

			if (selection == 1) {
				guessTheNumber(input);
				assignment9Menu(input);
				System.out.println("");
			}

			if (selection == 2) {
				System.out.println("Enter the Length");
				int length = input.nextInt();

				System.out.println("Enter the Width");
				int width = input.nextInt();

				rectangleMaker(length, width);
				assignment9Menu(input);
			}

			if (selection == 3) {
				
				option = exitCheck(input);
				if (option == 0) {
					selection = 3;
					assignment9Menu(input);
				}
			}


			}

		}while (option != 1 );








	}
}
