package de.dhbw.objectcalisthenics.minesweeper;

public class Cell {

	private State state;

	public Cell(State state) {
		this.state = state;
	}

	public Cell uncover() {
		return new Cell(State.UNCOVERED);
	}

}
