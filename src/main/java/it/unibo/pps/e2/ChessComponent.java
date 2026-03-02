package it.unibo.pps.e2;

public interface ChessComponent {
    Pair<Integer, Integer> getPosition();

    boolean hasComponent(Pair<Integer, Integer> checkPosition);
}
