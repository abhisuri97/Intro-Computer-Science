/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String [] rank = new String []{"Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
        String [] suits = new String [] {"Hearts", "Diamonds", "Clubs", "Spades"};
        int [] points = new int [] {11, 10, 10, 10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Deck deck1 = new Deck(rank,suits,points);
        System.out.println("Is deck1 empty? " + deck1.isEmpty());
        System.out.println("The size of the deck1 is " + deck1.size());
        System.out.println("Deal card from deck1 = " + deck1.deal());
        System.out.println("All the cards from deck1 " + deck1.toString());
        
        String [] rank2 = new String []{"Ace", "King", "Queen"};
        String [] suits2 = new String [] {"Hearts", "Diamonds", "Clubs", "Spades"};
        int [] points2 = new int [] {11, 12, 13};
        Deck deck2 = new Deck(rank2,suits2,points2);
        System.out.println("Is deck2 empty? " + deck2.isEmpty());
        System.out.println("The size of the deck2 is " + deck2.size());
        System.out.println("Deal card from deck2 = " + deck2.deal());
        System.out.println("All the cards from deck2 " + deck2.toString());
        
        String [] rank3 = new String []{"Card1", "Card2", "Card3"};
        String [] suits3 = new String [] {"Suit1", "Suit2", "Suit3"};
        int [] points3 = new int [] {11, 12, 13};
        Deck deck3 = new Deck(rank3,suits3,points3);
        System.out.println("Is deck3 empty? " + deck3.isEmpty());
        System.out.println("The size of the deck3 is " + deck3.size());
        
        System.out.println("Deal card from deck3 = " + deck3.deal());
        System.out.println("Deal card from deck3 = " + deck3.deal());
        System.out.println("Deal card from deck3 = " + deck3.deal());
        System.out.println("Deal card from deck3 = " + deck3.deal());
        System.out.println("Deal card from deck3 = " + deck3.deal());
        System.out.println("Deal card from deck3 = " + deck3.deal());
        System.out.println("Deal card from deck3 = " + deck3.deal());
        System.out.println("Deal card from deck3 = " + deck3.deal());
        System.out.println("Deal card from deck3 = " + deck3.deal());
        System.out.println("Is deck3 empty? " + deck3.isEmpty());
        System.out.println("All the cards from deck3 " + deck3.toString());
    }
}