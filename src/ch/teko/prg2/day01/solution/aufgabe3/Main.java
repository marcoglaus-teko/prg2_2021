package ch.teko.prg2.day01.solution.aufgabe3;

public class Main {
    public static void main(String[] args) {
        Lehrling l1 = new Lehrling("Meier", "Peter", 16, 1000, 5, 123);
        System.out.printf("Hallo %s deine MitarbeiterID ist %d", l1.getVorname(), l1.getMitarbeiterID());
    }
}
