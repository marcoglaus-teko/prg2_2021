package ch.teko.prg2.pruefung.aufgabe9;

import java.util.HashMap;

public class Abteilung {
    private String name;
    private HashMap<Long, Artikel> arikelListe;

    public Abteilung(String name, HashMap<Long, Artikel> arikelListe) {
        this.name = name;
        this.arikelListe = arikelListe;
    }

    public String getName() {
        return name;
    }

    public HashMap<Long, Artikel> getArikelListe() {
        return arikelListe;
    }

}
