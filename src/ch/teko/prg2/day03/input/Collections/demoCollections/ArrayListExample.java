package ch.teko.prg2.day03.input.Collections.demoCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList erstellen
        ArrayList<Integer> list = new ArrayList<>();

        //Elemente hinzufügen
        list.add(1);
        list.add(2);
        list.add(3);

        //Elemente einfach ausgeben
        for (int e: list) {
            System.out.println(e);
        }

        //Iterator = Positionszeiger
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Elemente löschen
        list.remove(1);

        for (int e: list) {
            System.out.println(e);
        }

        it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
