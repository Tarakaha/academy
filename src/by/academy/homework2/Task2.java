package by.academy.homework2;

import java.util.Scanner;

/**
 * Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько,
 * найти первое из них.
 */

public class Task2 {
    public static void main(String[] args) {

    /* Программа принимает на сравнение минимум 2 слова, после чего выводит слово с минмальным разнообразием символов
       на консоль */

        int wordCount;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите количество ожидаемых слов:");
            String check = scanner.nextLine().trim();
            if (!check.isEmpty() && check.matches("\\d+")) {
                wordCount = Integer.parseInt(check);
                if (wordCount < 2) {
                    System.out.println("Минимально ожидаемых слов должно быть больше 2х.");
                    continue;
                }
                break;
            } else if (check.isEmpty()) {
                System.out.println("Строка пустая");
            } else {
                System.out.println("Строка не является числом");
            }
        }
        while (true);

        String minWord = null;
        String tempWord;
        int charCount = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < wordCount; i++) {
            System.out.println("Введите слово:");
            tempWord = scanner.nextLine().toLowerCase().trim();
            char[] tempChar = tempWord.toCharArray();
            for (int j = 0; j < tempWord.length(); j++) {
                for (int k = j + 1; k < tempWord.length() - 1; k++) {
                    if (tempChar[i] == ' ') {
                        continue;
                    }
                    if (tempChar[i] == tempChar[j]) {
                        tempChar[i] = ' ';
                        tempChar[j] = ' ';
                        ++count;
                    }
                }
                if (count < charCount) {
                    charCount = count;
                    minWord = tempWord;
                }
            }
        }
        System.out.println(minWord + ". Количество уникальных символов: " + count);

        scanner.close();
    }
}
