package app;

import java.time.*;

public class App {
    public static void main(String[] args) throws Exception {

        LocalDate date = LocalDate.of(1999, 8, 27);

        RodePanda rp = new RodePanda("Suzy", date, "vrouw", "Bamboe");
        rp.print();

    }
}