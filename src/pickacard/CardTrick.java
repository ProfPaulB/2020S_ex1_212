package pickacard;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Elie Khuzam
 * date: 27/05/2020
 */
public class CardTrick
{

   public static void main (String[] args)
   {
      Card[] magicHand = new Card[7];
      Random rnd = new Random();

      for (int i = 0; i < magicHand.length; i++) {
         int value = rnd.nextInt(13) + 1;
         int rank = rnd.nextInt(3);
         magicHand[i] = new Card(Card.SUITS[rank], value);
         System.out.println(magicHand[i].getSuit() + " " + magicHand[i].getValue());
      }

      Card luckyCard = new Card("Diamonds", 7);
      String magicCard = "";

      for (int i = 0; i < magicHand.length; i++) {
         if (magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equals(luckyCard.getSuit())) {
            magicCard = "You Win!!";
            break;
         }
         magicCard = "Try Again!!";
      }
      System.out.println(magicCard);




//      Scanner scan = new Scanner(System.in);
//      System.out.println("Pick a Card!!");
//      int value = scan.nextInt();
//      String suit = scan.nextLine();

//      String magicCard = "";
//      for (int i = 0; i < magicHand.length; i++) {
//         if (magicHand[i].getValue() == value && magicHand[i].getSuit().equals(suit)) {
//            magicCard = "You Win!!";
//            break;
//         }
//         magicCard = "Try Again!!";
//      }
//      System.out.println(magicCard);
//insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here
   }
}
