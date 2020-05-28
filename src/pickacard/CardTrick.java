package pickacard;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author Jassika
 * Date:27 May,2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int)((Math.random()*13)+1));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
            
        }

        //insert code to ask the user for Card value and suit, create their card
        Scanner sc= new Scanner(System.in);
        int second = 0;
        System.out.println("Please enter the card value");
        int cardValue=Integer.parseInt(sc.nextLine());
        System.out.println("Please enter the suit among Hearts,Diamonds,Spades or Club");
        String cardSuit= sc.nextLine();
        for(int j=0;j<magicHand.length;j++)
        {
            if(luckyCard.getValue()==magicHand[j].getValue())
            {
                if(luckyCard.getSuit().equalsIgnoreCase(magicHand[j].getSuit()));
                {
                    second=2;
                }
            }
        }
        // and search magicHand here
        if(second==2)
        {
            System.out.println("Your card is in magic hand");
        }
        else
            System.out.println("Your card is not in the magic hand");
        //Then report the result here
    }

}
