package it.unibo.pps.e2;

import org.junit.jupiter.api.BeforeEach;

public class KnightChessComponentTest extends ChessComponentTest{

    private KnightChessComponent knightChessComponent;

    @Override
    protected ChessComponent getComponent() {
        return knightChessComponent;
    }

    @BeforeEach
    public void beforeEach(){
        this.knightChessComponent = new KnightChessComponent(INITIAL_POSITION);
    }
}
