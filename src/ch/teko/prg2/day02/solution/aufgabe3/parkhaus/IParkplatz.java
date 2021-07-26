package ch.teko.prg2.day02.solution.aufgabe3.parkhaus;

import ch.teko.prg2.day02.solution.aufgabe3.auto.Auto;

/**
 * @version 2.0
 */
public interface IParkplatz {
    /**
     * Die Methode parkieren erwartet ein Parameter des Klassentyps Auto. Es gibt keinen Returnwert.
     * @param auto
     */
    void parkieren(Auto auto);
}
