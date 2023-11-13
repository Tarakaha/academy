package by.academy.lesson2.classWork;

public class Cat {
    String nickname;
    int age;
    char initials;
    int money;
    boolean isHomeAnimal;

    public Cat() {
    }

    public Cat(String nickname) {
        this.nickname = nickname;
    }

    public Cat(int age, String nickname) {
        this.age = age;
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public char getInitials() {
        return initials;
    }

    public void setInitials(char initials) {
        this.initials = initials;
    }

    public boolean isHomeAnimal() {
        return isHomeAnimal;
    }

    public void setHomeAnimal(boolean homeAnimal) {
        isHomeAnimal = homeAnimal;
    }

    public void grow() {
        age++;
    }

    public void sleep() {
        System.out.println(nickname + " спит");
    }

    public void eat() {
        System.out.println(nickname + " ест");
    }

    public void walk() {
        System.out.println(nickname + " гуляет");
    }

    @Override
    public String toString() {
        return "Cat{ " +
                "nickname='" + nickname + '\'' +
                ", age='" + age + '\'' +
                ", initials='" + initials + '\'' +
                ", cost='" + money + '\'' +
                ", isHomeAnimal?='" + isHomeAnimal + '\'' +
                '}';
    }

}
