package pickacard;
import java.util.Random;
import java.util.Scanner;
/**
 * @author Aryan Chopra
 */
public class CardTrick
{
   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];
      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         Random rnd = new Random();
         c.setValue(rnd.nextInt(13) + 1);
         c.setSuit(Card.SUITS[rnd.nextInt(4)]);
         magicHand[i] = c;
      }
      
      Card luckyCard = new Card();
      luckyCard.setValue(6);
      luckyCard.setSuit("Hearts");


      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the value of Card");
      int value = scan.nextInt();
      System.out.println("Enter the Suit value");
      String suit = scan.next();


      String result = "";
      for (int j = 0; j < magicHand.length; j++) {
         System.out.println(magicHand[j].getValue() + magicHand[j].getSuit());
         if (value == magicHand[j].getValue() && suit.equalsIgnoreCase(magicHand[j].getSuit())) {
            result = "Magic card is in your hand";
            break;
         }
         else {
            result = "Better luck next time...";
         }
      }
      System.out.println(result);
   }
}
