package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько,
 * найти первое из них.
 */

public class Task2 {
    public static void main(String[] args) {

    /* Программа принимает на сравнение минимум 2 слова, после чего выводит слово с минимальным разнообразием символов
       на консоль 
       P.S. Программа игнорирует пробельные символы, т.к. визуально учёт итогового вывода усложняется при наличии пробела. При необходимости код может быть переписан.*/

        int wordCount;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите количество ожидаемых слов:");
            String check = scanner.nextLine().trim();
            if (!check.isEmpty() && check.matches("\\d+")) {
                wordCount = Integer.parseInt(check);
                if (wordCount < 2) {
                    System.out.println("Минимальное количество сравниваемых слов - 2");
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

        for (int i = 0; i < wordCount; i++) {
            int count = 1;  // Счётчик с единицы потому что да.

            System.out.println("Введите слово:");
            tempWord = scanner.next().trim();
            char[] letters = tempWord.toCharArray();
            Arrays.sort(letters);

            for (int j = 0; j < letters.length - 1; j++) {
                if (letters.length == 1 && charCount != 1) {
                    count = 1;
                    break;
                }
                if (letters[j] != letters[j + 1]) {
                    count++;
                }
            }
            if (count < charCount) {
                charCount = count;
                minWord = tempWord;
            }
        }

        System.out.println(minWord + ". Количество уникальных символов: " + charCount);

        scanner.close();
    }
}
