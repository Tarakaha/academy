package by.academy.homework3.deal;

import java.time.LocalDate;


public class User {

    protected double money;
    protected String name;
    protected LocalDate dateOfBirth;
    protected String numberOfPhone;
    protected  String email;


    public User(){}
    public User(double money, String name, LocalDate dateOfBirth) {
        this.money = money;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public User(double money, String name, LocalDate dateOfBirth, String numberOfPhone, String email) {
        this.money = money;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPhone = numberOfPhone;
        this.email = email;
    }

    public boolean hasEnoughMoney(double price) {
        return money >= price;
    }

    public double getMoney() {
        return money;
    }

    protected void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (Double.compare(user.money, money) != 0) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(user.dateOfBirth) : user.dateOfBirth != null) return false;
        if (numberOfPhone != null ? !numberOfPhone.equals(user.numberOfPhone) : user.numberOfPhone != null)
            return false;
        return email != null ? email.equals(user.email) : user.email == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(money);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (numberOfPhone != null ? numberOfPhone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "money=" + money +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPhone='" + numberOfPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
