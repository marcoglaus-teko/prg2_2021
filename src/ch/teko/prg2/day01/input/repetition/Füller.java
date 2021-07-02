package ch.teko.prg2.day01.input.repetition;

public class Füller {
    private double price;
    private double weightInGrams;

    public Füller(double price, double weightInGrams) {
        this.price = price;
        this.weightInGrams = weightInGrams;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }
}
