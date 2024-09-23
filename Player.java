package org.example;

public class Player {
    private String name; // Spelarens namn
    private int score;   // Spelarens poäng

    // Konstruktor som initierar spelaren med ett namn och sätter poängen till 0
    public Player(String name) {
        this.name = name;
        this.score = 0; // Initiera poängen till 0
    }

    // Getter för att hämta spelarens namn
    public String getName() {
        return name;
    }

    // Getter för att hämta spelarens poäng
    public int getScore() {
        return score;
    }

    // Metod för att lägga till poäng till spelarens totala poäng
    public void addScore(int points) {
        score += points; // Öka poängen med det angivna värdet
    }
}
