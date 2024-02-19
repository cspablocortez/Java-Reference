public class TicTacToe {

    private String[][] board;
    private static final int SIZE = 3;

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.displayBoard();
    }

    public TicTacToe() {
        board = new String[SIZE][SIZE];
        initializeBoard();
    }


    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = "[ ]";
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
            if (i < SIZE - 1) {
                System.out.println("\n"); 
            }
        }
    }
    
}
