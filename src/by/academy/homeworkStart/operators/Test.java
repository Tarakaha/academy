package by.academy.homeworkStart.operators;

public class Test {
    public static void main(String[] args) {
        /* COMPARATOR */
        System.out.println(Comparator.compare(12, 6));

        /*---------*/

        /* AREA CALCULATOR */
        System.out.println(AreaCalculator.calculateTheArea(17));

        /*---------*/

        /* PERIMETER CALCULATOR */
        System.out.println(Perimeter.calculatePerimeter(2.1,5.5));
        System.out.println(Perimeter.calculateArea(2.1,5.5));

        /*---------*/

        /* POSITIVE */
        System.out.println(Positive.isPositive(-19));
        System.out.println(Positive.isPositive(19989));
        System.out.println(Positive.isPositive(0));
        System.out.println(Positive.isPositive((long)2147483647+1));
      //  System.out.println(Positive.isPositive(2147483648));
    }
}
