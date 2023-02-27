import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initialization
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int guessCount = 0;
        int maxGuesses = 5;

        // taking input
        System.out.println("\t\tGUESS THE NUMBER\n\n");
        System.out.println("You have " + maxGuesses + " guesses remaining.\n\n");
        while (guessCount < maxGuesses) {
            System.out.print("Enter your guess between 1 to 10: ");
            int num = scanner.nextInt();
            while (num > 10 || num < 1) {
                System.out.println("Enter number between 1 to 10.");
                num = scanner.nextInt();
            }
            guessCount++;

            // computer selected num
            int guessed = random.nextInt(10) + 1; 
            if (num < guessed) {
                System.out.println(num + " is too low, please guess a higher number.");
            } else if (num > guessed) {
                System.out.println(num + " is too high, please guess a lower number.");
            } else {
                System.out.println("Your guess is correct (" + guessed + " was the selected number).");
                return;
            }
        }

        // message part
        System.out.println("You have no remaining guesses left.");
        int guessed = random.nextInt(10) + 1;
        System.out.println("The number was " + guessed + ". Better luck next time.");
    }
}
