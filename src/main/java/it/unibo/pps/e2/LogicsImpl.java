package it.unibo.pps.e2;

import java.util.*;

public class LogicsImpl implements Logics {
	
	private final PawnChessComponent pawn;
	private final KnightChessComponent knight;

    public LogicsImpl(int size, EmptyPositionGenerator emptyPositionGenerator){
        this.pawn = new PawnChessComponent(emptyPositionGenerator.generatePosition());
		emptyPositionGenerator.setInvalidPosition(this.pawn.getPosition());
        this.knight = new KnightChessComponent(emptyPositionGenerator.generatePosition(), size);
    }

	@Override
	public boolean hit(int row, int col) {
		knight.hit(row, col);
		return knight.hasComponent(pawn);
	}

	@Override
	public boolean hasKnight(int row, int col) {
		return this.knight.hasComponent(row, col);
	}

	@Override
	public boolean hasPawn(int row, int col) {
		return this.pawn.hasComponent(row, col);
	}
}
