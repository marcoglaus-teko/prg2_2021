package ch.teko.prg2.day03.input.Collections.demoCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);

        for (Integer i: set) {
            System.out.println(i);
        }

        //Iterator = Positionszeiger
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
