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
        //Use the cardCompare() to insure there's no duplicate in the magic hand
        magicHand[i]=c;
        //[for debug]System.out.println(magicHand[i].getValue()+", "+magicHand[i].getSuit());
        }
    
    Card cardUser = new Card();
    cardUser.setValue(validValue());
    cardUser.setSuit(validSuit());
    //prompt user to input valid value and suit
    //[for debug]System.out.println(cardUser.getValue()+", "+cardUser.getSuit());
    cardMatch(cardUser, magicHand);
    //Match the user's card and output the result
    }
  
  public static boolean cardCompare(int i, int value, String suit){
    boolean result = false;
    int s;
    if ("Hearts".equals(suit))
      s=0;
    else if ("Diamonds".equals(suit))
      s=1;
    else if ("Spades".equals(suit))
      s=2;
    else
      s=3;
    
    Card.isEqual[i][value][s]= true;
    for (int j=0; j<=i; j++){
      if (Card.isEqual[j][value][s]&&(j!=i)){
        result = true;
        Card.isEqual[i][value][s]= false;
        break;
      }
    }
    return result;
  }
  //cardCompare() determines if there's duplicate in magicHand[]
  
  public static void cardMatch(Card user, Card[] hand){
      int i;
      boolean flag = false;
      for(i=0;i<7;i++){
        if ((user.getSuit().toLowerCase().equals(hand[i].getSuit().toLowerCase())) 
              && (user.getValue()==hand[i].getValue())){
        System.out.println("The user's card is in the magic hand!");
        flag = true;
        break;
        }
        else{
        continue;
        }
      }
      //System.out.println(i);
      if (i==7 && flag == false){
          System.out.println("The user's card is not in the magic hand!");
      }
  }
  //cardMatch() match ther user's card with magicHand[] and output the result
  
  public static int validValue(){
      boolean flag = true;
      int num=0;
      Scanner in = new Scanner(System.in);
      while(flag){
          System.out.println("Please input the Card Value:");
          String input = in.next();
          if (isInt(input)){
              num=Integer.parseInt(input);
              if(num<1||num>13){
                  System.out.println("Error: Value must be between 1 and 13.");
              }
              else{
                  flag=false;
              }
          }
          else
              System.out.println("Error: Please input an Integer.");
          }
          return num;
      }
  //validValue() insures a valid input for value 
  
public static String validSuit(){
      boolean flag = true;
      String input="";
      Scanner in = new Scanner(System.in);
      while(flag){
          System.out.println("Please input the Card Suit:");
          input = in.next();
          //System.out.println(input);
          if(!"hearts".equals(input.toLowerCase())
             &&!"diamonds".equals(input.toLowerCase())
             &&!"spades".equals(input.toLowerCase())
             &&!"clubs".equals(input.toLowerCase())){   
              System.out.println
              ("Error: Suit must be \"Hearts\", \"Diamonds\", \"Spades\", or \"Clubs\".");
          }
          else{
              flag=false;
          }
      }
          return input;
      }
  //validSuit() insures a valid input for suit
      
  public static boolean isInt(String input){
    try{
      Integer.parseInt(input);
      return true;
    }
    catch (java.lang.NumberFormatException ex){
      return false;
    }
  }
  //isInt() helps the validValue get an integer value
  
}
      
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
