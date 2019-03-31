package edup.ap.entity;

public class Battle {
    private String name;
    private int year;
    private String type;

    public Battle() {}

    public Battle(String name, int year, String type) {
        this.name = name;
        this.year = year;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
