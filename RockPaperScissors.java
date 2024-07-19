import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerWin = 0;
        int computerWin = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Choose [r]ock, [p]aper or [s]cissors:");
            String playerMove = scanner.nextLine();

            if (playerMove.equals("r") || playerMove.equals("rock")) {
                playerMove = "Rock";

            } else if (playerMove.equals("p") || playerMove.equals("paper")) {
                playerMove = "Paper";

            } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
                playerMove = "Scissors";
            } else {
                System.out.println("Invalid Input. Try Again...");
                return;
            }

            Random random = new Random();
            int computerRandomNumber = random.nextInt(4);
            String computerMove = "";

            switch (computerRandomNumber) {
                case 1:
                    computerMove = ROCK;
                    break;
                case 2:
                    computerMove = PAPER;
                    break;
                case 3:
                    computerMove = SCISSORS;
                    break;
            }

            System.out.printf("The computer chose %s.%n", computerMove);

            if ((playerMove.equals("Rock") && computerMove.equals(SCISSORS)) ||
                    (playerMove.equals("Paper") && computerMove.equals(ROCK)) ||
                    (playerMove.equals("Scissors") && computerMove.equals(PAPER))) {

                playerWin++;
                System.out.println("You win current game.");
            } else if ((playerMove.equals("Rock") && computerMove.equals(PAPER)) ||
                    (playerMove.equals("Paper") && computerMove.equals(SCISSORS)) ||
                    (playerMove.equals("Scissors") && computerMove.equals(ROCK))) {

                computerWin++;
                System.out.println("You lose current game.");
            } else {
                System.out.println("This game was a draw.");
            }

            System.out.println();
        }

        if (playerWin > computerWin) {
            System.out.println();
            System.out.printf("You win with %d:%d points.", playerWin, computerWin);

        } else if (computerWin > playerWin) {
            System.out.println();
            System.out.printf("Computer win with %d:%d points.", computerWin, playerWin);
        }

    }


    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
}