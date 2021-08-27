package ch.teko.prg2.day03.solution.auto;

public class Auto {
    private AutoMarken marke;
    private Farben farbe;
    private int ps;

    public Auto() {
        AutoMarken[] markenArray = AutoMarken.values();
        Farben[] farbenArray = Farben.values();

        int randomMarken = (int) (Math.random() * AutoMarken.values().length);
        int randomColor = (int) (Math.random() * Farben.values().length);
        int randomPS = (int) (Math.random() * 300);

        this.marke = markenArray[randomMarken];
        this.farbe = farbenArray[randomColor];
        this.ps = randomPS;
    }

    public Auto(final int ps) {
        this();
        this.ps = ps;
    }

    public String getMarke() {
        return marke.name();
    }

    public String getFarbe() {
        return farbe.name();
    }

    public int getPs() {
        return ps;
    }

}
