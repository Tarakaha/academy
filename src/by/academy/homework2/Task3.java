package by.academy.homework2;

import java.util.Scanner;

/**
 * Условие здачи: ввести 2 слова, состоящие из четного числа букв. Получить слово состоящее из первой половины первого
 * слова и второй половины второго слова.
 */

public class Task3 {
    public static void main(String[] args) {

        String first;
        String second;
        String concat;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите первое слово (чётного количества букв):");
            first = scanner.nextLine().trim();
            if (first.length() % 2 == 0) {
                break;
            }
            System.out.println("Что-то пошло нетак. Попробуйте ещё раз!");
        } while (true);

        do {
            System.out.println("Введите второе слово (чётного количества букв):");
            second = scanner.nextLine().trim();
            if (second.length() % 2 == 0) {
                break;
            }
            System.out.println("Что-то пошло нетак. Попробуйте ещё раз!");
        } while (true);

        concat = first.substring(0, first.length() / 2) + second.substring(second.length() / 2);
        System.out.println(concat);
        scanner.close();
    }
}
