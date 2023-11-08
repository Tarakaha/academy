package by.academy.lesson2;

public class Bird {
    String size;
    String type;
    double weight;

    public Bird() {
        super();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Bird(String size) {
        super();
        this.size = size;


    }
}
