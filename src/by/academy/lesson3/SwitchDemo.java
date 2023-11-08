package by.academy.lesson3;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название месяца");
        String month = scan.next().toLowerCase();

        switch (month){
            case "январь":
                System.out.println(1);
                break;
            case "февраль":
                System.out.println(2);
                break;
            case "март":
                System.out.println(3);
                 break;
            case "апрель":
                System.out.println(4);
                 break;
            case "май":
                System.out.println(5);
                 break;
            case "июнь":
                System.out.println(6);
                 break;
            case "июль":
                System.out.println(7);
                 break;
            case "август":
                System.out.println(8);
                 break;
            case "сентябрь":
                System.out.println(9);
                 break;
            case "октябрь":
                System.out.println(10);
                 break;
            case "ноябрь":
                System.out.println(11);
                 break;
            case "декабрь":
                System.out.println(12);
                 break;
            default:
                System.out.println("Это не месяц");
        }
        scan.close();
    }
}
