package by.academy.lesson9.homework.telegram.task1;

import java.io.Serializable;

/**
 * 1. Класс Phone.
 * a) Создайте класс Phone, который содержит переменные number, model и weight.
 * б) Создайте три экземпляра этого класса.
 * в) Выведите на консоль значения их переменных.
 * г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
 * е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * ж) Добавить конструктор без параметров.
 * з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
 * к) Создать метод sendMessage с аргументами переменной длины(varargs). Данный метод принимает на вход номера телефонов,
 * которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 * л) Изменить класс Phone в соответствии с концепцией JavaBean.
 */
public class Phone implements Serializable {
    int number;
    String model;
    double weight;

    public Phone() {
        super();
    }

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name + " " + this.getNumber());
    }

    void receiveCall(String name, int callNumber) {
        System.out.println("Звонит " + name + " " + callNumber);
    }

    void sendMessage(int... nums) {

        for (int num : nums) {
            System.out.println("Сообщение отправлено. Кому: " + num);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (number != phone.number) return false;
        if (Double.compare(phone.weight, weight) != 0) return false;
        return model != null ? model.equals(phone.model) : phone.model == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = number;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
