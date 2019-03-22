package edu.ap.karenveraa;

/**
 * Allegiance
 */
public class Allegiance {

    private String house; // FK: House.name
    private String karakter; // FK: Karakter.name

    public Allegiance() {
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