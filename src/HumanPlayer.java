public class HumanPlayer extends Player {

    private State state;
    private String name; // currently unused

    public HumanPlayer(State state) {
        this.state = state;
    }

    @Override
    public void move(Board board) {
        MessagePrinter.printPromptForCoordinates();
        int row = InputHandler.getRow();
        int column = InputHandler.getColumn();
        if (moveIsValid(row, column, board)) {
            //TODO
        }
    }

    private boolean moveIsValid(int row, int column, Board board) {

    }
}
