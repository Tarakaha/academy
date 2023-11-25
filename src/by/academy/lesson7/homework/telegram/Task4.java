package by.academy.lesson7.homework.telegram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 4:
 Дан текст: "Привет, Мир! Этот текст написан на русском языке. Как дела?". Напишите регулярное выражение для поиска всех слов,
 написанных на русском языке. */

public class Task4 {
    public static void main(String[] args) {

        String text = "Привет, Мир! Этот текст написан на русском языке. Как дела?";
        Matcher matcher = Pattern.compile("[А-Яа-я]+").matcher(text);

        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();

            String out = text.substring(start,end);
            System.out.println(out);
        }
    }
}
