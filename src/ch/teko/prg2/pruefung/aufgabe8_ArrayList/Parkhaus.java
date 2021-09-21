package ch.teko.prg2.pruefung.aufgabe8_ArrayList;

import java.util.ArrayList;

public class Parkhaus {
    private ArrayList<Parkplatz> parkplaetze;

    public Parkhaus(ArrayList<Parkplatz> parkplaetze) {
        this.parkplaetze = parkplaetze;
    }

    public ArrayList<Parkplatz> getParkplaetze() {
        return parkplaetze;
    }
}
