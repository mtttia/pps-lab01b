package it.unibo.pps.e2;

import java.util.Random;

public class RandomEmptyPositionGenerator implements EmptyPositionGenerator {
    private Pair<Integer,Integer> invalidPosition;
    private final Random random = new Random();
    private final int gridSize;

    public RandomEmptyPositionGenerator(int gridSize){
        invalidPosition = null;
        this.gridSize = gridSize;
    }

    @Override
    public void setInvalidPosition(Pair<Integer,Integer> invalidPosition) {
        this.invalidPosition = invalidPosition;
    }

    @Override
    public Pair<Integer, Integer> generatePosition() {
        Pair<Integer,Integer> pos = new Pair<>(this.random.nextInt(gridSize),this.random.nextInt(gridSize));
        // the recursive call below prevents clash with an existing pawn
        return this.invalidPosition!=null && this.invalidPosition.equals(pos) ? generatePosition() : pos;
    }
}
