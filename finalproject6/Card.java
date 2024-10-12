package finalproject6;
public class Card {
    private int value;  // 2-14, where 11 = Jack, 12 = Queen, 13 = King, 14 = Ace
    private String name;  // Example: "Ace of Diamonds", "Two of Hearts"
    //1. created card class.  Constructor
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }
    // Getters and Setters
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Method to describe the card
    public void describe() {
        System.out.println(name + " (" + value + ")");
    }
}