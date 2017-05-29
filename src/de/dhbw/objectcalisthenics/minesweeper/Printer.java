package de.dhbw.objectcalisthenics.minesweeper;

import java.util.Map;

import de.dhbw.objectcalisthenics.minesweeper.cells.Cell;

public class Printer {

	public void print(StringBuilder out, Map<Position, Cell> cells) {
		for (int row = 0; cells.containsKey(new Position(row, 0)); row++) {
			printRow(row, out, cells);
		}
	}

	private void printRow(int row, StringBuilder out, Map<Position, Cell> cells) {
		for (int column = 0; cells.containsKey(new Position(row, column)); column++) {
			Cell cell = cells.get(new Position(row, column));
			cell.print(out);
		}
		out.append("\n");
	}

}
