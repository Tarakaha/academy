package by.academy.homework2.deal;

import java.util.Scanner;

public class Croupier {
    static void start() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        // Меню общения крупье с игроками
        do {
            System.out.println("Сколько игроков играет?(от 2 до 10): ");
            String check = scanner.nextLine();
            if (!check.isEmpty() && check.matches("\\d+")) {
                Players.playerCount = Integer.parseInt(check);
                if (Players.playerCount < 2 || Players.playerCount > 10) {
                    System.out.println("Игра не может начаться. Минимальное количество игроков : 2. Максимальное : 10");
                    Thread.sleep(1000);
                    continue;
                }
                break;
            } else {
                System.out.println("Неверные данные");
                Thread.sleep(1000);
            }
        }
        while (true);
        scanner.close();
        Players.initializationOfPlayers(Players.playerCount);
        Deal.deal();
        Showdowm.show();
    }
}
