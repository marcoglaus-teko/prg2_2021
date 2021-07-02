package ch.teko.prg2.day01.input.forms1;

public class Ticketautomat {
    private int fabrikationsnummer;
    private int softwarerelease;

    public Ticketautomat(int fabrikationsnummer, int softwarerelease) {
        this.fabrikationsnummer = fabrikationsnummer;
        this.softwarerelease = softwarerelease;
    }

    public int getFabrikationsnummer() {
        return fabrikationsnummer;
    }

    public void setFabrikationsnummer(int fabrikationsnummer) {
        this.fabrikationsnummer = fabrikationsnummer;
    }

    public int getSoftwarerelease() {
        return softwarerelease;
    }

    public void setSoftwarerelease(int softwarerelease) {
        this.softwarerelease = softwarerelease;
    }
}
