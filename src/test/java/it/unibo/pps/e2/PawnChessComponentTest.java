package it.unibo.pps.e2;

import org.junit.jupiter.api.BeforeEach;

public class PawnChessComponentTest extends ChessComponentTest{

    private PawnChessComponent chessComponent;

    @Override
    protected ChessComponent getComponent() {
        return chessComponent;
    }

    @BeforeEach
    public void beforeEach(){
        this.chessComponent = new PawnChessComponent(INITIAL_POSITION);
    }
}
