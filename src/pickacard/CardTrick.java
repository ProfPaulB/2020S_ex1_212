package pickacard;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Juan Garzon 2020/05/27
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            
            int randomValue = (int) (1 + 13 * Math.random());
            int randomSuit = (int) (4 * Math.random());
            
//            System.out.println("Card #" + i);
//            System.out.println("Value " + value);
//            System.out.println("Suit " + suit);
//            System.out.println();
            
            //c.setValue(insert call to random number generator here)
            c.setValue(randomValue);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i] = c;
        }

        for (Card card: magicHand)
        {
            System.out.printf("%d of %s %n", card.getValue(), card.getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the value [1 to 13]");
        int pickedValue = Integer.parseInt(input.nextLine());
        System.out.println("Please enter the suit [0 for Hearts " +
            "1 for Diamonds, 2 for Spades, 3 for Clubs]");
        int pickedSuit = Integer.parseInt(input.nextLine());
        
        Card pickedCard = new Card();
        pickedCard.setValue(pickedValue);
        pickedCard.setSuit(Card.SUITS[pickedSuit]);
        
        System.out.printf("You have selected the %d of %s %n", pickedCard.getValue(), pickedCard.getSuit());
        // and search magicHand here
        boolean isFound = false;
        for (Card card: magicHand)
        {            
            if(card.equals(pickedCard))
            {
                isFound = true;
            }
        }
        
        //Then report the result here
                
        if(isFound)
        {
            System.out.println("Congratulations your card is in the magic hand!!!");
        }
        else
        {
            System.out.println("Sorry, your card is not in the magic hand");
        }
        
    }

}
