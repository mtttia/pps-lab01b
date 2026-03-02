package it.unibo.pps.e2;

import java.util.List;

public class FixedEmptyPositionGenerator implements EmptyPositionGenerator{
    private final List<Pair<Integer, Integer>> positionToGenerate;
    private int currentPosition = 0;

    public FixedEmptyPositionGenerator(List<Pair<Integer, Integer>> positionToGenerate){
        this.positionToGenerate = positionToGenerate;
    }

    @Override
    public void setInvalidPosition(Pair<Integer, Integer> invalidPosition) { }

    @Override
    public Pair<Integer, Integer> generatePosition() {
        if(currentPosition >= positionToGenerate.size()){
            throw new IllegalStateException("all items have been generated");
        }
        return positionToGenerate.get(currentPosition++);
    }
}
