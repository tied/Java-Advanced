package app;

/**
 * Student
 */
public class Student {
    String naam;
    int score;

    public Student(String pNaam, int pScore) {
        this.naam = pNaam;
        this.score = pScore;
    }

    @Override
    public String toString() {
        return naam;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

}