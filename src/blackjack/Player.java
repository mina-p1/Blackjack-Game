
import java.util.*;
import java.lang.*;

public class Player {

    ArrayList<Card> hand;

    
    
    public Player() {
        hand = new ArrayList<Card>();
    }

    
    public void addCard(Card card) {
        hand.add(card);
    }

    // gives total value 
    public int totalValue() {
        int total = 0;
        int total2 = 0;
        int[] outputArray = {total, total2};
        int output;

        for (Card i : hand) {
            if (i.returnRank() == 1) {
                
                total += 1; 
                total2 += 11; 
            } 
            else if (i.returnRank() > 10) {
                
                total += 10;
                total2 += 10;
            } 
            else {
                total += i.returnRank();
                total2 += i.returnRank();
            } 
        } 
        

        
        boolean totalsEqual = total == total2;
        boolean trueTotal = total <= 21;
        boolean trueTotal2 = total2 <= 21;
        boolean bothTotalsViable = total <= 21 && total2 <= 21;

        if (totalsEqual) {
            return total;
        } else {
            if (bothTotalsViable) {
                return Math.max(total, total2);
            } else if (trueTotal) {
                return total;
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
        
        Scanner in = new Scanner(System.in);

        boolean TorF = false;
        boolean output = false;
        while (TorF == false) {
            System.out.println("Would you like to hit or stay? Please type" 
                    + " <h> or <s>.");
            String name = in.nextLine();

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
