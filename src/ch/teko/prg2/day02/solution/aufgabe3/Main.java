package ch.teko.prg2.day02.solution.aufgabe3;

import ch.teko.prg2.day02.solution.aufgabe3.auto.Auto;
import ch.teko.prg2.day02.solution.aufgabe3.parkhaus.Etage;
import ch.teko.prg2.day02.solution.aufgabe3.parkhaus.Parkhaus;
import ch.teko.prg2.day02.solution.aufgabe3.parkhaus.Parkplatz;
import ch.teko.prg2.day02.solution.aufgabe3.ticketautomat.Ticketautomat;

public class Main {

    public static void main(String[] args) {

        int simulationOfEtagen = 2;
        Etage[] etagen = new Etage[simulationOfEtagen];
        int simulationOfParkplaetze = 4;

        for (int i = 0; i < etagen.length; i++) {
            Parkplatz[] parkplaetze = new Parkplatz[simulationOfParkplaetze];
            for (int n = 0; n < parkplaetze.length; n++) {
                Auto auto = new Auto();
                parkplaetze[n] = new Parkplatz();
                parkplaetze[n].parkieren(auto);
            }
            etagen[i] = new Etage(i, parkplaetze, new Ticketautomat(12345, 1002));
        }

        Parkhaus parkhaus = new Parkhaus("Kesselturm", etagen);

        System.out.println("Belegung Parkhaus Kesselturm:");
        for (int i = 0; i < parkhaus.getEtagen().length; i++) {
            System.out.printf("Auf der Etage %s, ist %n",
                    parkhaus.getEtagen()[i].getEtagenBezeichnung()
            );

            for (int n = 0; n < parkhaus.getEtagen()[i].getParkplaetze().length; n++) {
                System.out.printf("Ein %s in %s mit %d PS auf dem Platz mit der Nummer %d parkiert fuer %d Minuten zum Preis von %.02f.- CHF. %n",

                        parkhaus.getEtagen()[i].getParkplaetze()[n].getAuto().getMarke(),
                        parkhaus.getEtagen()[i].getParkplaetze()[n].getAuto().getFarbe(),
                        parkhaus.getEtagen()[i].getParkplaetze()[n].getAuto().getPs(),
                        n,
                        parkhaus.getEtagen()[i].getParkplaetze()[n].getParkzeit(),
                        parkhaus.getEtagen()[i].getTicketautomat().calculateParkingPrice(parkhaus.getEtagen()[i].getParkplaetze()[n].getParkzeit())
                );
            }
            System.out.printf("%n");
        }

    }
}
