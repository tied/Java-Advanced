package app;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        final int max = 10;
        Point[] array = new Point[max];
        Random rnd = new Random();
        double gemiddelde = 0;

        for (int i = 0; i < max; i++) {
            float eerste = rnd.nextFloat() * 100;
            float tweede = rnd.nextFloat() * 100;
            float derde = rnd.nextFloat() * 100;
            array[i] = new Point(eerste, tweede, derde);
        }

        for (int j = 0; j > max / 2; j = j + 2) {
            int getal = rnd.nextInt(max - 1);
            int getall = rnd.nextInt(max - 1);

            gemiddelde += AfstandBerekenen(array[getal], array[getall]);
            System.out.print(gemiddelde + "\n");
        }
        gemiddelde = gemiddelde / (max / 2);

        System.out.print(gemiddelde);

    }

    public static double AfstandBerekenen(Point pEerste, Point pTweede) {
        int Eerste = pEerste.hashCode();
        int Tweede = pTweede.hashCode();

        // alle afzonderlijke getallen terugkrijgen
        int eersteH = Eerste / 100 * 100;
        int eersteT = Eerste - eersteH / 10 * 10;
        int eersteE = Eerste - eersteH - eersteT;

        int tweedeH = Tweede / 100 * 100;
        int tweedeT = Tweede - tweedeH / 10 * 10;
        int tweedeE = Tweede - tweedeH - tweedeT;

        // vierkantswortel(macht(x2-x1)+macht(y2-y1)+macht(z2-z1))
        double result = Math.sqrt(Math.pow(eersteH, tweedeH) + Math.pow(eersteT, tweedeT) + Math.pow(eersteE, tweedeE));

        return result;
    }
}