package ch.teko.prg2.day01.input.forms1;

public class Main {

    public static void main(String[] args) {

        int simulationOfParkplaetze = 3;
        Parkplatz[] parkplaetze = new Parkplatz[simulationOfParkplaetze];

        for (int i = 0; i < parkplaetze.length; i++){
            Auto auto = new Auto();
            parkplaetze[i] = new Parkplatz();
            parkplaetze[i].setAuto(auto);
        }

        Ticketautomat ticketautomat = new Ticketautomat(123455,1001);
        Parkhaus parkhaus = new Parkhaus("Kesselturm", 4, parkplaetze, ticketautomat);

        for (int i = 0; i < parkhaus.getParkplaetze().length; i++) {
            System.out.printf("Ein %s in %s mit %d PS ist auf dem Platz mit der Nummer %d im Parkhaus %s parkiert. %n",
                    parkhaus.getParkplaetze()[i].getAuto().getMarke(),
                    parkhaus.getParkplaetze()[i].getAuto().getFarbe(),
                    parkhaus.getParkplaetze()[i].getAuto().getPs(),
                    i,
                    parkhaus.getName());
        }
    }
}
