package by.academy.homework2.deal;

public class Players {

    static int playerCount;
    public static String[][] players;

    static void initializationOfPlayers(int quantity) {
        players = new String[quantity][5];
    }
}
