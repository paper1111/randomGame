package hk.edu.sjc.compsoc.itambassador.randomgame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
	
	int randomNumber;
	boolean createdRandom = false;
	private Scanner s;
	private int userInput;
	
	public static void main(String args[]) {
		RandomGame game = new RandomGame();
		game.runGame();
	}

	private void runGame() {
		if (createdRandom == false) {
			randomNumber = generateRandomCode();
			createdRandom = true;
		}
		
		s = new Scanner(System.in);
		System.out.println("Enter your guess, guesses are between 0 and 10:");
		
		try {
			userInput = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You can't enter words!");
			System.err.println("InputMismatchException: " + e.getMessage());
			System.out.println("An InputMismatchException occured! " + e.getMessage());
			System.exit(1);
		}
		
		if (userInput == randomNumber) {
			System.out.println("You won!");
		} else {
			System.out.println("You haven't entered the correct code!");
			runGame();
		}
	}

	private int generateRandomCode() {
		int code = -1;
		Random r = new Random();
		code = r.nextInt(10);
		return code;
	}
}
