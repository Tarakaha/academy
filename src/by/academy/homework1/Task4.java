package by.academy.homework1;

public class Task4 {
    /*Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000.*/

    public static void main(String[] args) {
        int power = 2;
        int x = 2;
        int count = 1;

        while (x < 1_000_000) {
            System.out.println("Степень: " + count + " --- " + x);
            x *= power;
            count++;
        }
    }
}