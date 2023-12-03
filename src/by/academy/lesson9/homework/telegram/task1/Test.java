package by.academy.lesson9.homework.telegram.task1;

public class Test {
    public static void main(String[] args) {
        Phone samsung = new Phone(111_11_11, "Galaxy S30", 100);
        Phone iphone = new Phone(222_22_22, "30s", 100);
        Phone xiaomi = new Phone(333_33_33, "Redmi 30", 100);

       /* System.out.println(samsung);
        System.out.println(iphone);
        System.out.println(xiaomi);*/

        /*samsung.receiveCall("Li Ben");
        iphone.receiveCall("Steve");
        xiaomi.receiveCall("Lei Jun");*/

        /*samsung.receiveCall("Li Ben", 288_77_66);
        iphone.receiveCall("Steve", 111_11_11);*/

        samsung.sendMessage(2020327, 7349995, 3343322);
    }
}
