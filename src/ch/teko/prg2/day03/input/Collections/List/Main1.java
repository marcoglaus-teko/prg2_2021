package ch.teko.prg2.day03.input.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Tick");
        list.add("Trick");
        list.add("Track");

        /*
         * Die Werte einer Liste können auf verschiedene Weise ausgegeben werden. Vervollständigen Sie.
         */

        // for-each loop (enhanced for loop)
        for (String s: list) {
            System.out.println(s);
        }

        // for loop (klassische for-Schleife)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Iterator (oder ListIterator)
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // System.out.println
        System.out.println(list);

    }

}
