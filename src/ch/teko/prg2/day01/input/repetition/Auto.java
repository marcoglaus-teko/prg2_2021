package ch.teko.prg2.day01.input.repetition;

public class Auto {
    //Attribute
    private String marke, farbe;
    private int ps;

    //Konstruktoren
    public Auto(String marke, String farbe, int ps) {
        this.marke = marke;
        this.farbe = farbe;
        this.ps = ps;
    }

    //Methoden
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
