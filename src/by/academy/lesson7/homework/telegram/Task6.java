package by.academy.lesson7.homework.telegram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 6:
 * Текст: "Научиться программировать можно в любом возрасте. Молодые программисты часто создают удивительные проекты,
 * воплощая свои творческие идеи в коде."
 * Составьте регулярное выражение, которое находит все слова в тексте, состоящие из четырех букв.
 */

public class Task6 {
    public static void main(String[] args) {

        String text = "Научиться программировать можно в любом возрасте. Молодые программисты часто создают " +
                "удивительные проекты, воплощая свои творческие идеи в коде, коде,коде.";

        Matcher matcher = Pattern.compile("([\s.,][А-Яа-я]{4}[\s.,])").matcher(text);
//        Matcher matcher = Pattern.compile("\\b\\w{4}\\b").matcher(text);   // работает на regex101.com
//        Matcher matcher = Pattern.compile("(^\\w|\\w$|\\W\\w|\\w\\W)[А-Яа-я]{4}(^\\w|\\w$|\\W\\w|\\w\\W)").matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();

            String out = text.substring(start, end);
            System.out.println(out);
        }
    }
}
