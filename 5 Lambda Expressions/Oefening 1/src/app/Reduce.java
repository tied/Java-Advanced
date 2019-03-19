package app;

/**
 * Reduce
 */
@FunctionalInterface
public interface Reduce<T> {

    int map(T source);

    public static <U> Student[] filter(Student[] list, Reduce<? super U> mapper) {
        Student[] output = new Student[list.length];

        for (int i = 0; i < list.length; i++) {
            output[i] = mapper.map(list[i]);
        }

        return output;

    }

    public static <U> int[] mapToInt(U[] list, Reduce<? super U> mapper) {
        int[] mappedValues = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            mappedValues[i] = mapper.map(list[i]);
        }

        return mappedValues;
    }
}