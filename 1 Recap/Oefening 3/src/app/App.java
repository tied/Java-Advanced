package app;

public class App {
    public static void main(String[] args) throws Exception {

        // matrix maken
        Object matrix[][] = { { "_", "a", "b", "c", "d", "e" }, { "a", 1, -0.348, 0.457, 0.919, -0.006 },
                { "b", -0.348, 1, 0.054, -0.87, 0.076 }, { "c", 0.457, 0.054, 1, 0.581, -0.124 },
                { "d", 0.919, -0.87, 0.581, 1, 0.814 }, { "c", -0.006, 0.076, -0.124, 0.814, 1 } };
        int MAX = 5;

        // volledige matrix afdrukken
        int count = 0;
        System.out.println("De volledige matrix");
        System.out.println();

        for (int k = 0; k <= MAX; k++) {
            for (int a = 0; 0 <= MAX; a++) {
                String str = matrix[k][a].toString();
                count++;

                if (count == 6) {
                    System.out.println(str);
                    count = 0;
                    break;
                } else {
                    System.out.print(str + "\t");
                }
            }
        }

        // onderste vierkant afdrukken
        System.out.println();
        System.out.println("Onderste vierkant van de matrix");
        System.out.println();

        for (int m = 0; m <= 5; m++) {
            System.out.print(matrix[0][m] + "\t");
        }
        System.out.println();

        for (int i = 1; i <= MAX; i++) {
            for (int j = 0; j <= i - 1; j++) {
                String ding = matrix[i][j].toString();
                System.out.print(ding + "\t");

            }
            System.out.println();
        }

    }
}
