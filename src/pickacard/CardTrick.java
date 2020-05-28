package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Afnan Yousuf
 * @version 1.0 05/27/2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        boolean match = false;

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            //populate hand
            magicHand[i] = c;
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner in = new Scanner(System.in);
        System.out.println("Enter card value 1-13");
        int cardVal = in.nextInt();
        System.out.println("Enter suit value 0-3 [hearts,diamond,spades,clubs]");
        int suitVal = in.nextInt();
        Card user = new Card();
        user.setValue(cardVal);
        user.setSuit(Card.SUITS[suitVal]);
        // and search magicHand here
//      Testing output
//      System.out.println("User Card " + user.getValue() + " " + user.getSuit());
        for(Card c : magicHand){
//          Testing output
//          System.out.println(c.getValue() + " " + c.getSuit());
            if(user.getSuit().equals(c.getSuit()) && user.getValue() == c.getValue()){
                match = true;
                break;
            }
        }
        //Then report the result here
        if(match){
            System.out.println("Your card was found in the magic hand");
        }
        else{
            System.out.println("Your card was NOT found in the magic hand");
        }
    }

}