/*
* Brijette Baboolal
* 06/08/2025
* BaboolalRockPaperScissorsl.java
*
* This program randomly generate the number of 1, 2, or 3 with 1 being Rock, 
* 2 being Paper, and 3 being Scissors. This will be the computer’s selection 
* in the game. Then, the program should prompt the user to enter a value of 1, 2, or 3. 
* This will be the user’s selection in the game. Next, the program should display a clear 
* readable message displaying both the computer’s selection, the user’s selection, and the 
* results of the game played. 
*/

import java.util.Scanner;
import java.util.Random;

public class BaboolalRockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate computer's choice
        int computerChoice = random.nextInt(3) + 1;

        // Display choices to the user
        System.out.println("Let's play Rock-Paper-Scissors!");
        System.out.println("Enter your choice:");
        System.out.println("1 - Rock");
        System.out.println("2 - Paper");
        System.out.println("3 - Scissors");
        System.out.print("Your choice: ");

        int userChoice = scanner.nextInt();

        // Check for valid input
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid input. Please enter 1, 2, or 3.");
            return;
        }

        // Display choices
        System.out.println("Computer chose: " + choiceToString(computerChoice));
        System.out.println("You chose: " + choiceToString(userChoice));

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }

    // Helper method to convert number to string
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }
}
