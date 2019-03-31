package edup.ap.entity;

public class Character {
    private String name;
    private int deathYear;
    private String gender;
    private String nobility;

    public Character(String name, int deathYear, String gender, String nobility) {
        this.name = name;
        this.deathYear = deathYear;
        this.gender = gender;
        this.nobility = nobility;
    }

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void setDeathYear(int deathYear) {
        this.deathYear = deathYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }
}
