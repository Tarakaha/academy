package by.academy.homework3.task3;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Данный класс проверяет введённую дату на соответствие паттерна.
 * Обратите внимание! Паттерн проверяет только формат даты, он не проверяет, существует ли такая дата в календаре!
 * P.S. Класс не нуждается в создании экземпляров и является final, т.к. он предназначен лишь для проверки на соответсвтие.
 */

public final class DatePattern {

    private DatePattern() {
    }

    static boolean isDate(String date) {
        Matcher matcher = Pattern.compile("(0[1-9]|1\\d|2\\d|3[01])(-|/)(0[1-9]|1[012])(-|/)\\d{4}").matcher(date);
        if (matcher.find()) {
            return true;
        } else {
            return false;
        }
    }
}
