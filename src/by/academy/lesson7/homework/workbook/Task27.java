package by.academy.lesson7.homework.workbook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ввести с клавиатуры строку. Найти в строке все знаки препинания и подсчитать их общее количество.
 * К знакам препинания относятся: . ? ! ... : ; , -
 */

public class Task27 {
    public static void main(String[] args) {

        String text = "Какая-то фраза, в которой будут некорректно считаться знаки... Но гном - это гном.";
        // знаки в тексте: ',' '...' '-' '.'(4)
        String copy = text.replaceAll("\\.+", "\\.")    // Т.к. многоточие является одним знаком препинания, меняем его на одну точку, для корректного счёта знаков.
                          .replaceAll("(?<=\s)-(?=\s)", ":");    /* Т.к. знак тире так же является дефисом в печатном письме (дефис не является знаком препинания),
                                                                    на этом этапе меняем тире на двоеточие, для корректного счёта знаков. */
                                                                    
        int counter = 0;
        Matcher matcher = Pattern.compile("[.?!:;,]").matcher(copy);

        while (matcher.find()) {
            counter++;
        }

        System.out.println(counter + " знака в тексте: " + text);
    }
}
