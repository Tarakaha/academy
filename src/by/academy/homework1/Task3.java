package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    /* Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа.
   (10 чисел). */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        scanner.close();
    }
}
