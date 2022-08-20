
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack!");
        System.out.println();

        
        Player player = new Player();

        
        Dealer dealer = new Dealer();

        ArrayList<Card> deck = new ArrayList<Card>();

        // this controls if the game is over
        boolean gameOver = false;
        boolean playerIn = true;
        boolean dealerIn = true;

        // Suit array
        String[] suits = {"♠", "♥", "♦", "♣"};
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                deck.add(new Card(suits[suit], rank));
            }
        }

        // Gives 2 cards to player
        player.addCard(deck.remove((int) (Math.random() * deck.size())));
        player.addCard(deck.remove((int) (Math.random() * deck.size())));
        System.out.println("Your cards: " + player.showCards() 
                + "\nYour total: " + player.totalValue() + "\n");

        // Gives the dealer his cards and shows one
        dealer.addCard(deck.remove((int) (Math.random() * deck.size())));
        dealer.addCard(deck.remove((int) (Math.random() * deck.size())));
        System.out.println("One of the dealer's cards: " + dealer.showOneCard()
                + "\n");

        System.out.println();
        System.out.println();

        while (!gameOver) {
            if (playerIn) {
                // Main loop
                boolean hit = Player.input();

                if (hit == true) {
                    // player's cards
                    player.addCard(deck.remove((int) (Math.random() * 
                            deck.size())));
                    System.out.println("\nYour cards: " + player.showCards()
                            + "\nYour total: " + player.totalValue() + "\n");

                } else {
                    playerIn = false;
                }
            }

            if (dealerIn) {
                // dealer's decision (hit or stay)
                boolean hit = dealer.decision();
                if (hit == true) {
                    dealer.addCard(deck.remove((int) (Math.random() * 
                            deck.size())));
                    System.out.println("The dealer hit.");
                } else {
                    System.out.println("The dealer is out.");
                    dealerIn = false;
                }
            }

            System.out.println();
            System.out.println();

            // if player loose
            if (player.totalValue() > 21) {
                gameOver = true;
                System.out.println("You busted! Dealer wins!");
                break;
            }

            // if player wins
            if (dealer.totalValue() > 21) {
                gameOver = true;
                System.out.println("The dealer busted! Player wins!");
                break;
            }

            // the player and dealer loose
            if (!playerIn && !dealerIn) {
                gameOver = true;
                break;
            }
        }

        // sums up the round
        System.out.println("Your total: " + player.totalValue());
        System.out.println("Dealer's total: " + dealer.totalValue());
        if (player.totalValue() > dealer.totalValue()
                && player.totalValue() <= 21) {
            System.out.println("Player wins!");
        } else if ((dealer.totalValue() > player.totalValue()
                && dealer.totalValue() <= 21) || (dealer.totalValue() <= 21
                && player.totalValue() > 21)) {
            System.out.println("Dealer wins!");
        } else if (player.totalValue() == dealer.totalValue()) {
            if (player.totalValue() == 21) {
                System.out.println("Both you and the dealer won!");
            }
            System.out.println("Tie!");
        }

        System.out.println("\nGame Over!");

    }
}
