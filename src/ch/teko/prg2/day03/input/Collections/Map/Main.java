package ch.teko.prg2.day03.input.Collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Gegeben ist folgende HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        /* Fügen sie der HashMap dei Werte:
         * 1 "Tick"
         * 2 "Trick"
         * 3 "Track"
         * hinzu.
         */
        hashMap.put(1, "Trick");
        hashMap.put(2, "Trick");
        hashMap.put(3, "Track");

        //Geben Sie Key und Value mit Hilfe der Methode keySet() aus.
        Set<Integer> keySet = hashMap.keySet();
        for (Integer i : keySet) {
            System.out.println(i);
            System.out.println(hashMap.get(i));
        }

        //Geben Sie Key und Value mit Hilfe der Methode entrySet() aus.
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String> e : entrySet) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Entfernen sie den Eintrag mit dem Key 2
        hashMap.remove(2);

        //Leeren Sie die ganze Collection
        hashMap.clear();
    }
}
