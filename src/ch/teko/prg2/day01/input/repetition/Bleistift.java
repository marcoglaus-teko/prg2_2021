package ch.teko.prg2.day01.input.repetition;

public class Bleistift {
    private double price;
    private String härte;

    public Bleistift(double price, String härte) {
        this.price = price;
        this.härte = härte;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getHärte() {
        return härte;
    }

    public void setHärte(String härte) {
        this.härte = härte;
    }
}
