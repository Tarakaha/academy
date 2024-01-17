package by.academy.homework4.task1;

import by.academy.CustomDate;

public class CustomDateApp {
    public static void main(String[] args) {

        CustomDate cd = new CustomDate("17-01-2024");
        cd.getDaysInPeriod("17-01-2024", "20-01-2024");
        cd.printDayOfWeek();
        System.out.println("Является ли введённый год високосным?");
        System.out.println(cd.isLeapYear());
    }
}