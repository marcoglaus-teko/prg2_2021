package ch.teko.prg2.day03.solution.parkhaus;

import ch.teko.prg2.day03.solution.auto.Auto;

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
