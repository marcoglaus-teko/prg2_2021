package ch.teko.prg2.pruefung.aufgabe9;

public class Artikel {
    // EAN = European Article Number
    private long ean;
    private String name;

    public Artikel(long ean, String name) {
        this.ean = ean;
        this.name = name;
    }

    public long getEan() {
        return ean;
    }

    public String getName() {
        return name;
    }
}
