package by.academy.lesson2;

public class DogApp {
    public static void main(String[] args) {
        Dog julik = new Dog("Жулик", 10, "чёрный");
        Dog sharik = new Dog();
        Dog funtik = new Dog("Фунтик");

        julik.eat();
        julik.sleep();
        julik.serve();

        sharik.eat();
        sharik.sleep();
        sharik.serve();

        funtik.eat();
        funtik.sleep();
        funtik.serve();

    }

}




