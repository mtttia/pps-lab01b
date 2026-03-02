package it.unibo.pps.e2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class ChessComponentTest {

    protected static final Pair<Integer, Integer> INITIAL_POSITION = new Pair<>(1, 1);
    protected abstract ChessComponent getComponent();

    @Test
    public void testIsInitializedOnInitialPosition(){
        assertEquals(INITIAL_POSITION.getX(), getComponent().getPosition().getX());
        assertEquals(INITIAL_POSITION.getY(), getComponent().getPosition().getY());
    }

    @Test
    public void testIsOnInitialPosition(){
        assertTrue(getComponent().hasComponent(INITIAL_POSITION));
    }
}
