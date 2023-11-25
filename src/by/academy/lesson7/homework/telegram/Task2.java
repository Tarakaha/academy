package by.academy.lesson7.homework.telegram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 2:
 Дан текст: "Email: john@example.com, Phone: +123456789". Напишите регулярное выражение
 для извлечения адреса электронной почты из данного текста.*/

public class Task2 {
    public static void main(String[] args) {

        String text = "Email: john@example.com, Phone: +123456789";
       // Matcher matcher = Pattern.compile("\\w+([.-]?\\w+)@\\w+([.-]?\\w+)(.\\w)").matcher(text);
        Matcher matcher = Pattern.compile("\\w+@\\w+.\\w{3}").matcher(text);

        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();

            String out = text.substring(start,end);
            System.out.println(out);
        }
    }
}
