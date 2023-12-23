package by.academy.homework3.products;

public class Cat extends Product {
    private String color;

    @Override
    public double discount() {
        if (this.getPrice() > 1500) {
            return 0.8;
        } else return 1;
    }

    public Cat(String name, double price, double quantity, String color) {
        super(name, price, quantity);
        this.color = color;
    }

    @Override
    public String toString() {
        return name +
                "   " + color + "   " + price +
                "$  " + quantity +
                " шт.";
    }
}

