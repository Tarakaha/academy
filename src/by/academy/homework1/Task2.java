package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    /*  Используем switch/case. Ввести с консоли тип данных(сохраняем в String) и переменную, вывести на экран:
	a) если тип данных int, вывести остаток от деления на 2
	b) если double, вывести 70% от числа
	c) если float, возвести в квадрат
	d) если char, вывести код символа (charAt(0))
	e) String, вывести на экран строку в виде ("Hello " + переменная)
	f) во всех остальных случаях вывести на экран ("Unsupported type"); */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип данных:");
        String type = scanner.next().toLowerCase();
        System.out.println("Введите переменную:");
        String value = scanner.next();


        // var number; - можно ли решить через var?

        switch (type) {
            case "int":
                int numberInt = Integer.parseInt(value);
                System.out.println(numberInt % 2);
                break;
            case "double":
                String ValueDouble = value.replace(',', '.');
                double numberDouble = Double.parseDouble(ValueDouble);
                System.out.println(numberDouble * 0.7);
                break;
            case "float":
                String valueFloat = value.replace(',', '.');
                float numberFloat = Float.parseFloat(valueFloat);
                System.out.println(numberFloat * numberFloat);
                break;
            case "char":
                int nChar = value.charAt(0);
                System.out.println(nChar);
                break;
            case "string":
                System.out.println("Hello, " + value);
                break;
            default:
                System.out.println("Unsupported type");
        }
        scanner.close();
    }
}
