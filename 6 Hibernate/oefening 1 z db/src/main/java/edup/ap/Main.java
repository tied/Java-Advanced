package edup.ap;

import edup.ap.entity.*;
import org.hibernate.Session;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Character;

public class Main<T> {

    private static void storeBattle(Battle battle) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        session.save(battle);
        session.getTransaction().commit();

        System.out.println("Saved object " + battle);
    }

    /*private static void storeEntity(T t) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();

        System.out.println("Saved object " + t);
    }*/

    public static void main(String[] args) {
        JDBConnection conn = JDBConnection.getUniqueInstance();
        String database = "hibernatetest";

        Battle battle;
        Allegiance allegiance;
        Character character;
        Commands commands;
        House house;
        Side side;


        conn.openConnection(database, "root", "root");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "C:\\Users\\firat\\Documents\\AP\\2e Jaar\\Java Advanced\\Praktijk\\Week4Hibernate\\battles.csv"
            ));
            reader.readLine(); // Skips the first line, because this is just info about the file

            String line; // One line of the file
            String[] battles; // Array so we can store values split by comma delimiter

            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                battles = line.split(",");

                battle = new Battle(battles[0], Integer.valueOf(battles[1]), battles[14]);
                storeBattle(battle);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        conn.closeConnection();
    }
}
