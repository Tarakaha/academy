package by.academy.lesson3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        double a;
        double b;

        int num;

        int first;
        int sec;
        String act;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите а:");
        a = scanner.nextInt();
        System.out.println("Введите b:");
        b = scanner.nextInt();
        if (a > b) {
            System.out.println("Большее: a= " + a + " Меньшее: b= " + b + " Среднее арифметическое: " + (a+b)/2);
        } else if (a < b) {
            System.out.println("Большее: b= " + b + " Меньшее: a= " + a + " Среднее арифметическое: " + (a+b)/2);
        } else {
            System.out.println("Числа равны. Среднее арифметическое: " + a);
        }
        System.out.println("Проверка на чётность");
        System.out.println("Введите число:");
        num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("Число является чётным");
        } else {
            System.out.println("Число является нечётным");
        }

        System.out.println("Введите цифру:");
        first = scanner.nextInt();
        System.out.println("Введите цифру:");
        sec = scanner.nextInt();
        System.out.println("Введите действие:");
        act = scanner.next();

        if (act.equals("+")){
            System.out.println(first+sec);
        } else if (act.equals("-")) {
            System.out.println(first-sec);
        } else if (act.equals("/")){
            System.out.println(first/sec);
        } else if (act.equals("*")) {
            System.out.println(first*sec);
        } else {
            System.out.println("Не работает");
        }


        scanner.close();
    }
}
