package app;

import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        // Constructor moest nog gemaakt worden
        TitleList filmpkes = new TitleList();

        // Isse gucci van de eerste keer, geen aanpassingen nodig :)
        filmpkes.addTitle("Nerve");
        filmpkes.addTitle("Avengers");

        // Declaratie iterator
        Iterator<String> iteratorFilm = filmpkes.titleIterator();

        // Gebruik iterator
        do {
            String element = iteratorFilm.next();
            System.out.println(element);
        } while (iteratorFilm.hasNext());

        // Nieuwe titels toevoegen
        filmpkes.addTitle("Nice Guys");
        filmpkes.addTitle("Tarzan");
        filmpkes.addTitle("Silence of the lambs");

        // Gebruik iterator
        // De output van de vorige iterator wordt overschreven
        while (iteratorFilm.hasNext()) {
            String element = iteratorFilm.next();
            System.out.println(element);
        }

    }
}