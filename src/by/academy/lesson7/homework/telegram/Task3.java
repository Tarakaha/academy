package by.academy.lesson7.homework.telegram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 3:
 * Дан текст: "Дата создания файла: 25.09.2023". Напишите регулярное выражение для извлечения даты из формата "dd.mm.yyyy".
 */

public class Task3 {
    public static void main(String[] args) {

        String text = "Дата создания файла: 25.09.2023";
        Matcher matcher = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}").matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

            String out = text.substring(start, end);
            System.out.println(out);

        }
    }
}
