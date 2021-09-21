package ch.teko.prg2.pruefung.aufgabe4;

public abstract class Mitarbeiter {
    private int persNr;
    private String name;
    private int dienstalter;

    public Mitarbeiter(int persNr, String name, int dienstalter) {
        this.persNr = persNr;
        this.name = name;
        this.dienstalter = dienstalter;
    }

    public abstract double monatsBrutto();

    public int getPersNr() {
        return persNr;
    }

    public String getName() {
        return name;
    }

    public int getDienstalter() {
        return dienstalter;
    }

}
