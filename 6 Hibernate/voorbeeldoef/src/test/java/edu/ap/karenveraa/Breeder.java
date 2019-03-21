package edu.ap.karenveraa;

public class Breeder {
    private int id;
    private String name;
    private String logo;

    // Een constructor zonder argumenten is noodzakelijk
    public Breeder() {
        super();
    }

    // getters and setter
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}