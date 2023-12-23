package by.academy.homework3.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator{
    private final Pattern PATTERN = Pattern.compile("\\+1\\d{11}");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }


}
