package by.academy.homework3.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    private final Pattern PATTERN = Pattern.compile("[A-Za-z0-9._%+-/]+@([A-Za-z0-9.-]+\\.)?[A-Za-z]{2,}(\\.[A-Za-z]{2,})?");

    @Override
    public Pattern getPattern() {
      return PATTERN;
    }

}
