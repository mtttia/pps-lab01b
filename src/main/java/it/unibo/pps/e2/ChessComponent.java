package it.unibo.pps.e2;

public interface ChessComponent {
    Pair<Integer, Integer> getPosition();

    default boolean hasComponent(Pair<Integer, Integer> checkPosition){
        return getPosition().equals(checkPosition);
    }
}
