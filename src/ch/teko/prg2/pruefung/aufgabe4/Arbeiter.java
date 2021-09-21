package ch.teko.prg2.pruefung.aufgabe4;

public class Arbeiter extends Mitarbeiter {
    private double stundenLohn;
    private double anzahlStunden;

    public Arbeiter(int persNr, String name, int dienstalter, double stundenLohn, double anzahlStunden) {
        super(persNr, name, dienstalter);
        this.stundenLohn = stundenLohn;
        this.anzahlStunden = anzahlStunden;
    }

    @Override
    public double monatsBrutto() {
        return this.anzahlStunden * this.stundenLohn;
    }
}
