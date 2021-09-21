package ch.teko.prg2.pruefung.aufgabe5;

public enum Wochentage {
    MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;

    static void writeAllDays() {
        for (Wochentage day : Wochentage.values()) {
            System.out.println(day);
        }
    }
}
