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
		for (int row = 0; cells.containsKey(new Position(row, 0)); row++) {
			printRow(row, out);
		}
	}

	private void printRow(int row, StringBuilder out) {
		for (int column = 0; cells.containsKey(new Position(row, column)); column++) {
			Cell cell = cells.get(new Position(row, column));
			cell.print(out);
		}
		out.append("\n");
	}

}
