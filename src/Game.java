import java.util.ArrayList;
import java.util.List;

public class Game {

    private final int PLAYER_COUNT = 2;

    private int winCondition;
    private List<Player> players;
    private Board board;
    private State currentPlayer;


    public Game(int rows, int columns, int winCondition) {
        board = new Board(rows, columns);
        players = new ArrayList<>(PLAYER_COUNT);
        this.winCondition = winCondition;
    }

    public void initialize() {
        // players have fixed states, temporary
        players.add(new HumanPlayer(State.O));
        players.add(new AIPlayer(State.X));
        while (true) {
            for (Player player : players) {
                MessagePrinter.printBoard(board);
                player.move(board);
                if (isWinner(player)) {
                    MessagePrinter.printWinner(player);
                    break;
                }
                if (board.isFull()) {
                    MessagePrinter.printDraw();
                    break;
                }
            }
        }
    }

    private boolean isWinner(Player player) {
        return checkRows(player) || checkColumns(player) || checkDiagonals(player);
    }

    private boolean checkRows(Player player) {
    }

    private boolean checkColumns(Player player) {
    }

    private boolean checkDiagonals(Player player) {
    }

}
