package pickacard;
import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @auther Qian Li
 */
public class CardTrick {

    public static void main(String[] args) {
        Random random = new Random();
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
        do{
        c.setValue(random.nextInt(13)+1);
        c.setSuit(Card.SUITS[random.nextInt(4)]);
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        } while (cardCompare(i, (c.getValue()-1), c.getSuit()));      
        magicHand[i]=c;
        //System.out.println(magicHand[i].getValue()+", "+magicHand[i].getSuit());
        
        }
    
    Card cardUser = new Card();
    Scanner in = new Scanner(System.in);
    System.out.println("Please input the Card Value:");
    int userValue = in.nextInt();
    System.out.println("Please input the Card Suit:");
    String userSuit = in.next();
    cardUser.setValue(userValue);
    cardUser.setSuit(userSuit);
    //System.out.println(cardUser.getValue()+", "+cardUser.getSuit());
    cardMatch(cardUser, magicHand);
    
  }
  
  public static boolean cardCompare(int i, int value, String suit){
    boolean result = false;
    int s;
    if (suit == "Hearts")
      s=0;
    else if (suit == "Diamonds")
      s=1;
    else if (suit == "Spades")
      s=2;
    else
      s=3;
     boolean[][][] isEqual = new boolean[7][13][4];
    isEqual[i][value][s]= true;
    for (int j=0; j<=i; j++){
      if (isEqual[j][value][s]&&(j!=i)){
        result = true;
        isEqual[i][value][s]= false;
        break;
      }
    }
    return result;
  }
  
  public static void cardMatch(Card user, Card[] hand){
      int k=0;
      while(user.getSuit()!=hand[k].getSuit()&&user.getValue()!=hand[k].getValue()){
      ++k;
      if (k==7)
        break;
    }
     //System.out.println(k);
    if (k<7)
        System.out.println("The user's card is in the magic hand!");
    else
        System.out.println("The user's card is not in the magic hand!");
  }
  
}
      
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
