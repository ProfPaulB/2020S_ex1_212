package pickacard;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Liam Budd-Bagnato
 */
public class CardTrick
{

   public static void main (String[] args)
   {

      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {

         Card c = new Card();

         //c.setValue(insert call to random number generator here)

         c.setValue((int) ((Math.random() * 13) + 1));

         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])

         c.setSuit(Card.SUITS[((int) (Math.random() * 4))]);

         magicHand[i] = c;
      }

      //insert code to ask the user for Card value and suit, create their card

      Scanner input = new Scanner(System.in);

      Card luckyCard = new Card();

      System.out.println("Please enter a value for the card between 1 and 13");
      luckyCard.setValue(input.nextInt());

      System.out.println("Enter your cards suit (Hearts = 1, Diamonds = 2, Spades = 3, Clubs = 4): ");
      luckyCard.setSuit(Card.SUITS[input.nextInt() - 1]);

      boolean lc = false;

      // and search magicHand here

      for (int i = 0; i < magicHand.length; i++) {
         if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())) {
            System.out.println("Your card is a match!!!");
            break;

         }
      }
      if (!lc) {
         System.out.println("Your card was not found");
      }
   }
   //Then report the result here
}
