package de.dhbw.objectcalisthenics.minesweeper.cells;

import java.util.Map;

import de.dhbw.objectcalisthenics.minesweeper.utils.Counter;
import de.dhbw.objectcalisthenics.minesweeper.utils.Position;

public class UncoveredEmptyCell extends Cell {

	private Counter neighbourCount;

	public UncoveredEmptyCell(Counter neighbourCount) {
		this.neighbourCount = neighbourCount;
	}

	@Override
	public void print(StringBuilder out) {
		neighbourCount.print(out);
	}

	@Override
	public void reveal(Map<Position, Cell> cells, Position position, Counter remainingCells) {
		// do nothing
	}

	@Override
	public void countMine(Counter counter) {
		// do nothing
	}
}
