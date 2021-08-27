package ch.teko.prg2.day03.solution;

import ch.teko.prg2.day03.solution.auto.Auto;
import ch.teko.prg2.day03.solution.parkhaus.Etage;
import ch.teko.prg2.day03.solution.parkhaus.Parkhaus;
import ch.teko.prg2.day03.solution.parkhaus.Parkplatz;
import ch.teko.prg2.day03.solution.ticketautomat.Ticketautomat;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int simulationOfEtagen = 2;
        ArrayList<Etage> etagen = new ArrayList<>();
        int simulationOfParkplaetze = 4;

        for (int i = 0; i < simulationOfEtagen; i++) {
            ArrayList<Parkplatz> parkplaetze = new ArrayList<>();
            for (int n = 0; n < simulationOfParkplaetze; n++) {
                Auto auto = new Auto();
                parkplaetze.add(new Parkplatz());
                parkplaetze.get(n).parkieren(auto);
            }
            etagen.add(new Etage(i, parkplaetze, new Ticketautomat(12345, 1002)));
        }

        Parkhaus parkhaus = new Parkhaus("Kesselturm", etagen);

        System.out.println("Belegung Parkhaus Kesselturm:");
        for (int i = 0; i < parkhaus.getEtagen().size(); i++) {
            System.out.printf("Auf der Etage %s, ist %n",
                    parkhaus.getEtagen().get(i).getEtagenBezeichnung()
            );

            for (int n = 0; n < parkhaus.getEtagen().get(i).getParkplaetze().size(); n++) {
                System.out.printf("Ein %s in %s mit %d PS auf dem Platz mit der Nummer %d parkiert fuer %d Minuten zum Preis von %.02f.- CHF. %n",

                        parkhaus.getEtagen().get(i).getParkplaetze().get(n).getAuto().getMarke(),
                        parkhaus.getEtagen().get(i).getParkplaetze().get(n).getAuto().getFarbe(),
                        parkhaus.getEtagen().get(i).getParkplaetze().get(n).getAuto().getPs(),
                        n,
                        parkhaus.getEtagen().get(i).getParkplaetze().get(n).getParkzeit(),
                        parkhaus.getEtagen().get(i).getTicketautomat().calculateParkingPrice(parkhaus.getEtagen().get(i).getParkplaetze().get(n).getParkzeit())
                );
            }
            System.out.printf("%n");
        }

    }
}
