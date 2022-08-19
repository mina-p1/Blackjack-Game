
import java.util.*;
import java.lang.*;

public class Player {

    ArrayList<Card> hand;

    
    // player constructor
    public Player() {
        hand = new ArrayList<Card>();
    }

    //gives random card 
    public void addCard(Card card) {
        hand.add(card);
    }

    // returns total value 
    public int totalValue() {
        int total1 = 0;
        int total2 = 0;
        int[] outputArray = {total1, total2};
        int output;

        for (Card i : hand) {
            if (i.returnRank() == 1) {
                
                total1 += 1; 
                total2 += 11; 
            } 
            else if (i.returnRank() > 10) {
                
                total1 += 10;
                total2 += 10;
            } 
            else {
                total1 += i.returnRank();
                total2 += i.returnRank();
            } 
        } 
        

        
        boolean totalsEqual = total1 == total2;
        boolean trueTotal1 = total1 <= 21;
        boolean trueTotal2 = total2 <= 21;
        boolean bothTotalsViable = total1 <= 21 && total2 <= 21;

        if (totalsEqual) {
            return total1;
        } else {
            if (bothTotalsViable) {
                return Math.max(total1, total2);
            } else if (trueTotal1) {
                return total1;
            } else if (trueTotal2) {
                return total2;
            } else {
                return -1;
            } 

        }
    } 

    public String showCards() {
        int numOfCards = hand.size();
        String output = new String();
        for (int i = 0; i < numOfCards; i++) {
            Card card = hand.get(i);
            output += card.showCard() + " ";
        } 
        return output;
    } 

    public static boolean input() {
        
        Scanner scanner = new Scanner(System.in);

        boolean TorF = false;
        boolean output = false;
        while (TorF == false) {
            System.out.println("Would you like to hit or stay? Please type" 
                    + " <h> or <s>.");
            String name = scanner.nextLine();

            if (name.toLowerCase().equals("h")) {
                TorF = true;
                output = true;
            } else if (name.toLowerCase().equals("s")) {
                TorF = true;
            } else {
                System.out.println("""
                                   Your input was not valid. Please try again.
                                   """);
                System.out.println("");
            }
        }
        return output;
    }
} // end player class
