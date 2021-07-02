package ch.teko.prg2.day01.input.repetition;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", "Schwarz", 304);
        System.out.printf("Marke: %s%nFarbe: %s%nPS: %d", auto1.getMarke(), auto1.getFarbe(), auto1.getPs());
    }
}
