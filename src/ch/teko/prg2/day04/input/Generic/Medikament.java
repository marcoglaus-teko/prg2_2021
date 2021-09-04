package ch.teko.prg2.day04.input.Generic;

import java.util.ArrayList;

public class Medikament {
    private ArrayList<String> liste;

    public Medikament(ArrayList<String> liste) {
        this.liste = liste;
    }

    public ArrayList<String> getListe() {
        return liste;
    }

    public void setListe(ArrayList<String> liste) {
        this.liste = liste;
    }
}
