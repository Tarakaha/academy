package by.academy.homework3.tools;

import java.time.LocalDate;
import java.util.regex.Pattern;
/** Внимание! Валидатор не проверяет,существует ли дата в календаре! Будет исправлено на теме "try-catch" =) */
public class DateValidatorWithDash implements Validator {
   private final Pattern PATTERN = Pattern.compile("(0[1-9]|1\\d|2\\d|3[01])(-)(0[1-9]|1[012])(-)\\d{4}");

   @Override
   public Pattern getPattern() {
       return PATTERN;
   }




}


