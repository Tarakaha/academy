package by.academy.homework3.tools;

import java.time.LocalDate;

public class DateConvertor {
    private LocalDate localDate;

    public LocalDate convertDateWithDash(String dateInString) {
        String[] numForParse = dateInString.split("\\-");
        int day = Integer.parseInt(numForParse[0]);
        int month = Integer.parseInt(numForParse[1]);
        int year = Integer.parseInt(numForParse[2]);
        localDate = LocalDate.of(year, month, day);
        return localDate;
    }

    public LocalDate convertDateWithSlash(String dateInString) {
        String[] numForParse = dateInString.split("\\/");
        int day = Integer.parseInt(numForParse[0]);
        int month = Integer.parseInt(numForParse[1]);
        int year = Integer.parseInt(numForParse[2]);
        localDate = LocalDate.of(year, month, day);
        return localDate;
    }

    public static void dateToString(LocalDate localDate) {

        System.out.println("День: " + localDate.getDayOfMonth());
        System.out.println("Месяц: " + localDate.getMonth());
        System.out.println("Год: " + localDate.getYear());
    }
}
