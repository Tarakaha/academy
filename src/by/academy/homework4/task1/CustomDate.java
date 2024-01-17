package by.academy.homework4.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CustomDate {
    private Year year;
    private Month month;
    private Day day;

    public CustomDate(String date) {
        if (!isValidDate(date)) {
            System.out.println("Неверный формат даты");
        }

        String[] parts = date.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        this.year = new Year(year);
        this.month = new Month(month);
        this.day = new Day(day);
    }

    public void setDate(String date) {
        if (!isValidDate(date)) {
            System.out.println("Неверный формат даты");
        }

        String[] parts = date.split("-");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        this.year.setYear(year);
        this.month.setMonth(month);
        this.day.setDay(day);
    }

    public void printDayOfWeek() {
        LocalDate localDate = LocalDate.of(year.getYear(), month.getMonth(), day.getDay());
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);
    }

    public LocalDate toLocalDate() {
        return LocalDate.of(this.year.getYear(), this.month.getMonth(), this.day.getDay());
    }
    public void getDaysInPeriod(String fromDate, String toDate) {
        if (!isValidDate(fromDate) || !isValidDate(toDate)) {
            throw new IllegalArgumentException("Неверный формат даты");
        }

        LocalDate start = LocalDate.parse(fromDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate end = LocalDate.parse(toDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println("Между датами " + ChronoUnit.DAYS.between(start, end) + " дня(дней)");
    }

    public static boolean isValidDate(String date) {
        return date.matches("\\d{2}-\\d{2}-\\d{4}");
    }

    private class Year {
        private int year;

        public Year(int year) {
            this.year = year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }


    }
    public boolean isLeapYear() {
        return toLocalDate().isLeapYear();
    }
    private class Month {
        private int month;

        public Month(int month) {
            this.month = month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getMonth() {
            return month;
        }
    }

    private class Day {
        private int day;

        public Day(int day) {
            this.day = day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }
    }

    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
}