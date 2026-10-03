import java.util.Scanner;

public class GuessMe {

    public static void guessingNumberGame() {
        System.out.println("Welcome to Number Guessing Game!!");

        // Generate a random number
        int num = 1 + (int) (100 * Math.random());
        //Number of attempts
        int k = 5;
        int attempts = k;

        Scanner sc = new Scanner(System.in);
        System.out.println("A number has been chosen between 1 and 100");
        System.out.println("You have " + k + " attempts to guess the number");
        System.out.println("All the Best!!");

        for (int i = 0; i < k; i++) {
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == num) {
                System.out.println("You guessed it correctly!");
                sc.close();
                return;
            } else if (guess < num) {
                System.out.println("The number is too low!");
            } else {
                System.out.println("The number is too high!");
            }

            attempts--;
            System.out.println("Attempts left: " + attempts);
        }
        System.out.println("You lost! Correct number is => " + num);
        System.out.println("Better luck next time!");

        sc.close();
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}