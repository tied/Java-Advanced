package edu.ap.karenveraa;

import org.hibernate.Session;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Maken van de verschillende data
        Battle bat = new Battle("Fist of 2019", 2019, "Serieus");
        Battle old = new Battle("Ages ago", 2000, "Really nothing");

        House nept = new House("House of Neptunus");
        House ath = new House("House of Athene");

        Side sideAth = new Side(1, bat, ath, Side.EnumType.ATT, Side.EnumOutcome.LOSE);
        Side sideNep = new Side(2, bat, nept, Side.EnumType.DEF, Side.EnumOutcome.WIN);

        Karakter anna = new Karakter("Annabeth", 2020, 'V', "Very");
        Karakter perc = new Karakter("Percy", 2025, 'M', "Yes");

        Allegiance alPer = new Allegiance(nept, perc);
        Allegiance alAnn = new Allegiance(ath, anna);

        Commands commP = new Commands(sideNep, perc);
        Commands commA = new Commands(sideAth, anna);
        System.out.println("Alles is gemaakt");

        // Alles opslagen
        bat.StoreAndSafe();

        /*
         * //Query aanmaken String hql = "SELECT K.firstName FROM Karakter K"; Query
         * query = session.createQuery(hql); List results = query.list();
         */
    }
}
