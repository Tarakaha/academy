package by.academy.lesson7.homework.telegram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 5:
 Дан текст: "https://www.example.com, http://google.com, ftp://files.example.org". Напишите регулярное выражение
 для извлечения всех URL из данного текста. */

public class Task5 {
    public static void main(String[] args) {

        String text = "https://www.example.com, http://google.com, ftp://files.example.org";
        Matcher matcher = Pattern.compile("(http|https|ftp)://\\w+.\\w+(.(com|org))").matcher(text);

        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();

            String out = text.substring(start,end);
            System.out.println(out);
        }
    }
}
