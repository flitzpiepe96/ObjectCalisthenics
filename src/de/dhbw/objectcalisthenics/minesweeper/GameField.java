package de.dhbw.objectcalisthenics.minesweeper;

import java.util.HashMap;
import java.util.Map;

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
		// TODO Auto-generated method stub

	}

}
