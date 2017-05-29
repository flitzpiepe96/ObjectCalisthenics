package de.dhbw.objectcalisthenics.minesweeper.field;

import de.dhbw.objectcalisthenics.minesweeper.cells.CoveredEmptyCell;
import de.dhbw.objectcalisthenics.minesweeper.utils.Position;

public class EmptyFieldGenerator {

	private int rowCount;
	private int columnCount;

	public EmptyFieldGenerator(int rowCount, int columnCount) {
		this.rowCount = rowCount;
		this.columnCount = columnCount;
	}

	public GameField generateField() {
		GameField field = new GameField();
		for (int row = 0; row < rowCount; row++) {
			generateEmptyRow(field, row);
		}
		return field;
	}

	private void generateEmptyRow(GameField field, int row) {
		for (int column = 0; column < columnCount; column++) {
			field.setCell(new Position(row, column), new CoveredEmptyCell());
		}
	}

}
