package by.academy.lesson2;

public class Dog {
    String nickname;
    int age;
    String color;

    public Dog() {
        super();
    }


    public Dog(String nickname) {
        super();
        this.nickname = nickname;
    }

    public Dog(String nickname, int age, String color) {
        super();
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void eat(){
        System.out.println(color + " " + nickname + " кушоет " + age);
    }

    public void sleep(){
        System.out.println(color + " " + nickname + " спит " + age);
    }

    public void serve(){
        System.out.println(color + " " + nickname + " служит " + age);
    }

}
