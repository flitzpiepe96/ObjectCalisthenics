package de.dhbw.objectcalisthenics.minesweeper.field;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import de.dhbw.objectcalisthenics.minesweeper.Printer;
import de.dhbw.objectcalisthenics.minesweeper.cells.Cell;
import de.dhbw.objectcalisthenics.minesweeper.cells.CoveredMineCell;
import de.dhbw.objectcalisthenics.minesweeper.utils.Counter;
import de.dhbw.objectcalisthenics.minesweeper.utils.Position;

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

	public void reveal(Position position, Counter remainingCells) {
		Cell cell = cells.get(position);
		cell.reveal(cells, position, remainingCells);
	}

	public Position placeMine() {
		Set<Position> keys = cells.keySet();
		Random rand = new Random();
		int size = keys.size();
		Position[] keyArray = keys.toArray(new Position[size]);
		Position position = keyArray[rand.nextInt(size)];
		cells.put(position, new CoveredMineCell());
		return position;
	}
}
