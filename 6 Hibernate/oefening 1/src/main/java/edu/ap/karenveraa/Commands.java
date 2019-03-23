package edu.ap.karenveraa;

import org.hibernate.Session;

/**
 * Commands
 */
public class Commands {

    private int side; // FK: Side.id
    private String karakter; // FK: karakter.name

    public Commands(Side pSide, Karakter pKarakter) {
        this.side = pSide.getID();
        this.karakter = pKarakter.getName();
    }

    public void StoreAndSafe(Side pSide, Karakter pKarakter) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Commands comm = new Commands(pSide, pKarakter);
        session.save(comm);

        session.getTransaction().commit();
    }

    /**
     * @return the side
     */
    public int getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(int side) {
        this.side = side;
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