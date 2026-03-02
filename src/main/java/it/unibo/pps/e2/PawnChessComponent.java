package it.unibo.pps.e2;

public class PawnChessComponent implements ChessComponent {
    private final Pair<Integer, Integer> position;

    public PawnChessComponent(Pair<Integer, Integer> position){
        this.position = position;
    }

    @Override
    public Pair<Integer, Integer> getPosition() {
        return position;
    }
}
