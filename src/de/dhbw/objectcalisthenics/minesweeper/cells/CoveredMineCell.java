package de.dhbw.objectcalisthenics.minesweeper.cells;

import java.util.Map;

import de.dhbw.objectcalisthenics.minesweeper.Counter;
import de.dhbw.objectcalisthenics.minesweeper.Position;

public class CoveredMineCell extends Cell {

	@Override
	public void print(StringBuilder out) {
		out.append("# ");
	}

	@Override
	public void reveal(Map<Position, Cell> cells, Position position) {
		// TODO do stuff
	}

	@Override
	public void countMine(Counter counter) {
		counter.countUp();
	}

}
