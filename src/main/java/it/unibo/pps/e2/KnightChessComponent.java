package it.unibo.pps.e2;

public class KnightChessComponent implements ChessComponent {
    public Pair<Integer, Integer> position;
    public KnightChessComponent(Pair<Integer, Integer> initialPosition) {
        this.position = initialPosition;
    }

    @Override
    public Pair<Integer, Integer> getPosition() {
        return position;
    }
}
