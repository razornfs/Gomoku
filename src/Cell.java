public class Cell {

    private State state;

    public Cell(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        return getState() == cell.getState();
    }

    @Override
    public int hashCode() {
        return getState().hashCode();
    }

}
