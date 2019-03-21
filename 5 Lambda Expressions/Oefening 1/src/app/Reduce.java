package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Reduce
 */
@FunctionalInterface
public interface Reduce<T> {

    boolean map(T source);

    public static <T> List<T> filter(List<T> oud, Reduce<T> functie) {
        List<T> nieuw = new ArrayList();

        for (T item : oud) {
            if (functie.map(item)) {
                nieuw.add(item);
            }
        }

        return nieuw;
    }
    /*
     * public static <U> int[] mapToInt(U[] list, Reduce<? super U> mapper) { int[]
     * mappedValues = new int[list.length];
     * 
     * for (int i = 0; i < list.length; i++) { mappedValues[i] =
     * mapper.map(list[i]); }
     * 
     * return mappedValues; }
     */
}