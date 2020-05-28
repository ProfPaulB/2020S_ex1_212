package pickacard;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Saad Almorad
 */
public class CardTrick
{

   public static void main (String[] args)
   {

      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         //c.setValue(insert call to random number generator here)
         Random rnd = new Random();
         c.setValue(rnd.nextInt(13) + 1);
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         c.setSuit(Card.SUITS[rnd.nextInt(3)]);
         System.out.println(c.getValue());
         System.out.println(c.getSuit());
      }

      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      Scanner scan = new Scanner(System.in);
      System.out.println("Pick a Card! (Hearts, Diamonds, Spades, Clubs)");
      String suit = scan.nextLine();
      System.out.println("Pick a number (1-13)");
      int value = scan.nextInt();




      Card magicCard = new Card();
      magicCard.setValue(7);
      magicCard.setSuit(Card.SUITS[1]);
      suit = magicCard.getSuit();
      value = magicCard.getValue();

      for (int i = 0; i < magicHand.length; i++) {
         if (suit.equals(magicHand[i].getSuit())) {
            if (value == magicHand[i].getValue()) {
               System.out.println("Congrats.. you win!!");
               break;
            }
            else if (magicHand.length - 1 == i) {
               System.out.println("You lost... try agian!");
            }
            else {

            }
         }

//      Then report the result here
      }

   }
}
