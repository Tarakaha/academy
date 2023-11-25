package by.academy.lesson7.homework.workbook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ввести с клавиатуры строку. Найти в строке все знаки препинания и подсчитать их общее количество.
 * К знакам препинания относятся: . ? ! ... : ; , -
 */

public class Task27 {
    public static void main(String[] args) {

        String text = "Какая-то фраза, в которой будут некорректно считаться знаки... Но гном - это гном.";// , ... - .(4)
        String copy = text.replaceAll("\\.+", "\\.")
                .replaceAll("(?<=\s)-(?=\s)", ":");

        int counter = 0;
        Matcher matcher = Pattern.compile("[.?!:;,]").matcher(copy);

        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter + " знака в тексте: " + text);
    }
}
