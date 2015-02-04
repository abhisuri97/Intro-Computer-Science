/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
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
	}
}