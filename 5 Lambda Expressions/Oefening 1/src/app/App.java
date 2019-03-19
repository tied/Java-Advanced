package app;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Lijst aanmaken
        List<Student> studenten = new ArrayList<>();
        String[] names = { "Karen", "Gitte", "Christiaan" };

        // Hier studenten toevoegen met hun punten
        studenten.add(new Student("Karen", 17));
        studenten.add(new Student("Tuur", 16));
        studenten.add(new Student("Tibo", 17));
        studenten.add(new Student("Melissa", 12));

        // Lijst testen
        Student[] deTop = Reduce.filter(studenten, s -> s.getScore() > 15);
        int[] lengthMapping = Reduce.mapToInt(names, (String name) -> name.length());

        // Lijsten printen
        System.out.println("Voorbeeld: ");

        for (int item : lengthMapping) {

            System.out.println(item);

        }

        System.out.println("");
        System.out.println("De namen: ");

        for (Student item : studenten) {
            System.out.println(item);
        }

        /*
         * System.out.println("De namen: ");
         * 
         * for (Student item : deTop) { System.out.println(item); }
         */

    }
}