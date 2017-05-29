package de.dhbw.objectcalisthenics.minesweeper.cells;

import java.util.Map;

import de.dhbw.objectcalisthenics.minesweeper.Counter;
import de.dhbw.objectcalisthenics.minesweeper.Position;

public abstract class Cell {

	public abstract void print(StringBuilder out);

	public abstract void reveal(Map<Position, Cell> cells, Position position);

	public abstract void countMine(Counter counter);

}
