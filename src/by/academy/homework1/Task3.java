package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    /* Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа.
   (10 чисел). */

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10:");
        do{
            number = scanner.nextInt();
            if (number < 1 || number > 10){
                System.out.println("Введите корректное число! (от 1 до 10)");
            }
        } while (number < 1 || number > 10);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

        scanner.close();
    }
}
