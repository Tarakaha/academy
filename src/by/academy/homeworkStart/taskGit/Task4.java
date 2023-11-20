package by.academy.homeworkStart.taskGit;

import java.util.Scanner;

public class Task4 {
  /*  Создайте число. Определите, является ли число
    четным или не четным, вывести текстовое сообщение. */

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        number = scanner.nextInt();

        if (number%2 == 0){
            System.out.println("Число является чётным.");
        }else{
            System.out.println("Число является нечётным");
        }
        scanner.close();
    }
}
