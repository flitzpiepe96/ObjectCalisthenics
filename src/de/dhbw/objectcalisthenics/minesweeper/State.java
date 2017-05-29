package de.dhbw.objectcalisthenics.minesweeper;

public enum State {

	COVERED_MINE("#"), MINE("*"), COVERED("#"), UNCOVERED(".");

	private String representation;

	private State(String representation) {
		this.representation = representation;
	}

	public void print(StringBuilder out) {
		out.append(representation);
	}

}
