package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author hallelen
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for(int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)(Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            magicHand[i] = c;
            
            //printing out card values for debugging purposes
            //System.out.println(c.getValue() + " of " + c.getSuit());
        }

        //create luckyCard object with predetermined suit and value
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");
        
        //initialize variables to compare in following for-loop
        String luckySuit = luckyCard.getSuit();
        String cSuit;
        int luckyValue = luckyCard.getValue();
        int cValue;
        
        System.out.println("Your lucky card is the " + luckyValue + " of "
                + luckySuit + ".\nIs the lucky card in the magic deck?\n...");
        
        for(int i = 0; i < magicHand.length; i++){
            cSuit = magicHand[i].getSuit();
            cValue = magicHand [i].getValue();
            
            //compare suits and values
            //if both match, print congrats and break loop
            if(luckySuit.equals(cSuit) && luckyValue == cValue){
                System.out.println("We have a match! Thanks for playing!");
                
                break;
            }
            //if necessary, repeat process until match is found
            //or all seven cards are exhausted
            
            //if no match is found, this message is printed
            if (i == magicHand.length - 1){
                System.out.println("Better luck next time!");
            }
        }
 
    }

}
