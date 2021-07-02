package ch.teko.prg2.day01.input.inheritence;

public abstract class Luftfahrzeug extends Fahrzeug {
    private int altitude;

    public Luftfahrzeug(Position position, int altitude) {
        super(position);
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
