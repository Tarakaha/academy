package by.academy.homework2.Deal;

import java.util.Arrays;

public class Deal {
    public static void deal() throws InterruptedException {

        System.out.println("Тасую колоду...");
        Thread.sleep(1000);
        String[] newDeck = Deck.shuffle();

        System.out.println("Раздаю карты...");
        Thread.sleep(1000);
        int cardFromDeck = 0;
        for (int i = 0; i < Players.playerCount; i++) {
            for (int j = 0; j < 5; j++) {
                Players.players[i][j] = newDeck[cardFromDeck];
                cardFromDeck++;
            }
        }
    }
}




