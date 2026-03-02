package it.unibo.pps.e2;
import org.jspecify.annotations.NonNull;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LogicTest {
  private static final int CELL_SIZE = 5;
  private static final Pair<Integer, Integer> PAWN_POSITION = new Pair<>(1, 1);
  private static final Pair<Integer, Integer> KNIGHT_POSITION = new Pair<>(3, 2);
  private static final Pair<Integer, Integer> VALID_KNIGHT_POSITION = new Pair<>(2, 4);
  private static final Pair<Integer, Integer> INVALID_KNIGHT_POSITION = new Pair<>(4, 2);

  private LogicsImpl logics;

  private void assertKnightPosition(@NonNull Pair<Integer, Integer> position){
    assertTrue(logics.hasKnight(position.getX(), position.getY()));
  }

  @BeforeEach
  public void beforeEach(){
    List<Pair<Integer, Integer>> points = new ArrayList<>();

    points.add(PAWN_POSITION);
    points.add(KNIGHT_POSITION);
    logics = new LogicsImpl(CELL_SIZE, new FixedEmptyPositionGenerator(points));
  }

  @Test
  public void testHasPawn() {
    assertTrue(logics.hasPawn(PAWN_POSITION.getX(), PAWN_POSITION.getY()));
  }

  @Test
  public void testHasNotPawn() {
    assertFalse(logics.hasPawn(KNIGHT_POSITION.getX(), KNIGHT_POSITION.getY()));
  }

  @Test
  public void testHasKnight() {
    assertKnightPosition(KNIGHT_POSITION);
  }

  @Test
  public void testHasNotKnight() {
    assertFalse(logics.hasKnight(PAWN_POSITION.getX(), PAWN_POSITION.getY()));
  }

  @Test
  public void testCannotHitOutsideGrid() {
    assertThrows(IndexOutOfBoundsException.class, () -> logics.hit(CELL_SIZE, CELL_SIZE));
  }

  @Test
  public void testCannotMoveOutsideKnightMovements() {
    assertFalse(logics.hit(INVALID_KNIGHT_POSITION.getX(), INVALID_KNIGHT_POSITION.getY()));
    assertKnightPosition(KNIGHT_POSITION);
  }

  @Test
  public void testCanMoveInsideKnightMovements() {
    assertFalse(logics.hit(VALID_KNIGHT_POSITION.getX(), VALID_KNIGHT_POSITION.getY()));
    assertKnightPosition(VALID_KNIGHT_POSITION);
  }

  @Test
  public void testCanHitPawn(){
    assertTrue(logics.hit(PAWN_POSITION.getX(), PAWN_POSITION.getY()));
    assertKnightPosition(PAWN_POSITION);
  }
}
