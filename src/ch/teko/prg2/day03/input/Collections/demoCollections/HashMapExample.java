package ch.teko.prg2.day03.input.Collections.demoCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //HashMap erstellen
        HashMap<String, Book> books = new HashMap<>();

        //Schlüsselwert-Paare hinzufügen
        books.put(" 978 -3 -8362 -5854 -8 ", new Book(" Linux -- Das umfassende Handbuch", 2017));
        books.put(" 978 -3 -8362 -6341 -2 ", new Book(" Linux -Kommandoreferenz", 2018));
        books.put(" 978 -3 -8362 -6519 -5 ", new Book(" Raspberry Pi -- Das umfassende Handbuch", 2018));

        // Schleife über alle Keys
        Set<String> keySet = books.keySet();
        for (String isbn : keySet) {
            Book b = books.get(isbn);
            System.out.format(" ISBN: %s\n", isbn);
            System.out.format(" %s (%d)\n", b.getTitle(), b.getPublished());
        }

        // Schleife nur für die Values
        Collection<Book> values = books.values();
        for (Book b : values) {
            System.out.format(" %s (%d)\n", b.getTitle(), b.getPublished());
        }

        // e hat den Typ Map.Entry <String , Book >
        Set<Map.Entry<String, Book>> entrySet = books.entrySet();
        for(Map.Entry<String, Book> e: entrySet) {
        System.out.format(" ISBN: %s\n" , e.getKey());
        Book b = (Book) e.getValue();
        System.out.format(" %s (%d)\n" , b.getTitle(), b.getPublished()); }
    }
}
