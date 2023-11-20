package by.academy.homework2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Задание 0.
 * Дан массив с int переменными, определить количество пар,
 * разность которых эквивалентна заданному с консоли target значению.
 */

public class Task {
    // Пример ввода:
//  5 2
//  1 5 3 4 2
// Пример вывода:
//	3
    static int pairs(int k, int[] arr) {
        int pairsCount = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Введите пару чисел через пробел, где первая позиция - количество вводимых чисел, " +
                           "а вторая - необходимая искомая разница между ними:");
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        System.out.println("Введите числа через пробел " + "(" + arr.length + " числа(ел)):");
        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
            System.out.println(arr[i]);
        }

        int result = pairs(k, arr);
        System.out.println("Найдено пар: " + result);

        scanner.close();
    }
}
