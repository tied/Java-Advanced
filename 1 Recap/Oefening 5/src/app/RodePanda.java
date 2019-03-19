package app;

import java.time.*;

public class RodePanda {
    private String naam;
    private LocalDate bday;
    private String gender;
    private String lieverlingseten;

    public RodePanda(String name, LocalDate dateofbirth, String geslacht, String food) {
        this.naam = name;
        this.bday = dateofbirth;
        this.gender = geslacht;
        this.lieverlingseten = food;
    }

    private int Leeftijd() {
        Period p = Period.between(bday, LocalDate.now());
        return p.getYears();
    }

    public void print() {
        String out;
        out = naam + " is " + Leeftijd() + " jaar oud. ";

        if (gender.toLowerCase() == "vrouw") {
            out += "Haar lievelingseten is: " + lieverlingseten;
        } else {
            out += "Zijn lievelingseten is: " + lieverlingseten;
        }

        System.out.println(out);
    }
}