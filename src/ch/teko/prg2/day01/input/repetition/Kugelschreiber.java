package ch.teko.prg2.day01.input.repetition;

public class Kugelschreiber {
    private double price;
    private String farbe;

    public Kugelschreiber(double price, String farbe) {
        this.price = price;
        this.farbe = farbe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
