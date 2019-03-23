package edu.ap.karenveraa;

import org.hibernate.Session;

/**
 * Allegiance
 */
public class Allegiance {

    private String house; // FK: House.name
    private String karakter; // FK: Karakter.name

    public Allegiance(House pHouse, Karakter pMens) {
        this.house = pHouse.getName();
        this.karakter = pMens.getName();
    }

    public void StoreAndSafe(House pHouse, Karakter pMens) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Allegiance allegiance = new Allegiance(pHouse, pMens);
        session.save(allegiance);

        session.getTransaction().commit();
    }

    /**
     * @return the house
     */
    public String getHouse() {
        return house;
    }

    /**
     * @param house the house to set
     */
    public void setHouse(String house) {
        this.house = house;
    }

    /**
     * @return the karakter
     */
    public String getKarakter() {
        return karakter;
    }

    /**
     * @param karakter the karakter to set
     */
    public void setKarakter(String karakter) {
        this.karakter = karakter;
    }

}