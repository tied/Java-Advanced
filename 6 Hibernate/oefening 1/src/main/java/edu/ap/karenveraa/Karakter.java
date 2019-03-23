package edu.ap.karenveraa;

import org.hibernate.Session;

/**
 * Karakter
 */
public class Karakter {

    private String name; // PK
    private int deathYear;
    private char gender;
    private String nobility;

    public Karakter(String pName, int pDeathYear, char pGender, String pNobility) {
        this.name = pName;
        this.deathYear = pDeathYear;
        this.gender = pGender;
        this.nobility = pNobility;
    }

    public void StoreAndSafe(String pName, int pDeathYear, char pGender, String pNobility) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Karakter kar = new Karakter(pName, pDeathYear, pGender, pNobility);
        session.save(kar);

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

    /**
     * @return the deathYear
     */
    public int getDeathYear() {
        return deathYear;
    }

    /**
     * @param deathYear the deathYear to set
     */
    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the nobility
     */
    public String getNobility() {
        return nobility;
    }

    /**
     * @param nobility the nobility to set
     */
    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

}