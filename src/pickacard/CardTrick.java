package pickacard;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Sandeep Chahal
 * Date: 27 May, 2020
 */
public class CardTrick
{

   public static void main (String[] args)
   {

      Card[] magicHand = new Card[7];

      Card luckyCard = new Card();
      luckyCard.setValue(4);
      luckyCard.setSuit("spades");


      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         Random rnd = new Random();
         c.setValue(rnd.nextInt(13) + 1);
         c.setSuit(Card.SUITS[rnd.nextInt(4)]);
         magicHand[i] = c;
      }
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter Card Value");
      int cardValue = scan.nextInt();
      System.out.println("Enter Card Suit");
      String cardSuit = scan.next();
      String result = "";
      for (int k = 0; k < magicHand.length; k++) {
         if (cardValue == magicHand[k].getValue() && cardSuit == magicHand[k].getSuit()) {
            result = "Cards match";
         }
         else {
            result = "Magic didn't work";

         }

      }
      System.out.println(result);
   }
}
