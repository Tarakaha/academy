package by.academy.homeworkStart.classes;

public class Student {
    String lastName;
    String firstName;
    int age;
    long id;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void getInformation() {
        System.out.println("Last Name: " +getLastName() + "\nFirst Name: " + getFirstName() + "\nAge: "
                + getAge() + "\nID: " + getId());
    }
}
