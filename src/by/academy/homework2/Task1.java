package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /* Программа проверяет, является ли вторая строка перестановкой первой строки. Работает со словосочетаниями. */

        String first;
        String second;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        first = scanner.nextLine().trim().replaceAll(" ","");
        char[] fiChar = first.toCharArray();
        System.out.println("Введите вторую строку:");
        second = scanner.nextLine().trim().replaceAll(" ","");
        char[] seChar = second.toCharArray();

        if (first.length() != second.length()) {
            System.out.println("false");
            scanner.close();
            System.exit(0);
        }
        int count = 0;
        for (int i = 0; i < fiChar.length; i++) {
            for (int j = 0; j < fiChar.length; j++) {
                if (fiChar[i] == ' ') {
                    continue;
                }
                if (fiChar[i] == seChar[j]) {
                    fiChar[i] = ' ';
                    seChar[j] = ' ';
                    count++;
                }
            }
        }
        if (count == first.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scanner.close();
    }
}
