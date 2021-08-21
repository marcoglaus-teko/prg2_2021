package ch.teko.prg2.day03.input.Collections.demoCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //HashMap erstellen
        HashMap<String, Book> books = new HashMap<>();
        books.put(" 978 -3 -8362 -5854 -8 ", new Book(" Linux -- Das umfassende Handbuch", 2017));
        books.put(" 978 -3 -8362 -6341 -2 ", new Book(" Linux -Kommandoreferenz", 2018));
        books.put(" 978 -3 -8362 -6519 -5 ", new Book(" Raspberry Pi -- Das umfassende Handbuch", 2018));

        // Schleife über alle Keys
        for (String isbn : books.keySet()) {
            Book b = books.get(isbn);
            System.out.format(" ISBN: %s\n", isbn);
            System.out.format(" %s (%d)\n", b.getTitle(), b.getPublished());
        }

        // Schleife nur für die Values
        for (Book b : books.values()) {
            System.out.format(" %s (%d)\n", b.getTitle(), b.getPublished());
        }

        // e hat den Typ Map.Entry <String , Book >
        for(Map.Entry<String, Book> e: books.entrySet()) {
        System.out.format(" ISBN: %s\n" , e.getKey());
        Book b = (Book) e.getValue();
        System.out.format(" %s (%d)\n" , b.getTitle(), b.getPublished()); }
    }
}
