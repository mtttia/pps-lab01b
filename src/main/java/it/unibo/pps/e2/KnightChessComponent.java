package it.unibo.pps.e2;

public class KnightChessComponent extends BaseChessComponent implements ChessComponentWithHit {
    private final int size;
    public KnightChessComponent(Pair<Integer, Integer> initialPosition, int size) {
        super(initialPosition);
        this.size = size;
    }

    @Override
    public void hit(int row, int col) {
        if (row<0 || col<0 || row >= this.size || col >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        // Below a compact way to express allowed moves for the knight
        int x = row-this.position.getX();
        int y = col-this.position.getY();
        if (x!=0 && y!=0 && Math.abs(x)+Math.abs(y)==3) {
            this.position = new Pair<>(row,col);
        }
    }
}
