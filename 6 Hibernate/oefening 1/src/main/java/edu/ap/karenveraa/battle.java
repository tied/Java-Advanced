package edu.ap.karenveraa;

/**
 * battle
 */
public class Battle {

    private String name; // PK
    private int year;
    private String type;

    public Battle(String pName, int pYear, String pType) {
        this.name = pName;
        this.year = pYear;
        this.type = pType;
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
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}