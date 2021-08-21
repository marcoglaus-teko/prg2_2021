package ch.teko.prg2.day03.input.Collections.Set;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("AA");
        hashSet.add("D");

        for (String s: hashSet) {
            System.out.println(s);
        }

        //Entfernen Sie "AA" aus dem hashSet


        for (String s: hashSet) {
            System.out.println(s);
        }
    }
}
