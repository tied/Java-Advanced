package app;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> names = new ArrayList<>();

        names.add("Abu");
        names.add("Bob");
        names.add("Bea");
        Iterator<String> nameIterator = names.iterator();

        while (nameIterator.hasNext()) {
            String name = nameIterator.next();
            System.out.println(name);
            if (name.toString() == "Bob") {
                nameIterator.remove();
            }
        }

    }
}