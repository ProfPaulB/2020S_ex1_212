package pickacard;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Hardik Juneja
 */
public class CardTrick
{
   Card[] magicHand = new Card[7];
   Random rnd = new Random();
   int n = 0;
   String s = "";
   String result = "";

   public static void main (String[] args)
   {
      Scanner sc = new Scanner(System.in);
      CardTrick ct = new CardTrick();
      ct.inputCard(sc);
      ct.makeArray();
      System.out.println(ct.showCards());
      System.out.println(ct.result());
      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here
   }

   public Card[] makeArray ()
   {
      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         c.setValue(rnd.nextInt(13) + 1);
         c.setSuit(Card.SUITS[rnd.nextInt(4)]);
         magicHand[i] = c;
      }
      return magicHand;
   }

   public String result ()
   {
      for (int i = 0; i < magicHand.length; i++) {
         if (n == magicHand[i].getValue() && s.equalsIgnoreCase(magicHand[i].getSuit())) {
            result = " Congratulations you have won !!";
            break;
         }
         else {
            result = "Sorry try again later !!";
         }
      }
      return result;
   }

   public void inputCard (Scanner sc)
   {
      System.out.println("Enter a suite (clubs, spades, diamonds, hearts)");
      s = sc.nextLine();
      System.out.println("Enter a number between 1 to 13 (note that Ace = 1, Jack -11, Queen =12, King = 13)");
      n = sc.nextInt();
   }

   public String showCards ()
   {
      String s = "";
      for (int i = 0; i < magicHand.length; i++) {
         s += (magicHand[i].getValue() + " of " + magicHand[i].getSuit() + "\n");
      }
      return s;
   }

}
