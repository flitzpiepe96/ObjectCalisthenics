package de.dhbw.objectcalisthenics.minesweeper;

import java.util.HashSet;
import java.util.Set;

public class MinePlacer {

	private GameField field;
	private int mineCount;

	public MinePlacer(GameField field, int mineCount) {
		this.field = field;
		this.mineCount = mineCount;
	}

	public void placeMines() {
		Set<Position> mines = new HashSet<>();
		while (mines.size() < mineCount) {
			Position position = field.placeMine();
			mines.add(position);
		}
	}

}
