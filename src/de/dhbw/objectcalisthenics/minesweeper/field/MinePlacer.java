package de.dhbw.objectcalisthenics.minesweeper.field;

import java.util.HashSet;
import java.util.Set;

import de.dhbw.objectcalisthenics.minesweeper.utils.Position;

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
