package by.academy.homework3.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Валидатор принимает в себя любой корректный беларусский номер, т.к. указан может быть и домашний телефон. */

public class BelarussianPhoneValidator implements Validator {
    private final Pattern PATTERN = Pattern.compile("\\+375\\d{9}");


    @Override
    public Pattern getPattern(){
        return PATTERN;

    }


}
