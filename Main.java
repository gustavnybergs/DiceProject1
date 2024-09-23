package org.example;

import java.util.Random; // Importera Random-klassen för slumpmässiga tärningskast
import java.util.Scanner; // Importera Scanner-klassen för att läsa in användarinput

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapa en Scanner för att läsa in data
        Random random = new Random(); // Skapa ett Random-objekt för att generera slumpmässiga tal

        // Läs in spelarnas namn
        System.out.print("Ange namn på spelare 1: ");
        Player player1 = new Player(scanner.nextLine()); // Skapa en spelare ocg ger ett namn

        System.out.print("Ange namn på spelare 2: ");
        Player player2 = new Player(scanner.nextLine()); // Skapa en andra spelare

        // Spela spelet där varje spelare kastar tärningen två gånger
        for (int i = 0; i < 2; i++) { // Loopa två gånger för att låta varje spelare kasta tärningen 2 ggr
            System.out.println(player1.getName() + " kastar tärningen...");
            int roll1 = random.nextInt(6) + 1; // Generera ett slumpmässigt tal mellan 1 och 6
            System.out.println(player1.getName() + " fick: " + roll1); // Visa resultatet av tärningskastet
            player1.addScore(roll1); // Lägg till poängen till spelare 1

            System.out.println(player2.getName() + " kastar tärningen...");
            int roll2 = random.nextInt(6) + 1; // Generera ett slumpmässigt tal mellan 1 och 6 för spelare 2
            System.out.println(player2.getName() + " fick: " + roll2); // Visa resultatet av tärningskastet
            player2.addScore(roll2); // Lägg till poängen till spelare 2
        }

        // Visa slutresultatet
        System.out.println("\nResultat:");
        System.out.println(player1.getName() + " totalpoäng: " + player1.getScore()); // Visa totalpoäng för spelare 1
        System.out.println(player2.getName() + " totalpoäng: " + player2.getScore()); // Visa totalpoäng för spelare 2

        // Avgör vem som vinner och skriv ut resultatet
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " vinner!"); // Spelare 1 vinner
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " vinner!"); // Spelare 2 vinner
        } else {
            System.out.println("Det blev oavgjort!"); // Oavgjort resultat
        }

        scanner.close(); // Stäng Scanner-objektet
    }
}
