package by.academy.lesson9.homework.telegram.task2;

/**
 * 2. Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */

public class Person {
    String fullName;
    int age;

    public Person() {
        super();
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void move() {
        System.out.println(this.fullName + " шевелится.");
    }

    void talk() {
        System.out.println(this.fullName + " говорит.");
    }
}
