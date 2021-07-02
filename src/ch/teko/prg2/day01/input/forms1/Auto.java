package ch.teko.prg2.day01.input.forms1;

public class Auto {
    private String marke;
    private String farbe;
    private int ps;

    public Auto () {
        String[] markenArray = {"Audi", "VW", "Mercedes", "Volwo", "BMW", "Mitsubishi", "Toyota", "Seat", "Fiat"};
        String[] farbenArray = {"Rot", "Grün", "Blau", "Schwarz", "Silber", "Gelb", "Weiss", "Grau"};

        int randomMarken = (int)(Math.random() * markenArray.length);
        int randomColor = (int)(Math.random() * farbenArray.length);
        int randomPS = (int)(Math.random() * 300);

        this.marke = markenArray[randomMarken];
        this.farbe = farbenArray[randomColor];
        this.ps = randomPS;
    }

    public Auto(String marke, String farbe, int ps) {
        this.marke = marke;
        this.farbe = farbe;
        this.ps = ps;
    }

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
