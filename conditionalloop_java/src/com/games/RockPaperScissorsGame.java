package com.games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void showChoice(int choice) {
		switch (choice) {
		case 1: // ROCK
			System.out.println("╔════════════════════════════════════╗");
			System.out.println("║              ROCK 🪨              ║");
			System.out.println("╚════════════════════════════════════╝");
			System.out.println("            _______                 ");
			System.out.println("        ---'   ____)                ");
			System.out.println("              (_____)               ");
			System.out.println("              (_____)               ");
			System.out.println("              (____)                ");
			System.out.println("        ---.__(___)                 ");
			System.out.println("                                    ");
			System.out.println("        🪨 ROCK CRUSHES SCISSORS!    ");
			break;

		case 2: // PAPER
			System.out.println("╔════════════════════════════════════╗");
			System.out.println("║             PAPER 📄              ║");
			System.out.println("╚════════════════════════════════════╝");
			System.out.println("             _______                ");
			System.out.println("         ---'   ____)____           ");
			System.out.println("                   ______)          ");
			System.out.println("                  _______)          ");
			System.out.println("                 _______)           ");
			System.out.println("         ---.__________)            ");
			System.out.println("                                    ");
			System.out.println("        📄 PAPER COVERS ROCK!       ");
			break;

		case 3: // SCISSORS
			System.out.println("╔════════════════════════════════════╗");
			System.out.println("║           SCISSORS ✂️             ║");
			System.out.println("╚════════════════════════════════════╝");
			System.out.println("             _______                ");
			System.out.println("         ---'   ____)____           ");
			System.out.println("                   ______)          ");
			System.out.println("                __________)         ");
			System.out.println("               (____)               ");
			System.out.println("         ---.__(___)                ");
			System.out.println("                                    ");
			System.out.println("       ✂️ SCISSORS CUT PAPER!       ");
			break;
		}
		System.out.println("\n══════════════════════════════════════\n");
	}

	public static String getChoiceName(int choice) {

		 switch (choice) {
			case 1 -> {
				return "Rock";
			}
			case 2 -> {
				return "Paper";
			}
			case 3 ->{
				return "Scissors";
			}
			default -> {
				return "Invalid";
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("============================");
		System.out.println("Rock Paper Scissors");
		System.out.println("User V/s Computer");
		System.out.println("============================");

		boolean playagain = true;
		while (playagain) {
			System.out.println("Choose your option:");
			System.out.println("1. ROCK");
			System.out.println("2. PAPER");
			System.out.println("3. SCISSORS");

			int userChoice = sc.nextInt();

			if (userChoice < 1 || userChoice > 3) {
				System.out.println("That's not a valid move!");
				continue;
			}

			int computerChoice = random.nextInt(3) + 1;
			System.out.println("User choice: " + getChoiceName(userChoice));
			showChoice(userChoice);

			System.out.println("Computer choice: " + getChoiceName(computerChoice));
			showChoice(computerChoice);

			if (userChoice == computerChoice) {
				System.out.println("It's a DRAW! 🤝");
			} else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1)
					|| (userChoice == 3 && computerChoice == 2)) {
				System.out.println("YOU WIN! ");
			} else {
				System.out.println("COMPUTER WINS!");
			}

		}

	}
}