package de.dhbw.objectcalisthenics.minesweeper.utils;

import java.util.HashSet;
import java.util.Set;

public class NeighbourCalculator {

	private int row;
	private int column;

	public NeighbourCalculator(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public Set<Position> getNeighbours() {
		Set<Position> neighbours = new HashSet<>();
		neighbours.add(new Position(row + 1, column + 1));
		neighbours.add(new Position(row + 1, column));
		neighbours.add(new Position(row + 1, column - 1));
		neighbours.add(new Position(row, column + 1));
		neighbours.add(new Position(row, column - 1));
		neighbours.add(new Position(row - 1, column + 1));
		neighbours.add(new Position(row - 1, column));
		neighbours.add(new Position(row - 1, column - 1));
		return neighbours;
	}

}
