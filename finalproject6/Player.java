package finalproject6;

import java.util.ArrayList;
import java.util.List;
public class Player {
    private List<Card> hand;
    private int score;
    private String name;
    // Constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.score = 0;
    }
    // Describe the player's hand
    public void describe() {
        System.out.println("Player: " + name);
        for (Card card : hand) {
            card.describe();
        }
    }
    // Flip the top card from the player's hand
    public Card flip() {
        return hand.remove(0);
    }
    // Draw a card from the deck and add to the hand
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }
    // Increment the player's score
    public void incrementScore() {
        score++;
    }
    // Getters for score and name
    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
}