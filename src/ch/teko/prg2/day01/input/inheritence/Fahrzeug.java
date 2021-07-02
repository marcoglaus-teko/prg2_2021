package ch.teko.prg2.day01.input.inheritence;

public abstract class Fahrzeug {
    private Position position;

    public Fahrzeug(Position position) {
        this.position = position;
    }

    //Abtracte Methode
    public abstract void movePosition();

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
