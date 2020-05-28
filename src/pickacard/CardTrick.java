package pickacard;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Gurvesh Sidhu
 * 27-05-2020
 */
public class CardTrick
{

   public static void main (String[] args)
   {

      Card[] magicHand = new Card[7];

      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         //instantiating new random object rnd
         Random rnd = new Random();
         //setting card value to a random number between 1 and 13
         c.setValue(rnd.nextInt(13) + 1);
         //setting the card suits value to a random number between 0 and 3
         c.setSuit(Card.SUITS[rnd.nextInt(4)]);
         magicHand[i] = c;
      }
      //adding new lucky card with my choice of values
      Card luckycard= new Card();
      luckycard.setValue(3);
      luckycard.setSuit("Spades");

      //insert code to ask the user for Card value and suit, create their card
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter your card value");
      int inputCardValue = scan.nextInt();
      System.out.println("Enter suit");
      String inputSuit = scan.next();
      // and search magicHand here
      String value = "";
      String randomCards = "Cards in random match were \n";
      for (int j = 0; j < magicHand.length; j++) {
         if (inputCardValue == magicHand[j].getValue() && inputSuit.equalsIgnoreCase(magicHand[j].getSuit())) {
            //Then report the result here
            value = "Cards match";
         }
         else {
            value = "Sorry, your entry doesnot match random cards. Try again";
         }
      }
      System.out.println(value);
   }
}
