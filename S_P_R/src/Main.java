import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //score
            int i;
            int playerScore =0;
            int computerScore=0;

        System.out.println("\n\n\nSCISSOR ✂, PAPER 📄 AND ROCK 🤘 GAME");

        for(i=1;i<=3;i++)
        {
            //  take user input as S P R
            Scanner inputObj = new Scanner(System.in);
            System.out.println("\n please enter S , P ,R :");
            char userMove = inputObj.next().charAt(0);
            while (userMove != 's' && userMove != 'p' && userMove != 'r') {
                System.out.println("Invalid input. Please enter S, P, or R:");
                userMove = inputObj.next().charAt(0);
            }
            System.out.println("USER MOVE  >>\t " + userMove);

            // make computer to take move either S ,P ,R
            char[] maxMove = {'s', 'p', 'r'};
            Random random = new Random();
            int number = random.nextInt(3);
            char computerMove = maxMove[number];
            System.out.println("COMPUTER MOVE  >>\t " + computerMove);

            // output

            if (userMove == computerMove) {
                System.out.println(" :|   DRAW!  :|");
            } else if ((userMove == 's' && computerMove == 'p') ||
                    (userMove == 'p' && computerMove == 'r') ||
                    (userMove == 'r' && computerMove == 's')) {
                System.out.println(" :)  USER WINS! :) ");
                playerScore++;
            } else {
                System.out.println(" :(  COMPUTER WINS! :(");
                computerScore++;
            }
        }

        if(playerScore==computerScore)
        {
            System.out.println("\n\nITS A TIE! ^_^");
        }
        else if (computerScore>playerScore)
        {
            System.out.println("\n\nSORRY !! COMPUTER WON :((┬┬﹏┬┬)");
        }
        else
        {
            System.out.println("\n\nYAHOOO!!! YOU WON (❁´◡`❁)");
        }
    }
}