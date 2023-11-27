package by.academy.homework2.deal;

import java.util.Random;

public class Deck {

    public final static String[] cards = {"2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥",
                                          "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦", "A♦",
                                          "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣",
                                          "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠"};

    protected static String[] shuffle() {  // Здесь в случайном порядке происходит тасовка колоды
        String[] shuffleDeck = new String[52];
        System.arraycopy(cards, 0, shuffleDeck, 0, cards.length);

        Random random = new Random();

        for (int i = shuffleDeck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = shuffleDeck[j];
            shuffleDeck[j] = shuffleDeck[i];
            shuffleDeck[i] = temp;
        }

        return shuffleDeck;
    }
}
