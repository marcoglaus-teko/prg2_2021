package ch.teko.prg2.pruefung.aufgabe4;

public class Main {
    public static void main(String[] args) {
        // zum vervollständigen
        Mitarbeiter ma1 = new Arbeiter(001, "Meier", 1, 25.5, 40);
        // oder
        // Mitarbeiter ma1 = new Angestellter(002, "Peter", 10, 3500.0, 450.0);
        System.out.println(ma1.monatsBrutto());
    }
}
