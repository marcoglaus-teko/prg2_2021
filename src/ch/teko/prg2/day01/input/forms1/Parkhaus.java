package ch.teko.prg2.day01.input.forms1;

public class Parkhaus {
    private String name;
    private int etagen;
    private final Parkplatz[] parkplaetze;
    private final Ticketautomat ticketautomat;

    public Parkhaus(String name, int etagen, Parkplatz[] parkplaetze, Ticketautomat ticketautomat) {
        this.name = name;
        this.etagen = etagen;
        this.parkplaetze = parkplaetze;
        this.ticketautomat = ticketautomat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEtagen() {
        return etagen;
    }

    public void setEtagen(int etagen) {
        this.etagen = etagen;
    }

    public Parkplatz[] getParkplaetze() {
        return parkplaetze;
    }

    public Ticketautomat getTicketautomat() {
        return ticketautomat;
    }

}
