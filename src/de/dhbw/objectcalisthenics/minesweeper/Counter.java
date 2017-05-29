package de.dhbw.objectcalisthenics.minesweeper;

public class Counter {

	private int count;

	public Counter() {
		count = 0;
	}

	public void countUp() {
		count++;
	}

	public void print(StringBuilder out) {
		out.append(count);
	}

}
