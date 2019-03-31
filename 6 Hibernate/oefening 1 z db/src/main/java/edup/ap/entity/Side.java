package edup.ap.entity;

import edup.ap.entity.enumeration.Outcome;
import edup.ap.entity.enumeration.Type;

public class Side {
    private int id;
    private Battle battle;
    private House house;
    private Type type;
    private Outcome outcome;

    public Side(int id, Battle battle, House house, Type type, Outcome outcome) {
        this.id = id;
        this.battle = battle;
        this.house = house;
        this.type = type;
        this.outcome = outcome;
    }

    public Side() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBattle() {
        return this.battle.getName();
    }

    public void setBattle(String battle) {
        this.battle.setName(battle);
    }

    public String getHouse() {
        return this.house.getName();
    }

    public void setHouse(String house) {
        this.house.setName(house);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }

}
