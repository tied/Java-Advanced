package edu.ap.karenveraa;

import org.hibernate.Session;

/**
 * house
 */
public class House {

    private String name; // PK

    public House(String pName) {
        this.name = pName;
    }

    public void StoreAndSafe(String pName) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        House house = new House(pName);
        session.save(house);

        session.getTransaction().commit();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}