package app;

import java.util.Objects;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        // Objects.hash(object) dit wordt gebruikt als er meerdere objecten moeten
        // worden gehashed
        // Objects.hashCode(object) dit wordt gebruikt als er maar één object moet
        // gehashed worden

        Human lisa = new Human("Lisa", "female");
        Human ahmed = new Human("Ahmed", "male");

        System.out.println("Are Lisa and Ahmed the same human?");
        System.out.println("The answer is " + ((Objects.hash(lisa) != Objects.hash(ahmed)) ? "No." : "Maybe."));

        Human human1 = new Human("Lisa", "female");
        Human human2 = new Human("Lisa", "female");

        System.out.println("Are human1 and human2 the same human?");
        System.out.println("The answer is " + ((Objects.hash(human1) != Objects.hash(human2)) ? "No." : "Maybe."));
    }
}