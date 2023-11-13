package by.academy.lesson2.classWork;

public class Application {
    /*    5) В классе Application создать 2 кота, одного без имени, второго с именем.
    6) Вызовите методы eat, sleep, walk у кота с именем.
    7) Вызовите методы grow у второго кота без имени 3 раза и выведите на экран его возраст.
    8) Добавить поле money в класс Cat, добавить методы getMoney и setMoney, которые будут возвращать и назначать значение
        money соответственно.
    9) Добавить поле initials(инициалы), которое будет хранить первую букву клички кота, подумать над типом, написать метод
        getInitials/setInitials, которые будут возвращать и сетать значение initials соответственно.
    10) Добавить поле isHomeAnimal(является ли домашним животным). Подумать над типом, написать метод
        isHomeAnimal/setIsHomeAnimal, которые будут возвращать и назначать значение isHomeAnimal соответственно.*/

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Плюшка");

        cat1.eat();
        cat1.sleep();
        cat1.walk();

        for (int i = 0; i < 3; i++) {
            cat2.grow();
        }
        System.out.println("Возраст кота по кличке " + cat2.getNickname() + " - " + cat2.getAge());

        cat2.setInitials('П');
        cat2.setHomeAnimal(true);
        cat2.setMoney(2000);
        System.out.println(cat2);
    }
}