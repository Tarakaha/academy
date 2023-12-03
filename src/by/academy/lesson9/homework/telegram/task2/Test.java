package by.academy.lesson9.homework.telegram.task2;

public class Test {
    public static void main(String[] args) {
        Person man = new Person("Мужик Иваныч", 30);
        Person woman = new Person();

        man.move();
        woman.talk();
    }
}
