package app;

public class App {
    public static void main(String[] args) throws Exception {
        ChessBoard bordje = new ChessBoard(4);
        bordje.print();

        System.out.println();

        ChessBoard tweede = new ChessBoard(5);
        tweede.print();
    }
}