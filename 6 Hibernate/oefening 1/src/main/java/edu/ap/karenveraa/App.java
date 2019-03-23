package edu.ap.karenveraa;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Battle bat = new Battle("Fist of 2019", 2019, "Serieus");
        Battle battre = new Battle("Beef", 1998, "Discussie");
        Battle old = new Battle("Ages ago", 1958, "Really nothing");
        System.out.println("All battles are created");

        House ares = new House("House of Ares");
        House nept = new House("House of Neptunus");
        House ath = new House("House of Athene");
        House zeus = new House("House of Zeus");
        System.out.println("All Houses are created");

        Side athares = new Side(1, bat, ath, Side.EnumType.ATT, Side.EnumOutcome.LOSE);

    }
}
