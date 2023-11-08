package by.academy.homeworkStart.classes;

public class Test {
    public static void main(String[] args) {
        /* STUDENT */
        Student ivanov = new Student();
        ivanov.setLastName("Ivanov");
        ivanov.setFirstName("Petr");
        ivanov.setAge(21);
        ivanov.setId(1);

        Student petrov = new Student();
        petrov.setLastName("Petrov");
        petrov.setFirstName("Ivan");
        petrov.setAge(20);
        petrov.setId(2);

        ivanov.getInformation();
        System.out.println("*******");
        petrov.getInformation();
        System.out.println("*******");

        /*---------*/

        /* BOOK */
        Book it = new Book("It", "Stephen King", 1986, 1138);
        Book idiot = new Book("Идиот", "Фёдор Достоевский", 1869, 640);
        System.out.println(it);
        System.out.println("*******");
        System.out.println(idiot);
        System.out.println("*******");

        /*---------*/

        /* CALCULATOR */
        System.out.println(Calculator.add(5, 6));
        System.out.println(Calculator.divide(12, 5));
        System.out.println(Calculator.multiply(3, 3));
        System.out.println(Calculator.substract(10, 1));

        /*---------*/

    }
}
