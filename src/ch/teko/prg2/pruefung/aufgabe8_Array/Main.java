package ch.teko.prg2.pruefung.aufgabe8_Array;

public class Main {
    public static void main(String[] args) {
        // Fahrzeuge
        Fahrzeug fahrzeug1 = new Fahrzeug("Rot");
        Fahrzeug fahrzeug2 = new Fahrzeug("Gruen");
        Fahrzeug fahrzeug3 = new Fahrzeug("Blau");

        // Parkplaetze
        Parkplatz[] parkplaetze = new Parkplatz[3];
        parkplaetze[0] = new Parkplatz(fahrzeug1);
        parkplaetze[1] = new Parkplatz(fahrzeug2);
        parkplaetze[2] = new Parkplatz(fahrzeug3);

        // Parkhaus
        Parkhaus kesselturm = new Parkhaus(parkplaetze);

        // Ausgabe
        for (Parkplatz p : kesselturm.getParkplaetze()) {
            System.out.println(p.getFahrzeug().getFarbe());
        }
    }
}
