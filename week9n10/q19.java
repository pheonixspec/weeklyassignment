import java.util.Scanner;

public class q19 {
    public static String computerChoice() {
        int randomChoice = (int) (Math.random() * 3);
        return randomChoice == 0 ? "Rock" : randomChoice == 1 ? "Paper" : "Scissors";
    }

    public static int winner(String playerChoice, String computerChoice) {
        if (playerChoice.equalsIgnoreCase(computerChoice)) {
            return 0;
        }

        String player = playerChoice.toLowerCase();
        String computer = computerChoice.toLowerCase();

        if (player.equals("rock") && computer.equals("scissors")) {
            return 1;
        }
        if (player.equals("paper") && computer.equals("rock")) {
            return 1;
        }
        if (player.equals("scissors") && computer.equals("paper")) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of games: ");
            int games = sc.nextInt();

            int playerWins = 0;
            int computerWins = 0;

            System.out.printf("%-10s %-12s %-12s %-10s%n", "Game", "Player", "Computer", "Result");
            for (int i = 1; i <= games; i++) {
                System.out.print("Enter choice for game " + i + " (Rock/Paper/Scissors): ");
                String playerChoice = sc.next();
                String computerChoice = computerChoice();
                int result = winner(playerChoice, computerChoice);

                String outcome;
                if (result > 0) {
                    outcome = "Player";
                    playerWins++;
                } else if (result < 0) {
                    outcome = "Computer";
                    computerWins++;
                } else {
                    outcome = "Draw";
                }

                System.out.printf("%-10d %-12s %-12s %-10s%n", i, playerChoice, computerChoice, outcome);
            }

            double playerPercentage = games == 0 ? 0 : (playerWins * 100.0 / games);
            double computerPercentage = games == 0 ? 0 : (computerWins * 100.0 / games);

            System.out.println("Player wins: " + playerWins);
            System.out.println("Computer wins: " + computerWins);
            System.out.printf("Player win percentage: %.2f%%%n", playerPercentage);
            System.out.printf("Computer win percentage: %.2f%%%n", computerPercentage);
        }
    }
}