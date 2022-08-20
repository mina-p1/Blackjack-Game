
import java.util.*;

// dealer class
public class Dealer {

    ArrayList<Card> hand;

    
    // dealer constructor
    public Dealer() {
        hand = new ArrayList<Card>();
    }

    
    // random card is added
    public void addCard(Card card) {
        hand.add(card);
    }

    // show's one card (for dealer)
    public String showOneCard() {
        Card dealerCard = hand.get(0);
        return dealerCard.showCard();
    }

    // give total value
    public int totalValue() {
        int total1 = 0;
        int total2 = 0;
        int[] outputArray = {total1, total2};
        int output;

        for (Card i : hand) {
            if (i.returnRank() == 1) {
                
                total1 += 1; 
                total2 += 11; 
            } else if (i.returnRank() > 10) {
                
                total1 += 10;
                total2 += 10;
            } else {
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
    // the dealer's logic
    public boolean decision() {

        double hitValue;
        if (2 <= totalValue() && totalValue() <= 10) {
            hitValue = 1.00;
        } else if (11 <= totalValue() && totalValue() <= 14) {
            hitValue = 0.66;
        } else if (15 <= totalValue() && totalValue() <= 17) {
            hitValue = 0.33;
        } else if (18 <= totalValue() && totalValue() <= 19) {
            hitValue = 0.05;
        } else if (totalValue() == 20) {
            hitValue = 0.01;
        } else {
            hitValue = 0.00;
        }


        if (Math.random() < hitValue) {
            return true;
        } else {
            return false;
        }
    }
} // end of class
