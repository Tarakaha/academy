package by.academy.lesson7.homework.telegram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 1:
 * Дан текст: "abc123xyz456pqr". Напишите регулярное выражение для извлечения всех чисел из этой строки.
 */

public class Task1 {
    public static void main(String[] args) {

        String text = "abc123xyz456pqr";
        Matcher matcher = Pattern.compile("\\d+").matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

            String matchers = text.substring(start, end);
            System.out.println(matchers);
        }
    }
}
