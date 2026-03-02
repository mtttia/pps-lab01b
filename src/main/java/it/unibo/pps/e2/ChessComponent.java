package it.unibo.pps.e2;

public interface ChessComponent {
    Pair<Integer, Integer> getPosition();

    default boolean hasComponent(int row, int col){
        Pair<Integer, Integer> checkPosition = new Pair<>(row, col);
        return getPosition().equals(checkPosition);
    }
}
