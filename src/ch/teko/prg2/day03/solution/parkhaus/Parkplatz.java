package ch.teko.prg2.day03.solution.parkhaus;

import ch.teko.prg2.day03.solution.auto.Auto;

public class Parkplatz implements IParkplatz {
    private boolean besetzt;
    private Auto auto;
    private final int parkzeit;

    public Parkplatz() {
        this.besetzt = false;
        this.parkzeit = (int) (Math.random() * 43800);
    }

    public boolean isBesetzt() {
        return besetzt;
    }

    public void setBesetzt(boolean besetzt) {
        this.besetzt = besetzt;
    }

    public Auto getAuto() {
        return auto;
    }

    public int getParkzeit() {
        return parkzeit;
    }

    @Override
    public void parkieren(Auto auto) {
        if (!isBesetzt()) {
            this.auto = auto;
            setBesetzt(true);
        } else {
            System.out.println("Parkplatz ist besetzt!");
        }
    }
}
