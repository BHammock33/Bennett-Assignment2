package com.coderscampus.assignment;

import java.util.Random;
import java.util.Scanner;

public class BennettA2 {

	public static void main(String[] args) {
		int answer, guess;
		final int MAX = 100;
		Scanner in = new Scanner(System.in);
		Random target = new Random();
		boolean win = false;
		answer = target.nextInt(MAX) + 1;
		int chances = 5;
		//System.out.println(answer);

		while (!win && chances > 0) {
			System.out.println("Guess a number between 1 and 100: ");
			guess = in.nextInt();
			chances--;
			if (guess <= 0 || guess >= 101) {
				System.out.println("Guess outside of range, please guess again");
				chances++;
			}
			else if (guess > answer && chances != 0) {
				System.out.println("Too high, try again");
			} else if (guess < answer && chances != 0) {
				System.out.println("Too low, try again");
			} else if (guess == answer) {
				System.out.println("You guessed the number");
				win = true;
			} else if (chances == 0 && win != true) {
				System.out.println("Bummer you lose the number was: " + answer);
				break;
			}
		}
	}

}
