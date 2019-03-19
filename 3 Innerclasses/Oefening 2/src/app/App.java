package app;

public class App {
    public static void main(String[] args) throws Exception {
        Library test = new Library("Karen's private bib");
        Library.Cabinet kast = test.new Cabinet(1);
        Library.Cabinet.Shelf plank = kast.new Shelf(5);
        Library.Cabinet.Shelf.Book boekje = plank.new Book(9);

        System.out.println(boekje.getFullId());

    }
}