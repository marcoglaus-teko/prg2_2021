package ch.teko.prg2.day01.input.inheritence;

public class Cesna extends Luftfahrzeug {
    private int v;

    public Cesna(Position position, int altitude, int v) {
        super(position, altitude);
        this.v = v;
    }

    @Override
    public void movePosition() {
        System.out.printf("#fliege");
    }
}
