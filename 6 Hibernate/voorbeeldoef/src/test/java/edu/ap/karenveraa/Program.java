package edu.ap.karenveraa;

import org.hibernate.Session;

public class Program {
    public static void main(String[] args) {
        Program prg = new Program();

        if (args[0].equals("store")) {
            prg.createAndStoreBreeder("Breeder Name", "Breeder logo");
        }

        HibernateUtil.getSessionFactory().close();
    }

    private void createAndStoreBreeder(String name, String logo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Breeder breeder = new Breeder();
        breeder.setName(name);
        breeder.setLogo(logo);

        session.save(breeder);

        session.getTransaction().commit();
    }
}