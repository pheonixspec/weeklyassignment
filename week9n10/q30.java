import java.util.Scanner;

public class q30 {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    public static String[][] distributeDeck(String[] deck, int cardsPerPlayer, int players) {
        if (cardsPerPlayer * players > deck.length) {
            throw new IllegalArgumentException("Not enough cards in the deck");
        }

        String[][] result = new String[players][cardsPerPlayer];
        int index = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                result[i][j] = deck[index++];
            }
        }

        return result;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] deck = initializeDeck();
            shuffleDeck(deck);

            System.out.print("Enter number of players: ");
            int players = sc.nextInt();
            System.out.print("Enter cards per player: ");
            int cardsPerPlayer = sc.nextInt();

            String[][] distributed = distributeDeck(deck, cardsPerPlayer, players);
            printPlayers(distributed);
        }
    }
}