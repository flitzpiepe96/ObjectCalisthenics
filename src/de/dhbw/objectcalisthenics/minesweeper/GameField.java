package de.dhbw.objectcalisthenics.minesweeper;

import java.util.HashMap;
import java.util.Map;

import de.dhbw.objectcalisthenics.minesweeper.cells.Cell;

public class GameField {

	private Map<Position, Cell> cells;

	public GameField() {
		cells = new HashMap<>();
	}

	public void setCell(Position position, Cell cell) {
		cells.put(position, cell);
	}

	public void print(StringBuilder out) {
		new Printer().print(out, cells);
	}

	public void reveal(Position position) {
		cells.get(position).reveal(cells, position);
	}
}
