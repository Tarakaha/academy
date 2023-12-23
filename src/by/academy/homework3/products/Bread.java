package by.academy.homework3.products;

public class Bread extends Product {

    public Bread(String name, double price, double quantity) {
        super(name, price, quantity);
    }

    @Override
    public double discount() {
        if (this.getQuantity() > 10) {
            return 0.5;
        } else return 1;
    }

}
