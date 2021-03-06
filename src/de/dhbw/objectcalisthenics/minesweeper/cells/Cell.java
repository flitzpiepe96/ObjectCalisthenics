package de.dhbw.objectcalisthenics.minesweeper.cells;

import java.util.Map;

import de.dhbw.objectcalisthenics.minesweeper.utils.Counter;
import de.dhbw.objectcalisthenics.minesweeper.utils.Position;

public abstract class Cell {

	public abstract void print(StringBuilder out);

	public abstract void reveal(Map<Position, Cell> cells, Position position, Counter remainingCells);

	public abstract void countMine(Counter counter);

}
