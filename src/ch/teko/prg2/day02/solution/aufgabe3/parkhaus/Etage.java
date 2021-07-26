package ch.teko.prg2.day02.solution.aufgabe3.parkhaus;

import ch.teko.prg2.day02.solution.aufgabe3.ticketautomat.Ticketautomat;

public class Etage {
    private String etagenBezeichnung;
    private Parkplatz[] parkplaetze;
    private Ticketautomat ticketautomat;

    public Etage(final int etagenNummer, final Parkplatz[] parkplaetze, final Ticketautomat ticketautomat) {
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

    public Parkplatz[] getParkplaetze() {
        return parkplaetze;
    }

    public Ticketautomat getTicketautomat() {
        return ticketautomat;
    }
}
