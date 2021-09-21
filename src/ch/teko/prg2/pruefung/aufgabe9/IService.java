package ch.teko.prg2.pruefung.aufgabe9;

public interface IService {
    Artikel search(long ean);
    void add(Artikel artikel, String abteilung);
}
