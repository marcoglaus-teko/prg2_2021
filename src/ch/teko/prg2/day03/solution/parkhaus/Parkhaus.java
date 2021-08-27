package ch.teko.prg2.day03.solution.parkhaus;

import java.util.ArrayList;

public class Parkhaus {
    private String name;
    // Etage[] durch ArrayList<Etage> ersetzt
    private ArrayList<Etage> etagen;

    public Parkhaus(final String name, final ArrayList<Etage> etagen) {
        this.name = name;
        this.etagen = etagen;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Etage> getEtagen() {
        return etagen;
    }

}
