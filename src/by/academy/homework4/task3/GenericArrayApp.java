package by.academy.homework4.task3;

import java.util.Scanner;

public class GenericArrayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericArray<String> array = new GenericArray<>(4);

        array.add("черви");
        array.add("трефы");
        array.add("пики");
        array.add("бубны");
        array.add("черви");


        System.out.print("Введите индекс элемента, который необходимо удалить: ");
        int b = scanner.nextInt();
        array.removeElement(b);
        System.out.println(array);

        System.out.print("Введите объект под удаление: ");
        String c = scanner.next();
        array.removeObjElement(c);
        System.out.println(array);

        scanner.close();
    }
}

