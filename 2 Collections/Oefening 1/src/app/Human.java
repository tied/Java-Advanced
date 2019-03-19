package app;

public class Human {
    private String naam;
    private String geslacht;

    public Human(String name, String gender) {
        this.naam = name;
        this.geslacht = gender;
    }

    public String print() {
        return naam + ": " + geslacht;
    }
}