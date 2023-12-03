package by.academy.homework3.task3;

public class Test {
    public static void main(String[] args) {

        String test1 = "12/13/1114";    //false
        String test2 = "15/07/217";     //false
        String test3 = "01/11/3320";    //true
        String test4 = "21-02-2123";    //true
        String test5 = "24/05/1126 ";   //true

        System.out.println(DatePattern.isDate(test1));
        System.out.println(DatePattern.isDate(test2));
        System.out.println(DatePattern.isDate(test3));
        System.out.println(DatePattern.isDate(test4));
        System.out.println(DatePattern.isDate(test5));
    }
}
