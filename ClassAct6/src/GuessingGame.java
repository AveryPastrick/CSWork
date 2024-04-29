import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100) + 1;

        int guess;
        int numberOfGuesses = 0;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess a number between 1 and 100 or enter 'q' to quit.");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Quitter! The number was: " + randomNumber);
                break;
            }

            try {
                guess = Integer.parseInt(input);

                numberOfGuesses++;

                if (guess == randomNumber) {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("Number of guesses: " + numberOfGuesses);
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");
            }
        }

        scanner.close();
    }
}

