package app;

import java.util.Arrays;
import java.util.List;

/**
 * Ontology
 */
public class Ontology<T> {

    Persoon a = new Persoon("Karen");
    Persoon b = new Persoon("Tuur");

    List<T> objecten;

    public Ontology(T objecten) {
        this.objecten = Arrays.asList(objecten);
    }

    public void MakeLink(T a, T b, <?extends Link> l) {
        
    }

}