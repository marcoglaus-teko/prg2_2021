package ch.teko.prg2.day03.input.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        double[] doubleArray = {3.5, 4.5, 2.1, 6, 5.9, 4.6, 5.1};

        for (double d: doubleArray) {
            System.out.println(d);
        }

        /* Das obere Array enthält Noten der letzten Prüfung. Wir möchten nun gerne alle Noten ausgeben, die besser waren als ein 4.5.
         * Dazu löschen wir Noten schlechter als 4.5 aus dem Array. Halt, Stopp. Ein fixed-size Array ist unveränderbar in seiner Grösse.
         * Schreiben Sie das Array neu als Collection ArrayList und entfernen Sie Noten kleiner 4.5.
         * Tipp: Verwenden Sie beim Entfernen den Iterator.
         */

        //ArrayList definieren
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (double d : doubleArray) {
            doubleArrayList.add(d);
        }

        //Iterator defineren + while-loop
        Iterator<Double> itr = doubleArrayList.iterator();
        while (itr.hasNext()) {
            if (itr.next() < 4.5) {
                itr.remove();
            }
        }

        for (double d : doubleArrayList) {
            System.out.println(d);
        }

    }
}
