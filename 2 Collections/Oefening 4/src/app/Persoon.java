package app;

public class Persoon {
    private String name;

    public Persoon(String n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return this.name;
    }
}