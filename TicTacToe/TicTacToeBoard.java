import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/**
 * This class represents the board for a game of 
 * TicTacToe
 * 
 * @author Gabriel Koomson
 */
public class TicTacToeBoard {

    private String[][] board; // the board 
    private int numEmpty; // The number of empty slots
    private boolean detectedWin; // Whether or not a winner has been seen
    private String winningSymbol; // The symbol of the winner
    public static final int SIZE = 3;
    public static final String EMPTY = ".";

    /**
     * The constructor for the class. 
     * It instantiates the 3x3 board and initializes the board to be empty.
     * You should also initialize the number of empty slots
     * 
     */
    public TicTacToeBoard() {
        // TODO: Complete the method
        board = new String[SIZE][SIZE];
        this.numEmpty = 9;
        for(int i =0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++ ){
                 board[i][j] = EMPTY;
            }
        }
        // This part below has been done for you, for free 😄
        detectedWin = false;
        winningSymbol = "";
    }

    /**
     * It prints the board
     */
    public void printBoard() {
        System.out.print("  ");
        for (int i = 0; i < board[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * If the number of empty spaces is 0, then the board is full
     * 
     * @return whether or not the board is full.
     */
    public boolean isBoardFull() {
        // TODO: Correct the method
        return (this.numEmpty == 0);
    }

    /**
     * Return true if a given location on the board, 
     * specified by a given row index and column index, is empty
     * 
     * @param row The row of the board.
     * @param col the column of the board
     * @return Whether or not the location is empty.
     */
    public boolean isEmpty(int row, int col) {
        // TODO: Correct the method
        if (board[row][col].equals(EMPTY)) 
        return true;

        else
            return false;
    }

    /**
     * check the game for a win
     * If all the elements a row, column, or diagonal are the same, 
     * then a win has been detected.
     * 
     * If a win is detected, the detectedWin instance variable should be set to true, 
     * and the winningSymbol instance variable should be set to the symbol of the winner.
     *
     * Hint: There are 8 ways to win a 3x3 game of tic-tac-toe
     */
    private void detectWin() {
        // TODO: Correct the method
        if(!board[0][0].equals(EMPTY) && board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2])){
                detectedWin = true;
                winningSymbol = board[0][0];
        }

        else if (!board[1][0].equals(EMPTY) && board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])){
                detectedWin = true;
                winningSymbol = board[1][1];
        }

        else if (!board[2][0].equals(EMPTY) && board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])){
                detectedWin = true;
                winningSymbol = board[2][1];
        }

        else if (!board[0][0].equals(EMPTY) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])){
                detectedWin = true;                
                winningSymbol = board[1][1];
        }

        else if (!board[0][2].equals(EMPTY) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])){
                detectedWin = true;
                winningSymbol = board[2][0];
        }

        else if (!board[0][0].equals(EMPTY) && board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])){
                detectedWin = true;
                winningSymbol = board[2][0];
        }

        else if (!board[0][1].equals(EMPTY) &&board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])){
                detectedWin = true;
                winningSymbol = board[2][0];
        }

        else if (!board[0][2].equals(EMPTY) && board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])){
        detectedWin = true;
        winningSymbol = board[2][0];

        }

    }

    /**
     * If the board is empty at the given row and column, 
     * then place the symbol on the board, 
     * decrement the number of empty spaces, 
     * and check for a win
     * 
     * If the board is not empty at the given row and column, 
     * then the play is not successful and the method returns {@code false}. 
     * 
     * 
     * @param row the row of the board (0 indexed)
     * @param col The column number of the board (0 indexed).
     * @param symbol the symbol to be placed on the board
     * @return Whether a move was successful or not.
     */
    public boolean play(int row, int col, String symbol) {
        // TODO: Implement the method
        if(board[row][col].equals(EMPTY)){
        board[row][col] = symbol;
        detectWin();
        return true;
        } 
        return false;
    }

    /**
     * If the game is over,and has a winner, return true. Otherwise, return false
     * 
     * @return The boolean value of detectedWin.
     */
    public boolean hasWinner() {
        return(detectedWin == true);

         // TODO: Correct the method
    }

    /**
     * This function returns the winning symbol.
     * It is only valid to call this method if hasWinner returns true.
     * 
     * @return The winningSymbol.
     */
    public String getWinningSymbol() {
        return winningSymbol; // TODO: Correct the method
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToeBoard board = new TicTacToeBoard();
        board.printBoard();

        int row, col;
        boolean xTurn = true;
        while (!board.isBoardFull() && !board.hasWinner()) {
            System.out.print("Enter row & col to play: ");
            row = input.nextInt();
            col = input.nextInt();
            board.play(row, col, xTurn ? "X" : "O");
            board.printBoard();
            if (board.isBoardFull())
                System.out.println("Board is full.");
            if (board.hasWinner())
                System.out.println("Has winner: " + board.getWinningSymbol());
            xTurn = !xTurn;
        }
        System.out.println("Goodbye!");
        input.close();
    }
}