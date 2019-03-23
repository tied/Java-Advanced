package edu.ap.karenveraa;

import org.hibernate.Session;

/**
 * Side
 */
public class Side {
    public enum EnumType {
        ATT, DEF
    }

    public enum EnumOutcome {
        WIN, LOSE
    }

    private int ID; // PK
    private String battle; // FK: Battle.name
    private String house; // FK: House.name
    private EnumType type;
    private EnumOutcome outcome;

    public Side(int pID, Battle pBattle, House pHouse, EnumType pType, EnumOutcome pOut) {
        this.ID = pID;
        this.battle = pBattle.getName();
        this.house = pHouse.getName();
        this.type = pType;
        this.outcome = pOut;
    }

    public void StoreAndSafe(int pID, Battle pBattle, House pHouse, EnumType pType, EnumOutcome pOut) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Side side = new Side(pID, pBattle, pHouse, pType, pOut);
        session.save(side);

        session.getTransaction().commit();
    }

    /**
     * @return the iD
     */
    public int getID() {
        return ID;
    }

    /**
     * @param iD the iD to set
     */
    public void setID(int iD) {
        ID = iD;
    }

    /**
     * @return the battle
     */
    public String getBattle() {
        return battle;
    }

    /**
     * @param battle the battle to set
     */
    public void setBattle(String battle) {
        this.battle = battle;
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
     * @return the type
     */
    public EnumType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(EnumType type) {
        this.type = type;
    }

    /**
     * @return the outcome
     */
    public EnumOutcome getOutcome() {
        return outcome;
    }

    /**
     * @param outcome the outcome to set
     */
    public void setOutcome(EnumOutcome outcome) {
        this.outcome = outcome;
    }

}