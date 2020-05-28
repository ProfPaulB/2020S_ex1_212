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

        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pick a card, any card!\nEnter a whole number "
                + "between 1 and 13:");
        
        Card userCard = new Card();
        userCard.setValue(scanner.nextInt());
        
        System.out.println("Now enter a whole number between 0 and :");
        userCard.setSuit(Card.SUITS[scanner.nextInt()]);
        
        System.out.println("Is your card in the magic deck?\n...");
        
        //initialize variables to compare in following for-loop
        String userSuit = userCard.getSuit();
        String cSuit;
        int userValue = userCard.getValue();
        int cValue;
        
        for(int i = 0; i < magicHand.length; i++){
            cSuit = magicHand[i].getSuit();
            cValue = magicHand [i].getValue();
            
            //compare suits and values
            //if both match, print congrats and break loop
            if(userSuit.equals(cSuit) && userValue == cValue){
                System.out.println("We have a match! Thanks for playing!");
                
                break;
            }
            //if necessary, repeat process until match is found
            //or all seven cards are exhausted
            
            //if no match is found, this message is printed
            if (i == magicHand.length - 1){
                System.out.println("Better luck next time!");
            }
            
            scanner.close();
        }
 
    }

}
