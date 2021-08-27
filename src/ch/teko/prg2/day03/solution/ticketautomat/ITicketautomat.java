package ch.teko.prg2.day03.solution.ticketautomat;

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
