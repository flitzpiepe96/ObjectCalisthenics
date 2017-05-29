package de.dhbw.objectcalisthenics.minesweeper;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FieldGenerator {

	public static final int MINE_COUNT = 10;

	private int rowCount;
	private int columnCount;

	public FieldGenerator(int rowCount, int columnCount) {
		this.rowCount = rowCount;
		this.columnCount = columnCount;
	}

	public GameField generateField() {
		GameField field = generateEmptyField();
		Set<Position> mines = new HashSet<>();
		while (mines.size() < MINE_COUNT) {
			Random rand = new Random();
			int randomRow = rand.nextInt(rowCount);
			int randomColumn = rand.nextInt(columnCount);
			mines.add(new Position(randomRow, randomColumn));
			field.setCell(new Position(randomRow, randomColumn), new Cell(State.MINE));
		}
		return field;
	}

	private GameField generateEmptyField() {
		GameField field = new GameField();
		for (int row = 0; row < rowCount; row++) {
			generateEmptyRow(field, row);
		}
		return field;
	}

	private void generateEmptyRow(GameField field, int row) {
		for (int column = 0; column < columnCount; column++) {
			field.setCell(new Position(row, column), new Cell(State.COVERED));
		}
	}

}
