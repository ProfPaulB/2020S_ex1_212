package pickacard;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Krishna Taneja
 * @author Paul Bonenfant
 * 27 May, 2020
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick
{
   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      Card[] magicHand = new Card[7];
      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(rand.nextInt(13) + 1);
         c.setSuit(Card.SUITS[rand.nextInt(4)]);
         magicHand[i] = c;
         //c.setValue(insert call to random number generator here)
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
      }
      System.out.println("Enter Suit of Card : ");
      String s = sc.next();//Card Suit inserted by user.
      System.out.println("Enter Card number : \n 1 for Ace\n 11 for Jack\n 12 for Queen\n 13 for King");
      int c = sc.nextInt();//Card number inserted by user.

      for (int k = 0; k < magicHand.length; k++) {
         System.out.println(magicHand[k].getValue() + " of " + magicHand[k].getSuit());
         if (c == magicHand[k].getValue() && s.equalsIgnoreCase(magicHand[k].getSuit())) {
            System.out.println("Found your Card ");
            break;
         }
         else {
            System.out.println("Card not found, Try again");
         }
      }
      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here
   }

}
