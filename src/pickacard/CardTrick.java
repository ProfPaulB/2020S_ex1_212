package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @Mark Zarak - May 30, 2020
 *
 */
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);

            magicHand[i] = c;

        }

        //insert code to ask the user for Card value and suit, create their card
        Card guessCard = new Card();
        
        System.out.print("Pick a card number (1-13): ");
        guessCard.setValue(sc.nextInt());

        System.out.print("Pick a suit (Hearts = 1, Diamonds = 2, Spades = 3, Clubs = 4): ");
        guessCard.setSuit(Card.SUITS[sc.nextInt() - 1]);

        // and search magicHand here
        //Then report the result here
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (guessCard.getValue() == magicHand[i].getValue() && guessCard.getSuit().equals(magicHand[i].getSuit())) {
                System.out.println("Congratulations! You correctly guessed the card " + magicHand[i].getValue() + " of " + magicHand[i].getSuit() + ".");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match, better luck next time!");
        }
    }
}
