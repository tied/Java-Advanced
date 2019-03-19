package app;

public class ChessBoard {
    private int grootte;
    private int[][] bord;

    public ChessBoard(int size) {
        this.grootte = size;
    }

    private void createBoard() {
        int teller = 0;
        int count = 0;
        bord = new int[grootte][grootte];

        for (int k = 0; k <= grootte - 1; k++) {
            for (int l = 0; l <= grootte - 1; l++) {
                count++;
                teller++;
                bord[k][l] = teller;
                if (grootte % 2 == 0) {
                    if (count == grootte) {
                        teller++;
                        count = 0;
                    }
                }
            }
        }
    }

    public void print() {
        createBoard();
        int teller = 0;

        for (int k = 0; k <= grootte - 1; k++) {
            for (int l = 0; l <= grootte - 1; l++) {
                teller++;

                if (bord[k][l] % 2 == 0) {
                    System.out.printf("%c ", 0x25A0);
                } else {
                    System.out.printf("%c ", 0x25A1);
                }

                if (teller == grootte) {
                    System.out.println();
                    teller = 0;
                }
            }
        }
    }
}