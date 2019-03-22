package edu.ap.karenveraa;

/**
 * Commands
 */
public class Commands {

    private int side; // FK: Side.id
    private String karakter; // FK: karakter.name

    public Commands() {
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