package ch.teko.prg2.day03.input.Collections.demoCollections;

public class Book {
    private String title = "";
    private int published=0;

    public Book(String title, int published) {
        this.title = title;
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public int getPublished() {
        return published;
    }
}
