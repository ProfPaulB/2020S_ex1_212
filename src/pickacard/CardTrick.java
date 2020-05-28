package pickacard;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Afnan Yousuf
 * @version 1.0 05/27/2020
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
//      Tracks Matching Cards
        boolean match = false;

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int)(Math.random()*13)+1);
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            //populate hand
            magicHand[i] = c;
        }

//      Hard code lucky card as 5 of Spades
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit(Card.SUITS[2]);
        // and search magicHand here
//      Testing output
//      System.out.println("Lucky Card " + luckyCard.getValue() + " " + luckyCard.getSuit());
        for(Card c : magicHand){
//          Testing output
//          System.out.println(c.getValue() + " " + c.getSuit());
            if(luckyCard.getSuit().equals(c.getSuit()) && luckyCard.getValue() == c.getValue()){
                match = true;
                break;
            }
        }
        //Then report the result here
        if(match){
            System.out.println("Your card was found in the magic hand");
        }
        else{
            System.out.println("Your card was NOT found in the magic hand");
        }
    }

}
