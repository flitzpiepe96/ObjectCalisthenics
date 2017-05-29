package de.dhbw.objectcalisthenics.minesweeper.cells;

import java.util.Map;

import de.dhbw.objectcalisthenics.minesweeper.Counter;
import de.dhbw.objectcalisthenics.minesweeper.Position;

public class CoveredEmptyCell extends Cell {

	@Override
	public void print(StringBuilder out) {
		out.append("#");
	}

	@Override
	public void reveal(Map<Position, Cell> cells, Position position) {
		Counter neighbourCount = calculateNeighbours(cells, position);
		cells.put(position, new UncoveredEmptyCell(neighbourCount));
	}

	private Counter calculateNeighbours(Map<Position, Cell> cells, Position position) {
		Counter counter = new Counter();
		for (Position neighbourPosition : position.getNeighbours()) {
			Cell neighbourCell = cells.getOrDefault(neighbourPosition, new CoveredEmptyCell());
			neighbourCell.countMine(counter);
		}
		return counter;
	}

	@Override
	public void countMine(Counter counter) {
		// do nothing
	}

}
