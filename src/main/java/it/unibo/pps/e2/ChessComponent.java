package it.unibo.pps.e2;

public interface ChessComponent {
    Pair<Integer, Integer> getPosition();

    boolean hasComponent(int row, int col);

    boolean hasComponent(ChessComponent chessComponent);
}
