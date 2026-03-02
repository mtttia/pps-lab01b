package it.unibo.pps.e2;

public interface EmptyPositionGenerator {
    void setInvalidPosition(Pair<Integer,Integer> invalidPosition);
    Pair<Integer,Integer> generatePosition();
}
