package it.unibo.pps.e2;

public class BaseChessComponent implements ChessComponent {
    protected Pair<Integer, Integer> position;

    public BaseChessComponent(Pair<Integer, Integer> position){
        this.position = position;
    }

    @Override
    public Pair<Integer, Integer> getPosition() {
        return position;
    }

    @Override
    public boolean hasComponent(int row, int col){
        Pair<Integer, Integer> checkPosition = new Pair<>(row, col);
        return getPosition().equals(checkPosition);
    }

    @Override
    public boolean hasComponent(ChessComponent chessComponent){
        int row = chessComponent.getPosition().getX();
        int col = chessComponent.getPosition().getY();
        return hasComponent(row, col);
    }
}
