package pickacard;
import java.util.Scanner;
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
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         int genValue;
         String genSuit;
      do{
        genValue = generatorValue();
        genSuit = generatorSuit();
      } while (cardCompare(i, genValue, genSuit));      
      c.setValue(genValue+1);
      c.setSuit(genSuit);
      magicHand[i]=c;
    }
    
    Card cardUser = new Card();
   
    int userValue;
    String userSuit;
    System.out.println("Please input the Card Value:");
    Scanner in1 = new Scanner(System.in);
    userValue = in1.nextInt();
    cardUser.setValue(userValue);
    System.out.println("Please input the Card Suit:");
    Scanner in2 = new Scanner(System.in);
    userSuit = in2.next();
    cardUser.setSuit(userSuit);
    int k=0;
    while(cardUser!=magicHand[k]){
      k++;
      if (k==7)
        break;
    }
    if (k<7)
        System.out.println("The user's card is in the magic hand!");
    else
        System.out.println("The user's card is not in the magic hand!");
  }


  public static int generatorValue(){
    int value = ((int)(Math.random()*100))%13;
    return value;
  }
  
  public static String generatorSuit(){
    String[] SUITS={"Hearts","Diamonds","Spades","Clubs"};
    int i = ((int)(Math.random()*100))%4;
    return SUITS[i];
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
}
      
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
