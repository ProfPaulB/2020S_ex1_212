package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Mark Zarak - May 31, 2020
 *
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Card[] magicHand = new Card[7];
        
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit(Card.SUITS[1]);

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);

            magicHand[i] = c;

        }

        // and search magicHand here
        //Then report the result here
        boolean found = false;
        for (Card magicHand1 : magicHand) {
            if (luckyCard.getValue() == magicHand1.getValue() && luckyCard.getSuit().equals(magicHand1.getSuit())) {
                System.out.println("Congratulations! You correctly guessed the card " + magicHand1.getValue() + " of " + magicHand1.getSuit() + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match, better luck next time!");
        }
    }
}
