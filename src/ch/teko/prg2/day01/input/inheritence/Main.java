package ch.teko.prg2.day01.input.inheritence;

public class Main {
    public static void main(String[] args) {
        Cesna cesna = new Cesna(new Position(10,11), 2000, 800);
        cesna.movePosition();
    }
}
