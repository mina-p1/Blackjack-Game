
import java.util.*;

// card class
public class Card {

    String suit;
    int rank;

    // set card
    public Card(String suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // return rank
    int returnRank() {
        return rank;
    }

    // face card values + Ace which is set at 11
    public String showCard() {
        String outputRank;
        if (rank == 11) {
            outputRank = "Ace";
        } else if (rank == 10) {
            outputRank = "Jack";
        } else if (rank == 10) {
            outputRank = "Queen";
        } else if (rank == 10) {
            outputRank = "King";
        } else {
            outputRank = String.valueOf(rank);
        }
        return "[" + outputRank + " of " + suit + "]";
        
    }
}
