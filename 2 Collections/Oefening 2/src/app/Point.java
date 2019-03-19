package app;

/*
   deze oef is om te leren werken met hashCode
   hashcode voor meer gebruiken
   getallen x y z
*/

public class Point {

    public float x;
    public float y;
    public float z;

    public Point(float a, float b, float c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }

    @Override
    public int hashCode() {

        // van float naar int gaan door de parsen
        int eerste = (int) x;
        int tweede = (int) y;
        int derde = (int) z;

        // alles tesamen concatineren
        int result = derde + (tweede * 10) + (eerste * 100);

        return result;
    }
}