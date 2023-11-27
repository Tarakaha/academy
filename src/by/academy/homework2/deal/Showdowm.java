package by.academy.homework2.deal;

public class Showdowm {
    public static void show() throws InterruptedException {

        for (int i = 0; i < Players.playerCount; i++) {
            System.out.println("Карты игрока #" + (i + 1) + ":");
            Thread.sleep(800);
            for (int j = 0; j < 5; j++) { // j - количество карт на руке
                System.out.print((Players.players[i][j] + " "));
            }
            Thread.sleep(500);
            System.out.println();
        }
    }
}

