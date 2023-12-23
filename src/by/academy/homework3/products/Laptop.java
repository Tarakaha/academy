package by.academy.homework3.products;

public class Laptop extends Product {

    public Laptop(String name, double price, double quantity) {
        super(name, price, quantity);
    }


    @Override
    public double discount() {
        if (this.getName().equals("Lenovo")) {
            return 0.75;
        } else return 1;
    }
}
