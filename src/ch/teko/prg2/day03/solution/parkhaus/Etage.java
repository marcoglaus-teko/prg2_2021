package ch.teko.prg2.day03.solution.parkhaus;

import ch.teko.prg2.day03.solution.ticketautomat.Ticketautomat;

import java.util.ArrayList;

public class Etage {
    private String etagenBezeichnung;
    // Parkplatz[] durch ArrayList<Parkplatz> ersetzt
    private ArrayList<Parkplatz> parkplaetze;
    private Ticketautomat ticketautomat;

    public Etage(final int etagenNummer, final ArrayList<Parkplatz> parkplaetze, final Ticketautomat ticketautomat) {
        this(etagenNummer);
        this.parkplaetze = parkplaetze;
        this.ticketautomat = ticketautomat;
    }

    private Etage(int etagenNummer) {
        this.etagenBezeichnung = "Etage: " + etagenNummer;
    }

    public String getEtagenBezeichnung() {
        return etagenBezeichnung;
    }

    public ArrayList<Parkplatz> getParkplaetze() {
        return parkplaetze;
    }

    public Ticketautomat getTicketautomat() {
        return ticketautomat;
    }
}
