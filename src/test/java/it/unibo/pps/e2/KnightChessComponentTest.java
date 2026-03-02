package it.unibo.pps.e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KnightChessComponentTest extends ChessComponentTest{
    private static final int SIZE = 5;
    private KnightChessComponent knightChessComponent;

    @Override
    protected ChessComponent getComponent() {
        return knightChessComponent;
    }

    @BeforeEach
    public void beforeEach(){
        this.knightChessComponent = new KnightChessComponent(INITIAL_POSITION, SIZE);
    }

    @Test
    public void testCanHit(){
        Pair<Integer, Integer> positionToHit = new Pair<>(2,3);
        knightChessComponent.hit(positionToHit.getX(), positionToHit.getY());
        assertTrue(knightChessComponent.hasComponent(positionToHit.getX(), positionToHit.getY()));
    }
}
