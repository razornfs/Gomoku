public class Board {

    private Cell[][] board;

    private int rows;
    private int columns;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        board = new Cell[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                board[row][col] = new Cell(State.EMPTY);
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public boolean isFull() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (board[row][col].getState() == State.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
