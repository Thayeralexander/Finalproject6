package finalproject6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Deck {
    private List<Card> cards;
    // Constructor to create a full deck of 52 cards
    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] faceCards = {"Jack", "Queen", "King", "Ace"};
        // Create cards 2-10
        for (String suit : suits) {
            for (int i = 2; i <= 10; i++) {
                cards.add(new Card(i, i + " of " + suit));
            }
            // Create face cards (11-14)
            for (int i = 0; i < faceCards.length; i++) {
                cards.add(new Card(i + 11, faceCards[i] + " of " + suit));
            }
        }
    }
    // Shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }
    // Draw a card (remove and return the top card)
    public Card draw() {
        return cards.remove(0);
    }
}