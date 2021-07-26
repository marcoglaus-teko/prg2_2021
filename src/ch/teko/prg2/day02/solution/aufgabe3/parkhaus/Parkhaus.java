package ch.teko.prg2.day02.solution.aufgabe3.parkhaus;

public class Parkhaus {
    private String name;
    private Etage[] etagen;

    public Parkhaus(final String name, final Etage[] etagen) {
        this.name = name;
        this.etagen = etagen;
    }

    public String getName() {
        return name;
    }

    public Etage[] getEtagen() {
        return etagen;
    }

}
