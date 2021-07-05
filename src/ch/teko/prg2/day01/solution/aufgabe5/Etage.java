package ch.teko.prg2.day01.solution.aufgabe5;

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
