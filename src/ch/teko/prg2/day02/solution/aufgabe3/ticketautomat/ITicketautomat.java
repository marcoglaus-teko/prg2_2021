package ch.teko.prg2.day02.solution.aufgabe3.ticketautomat;

/**
 * @version 2.0
 */
public interface ITicketautomat {
    /**
     * Die Methode calculateParkingPrice erwartet einen Parameter des Typs Integer.
     * @param parkTimeInMinutes
     * @return Einen Wert des Typs double.
     */
    double calculateParkingPrice(int parkTimeInMinutes);
}
