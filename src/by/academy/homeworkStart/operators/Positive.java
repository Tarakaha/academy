package by.academy.homeworkStart.operators;


public class Positive {

    public static String isPositive(long number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "0";
        }
    }
}
