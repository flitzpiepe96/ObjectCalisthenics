package de.dhbw.objectcalisthenics.minesweeper.cells;

import java.util.Map;

import de.dhbw.objectcalisthenics.minesweeper.utils.Counter;
import de.dhbw.objectcalisthenics.minesweeper.utils.Position;

public class CoveredMineCell extends Cell {

	@Override
	public void print(StringBuilder out) {
		out.append("# ");
	}

	@Override
	public void reveal(Map<Position, Cell> cells, Position position, Counter remainingCells) {
		System.out.println("You lost the game!");
		System.exit(0);
	}

	@Override
	public void countMine(Counter counter) {
		counter.countUp();
	}

}
