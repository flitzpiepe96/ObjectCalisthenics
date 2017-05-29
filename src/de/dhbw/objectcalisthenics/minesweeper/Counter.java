package de.dhbw.objectcalisthenics.minesweeper;

import de.dhbw.objectcalisthenics.minesweeper.cells.IActionPerformer;

public class Counter {

	private int count;

	public Counter() {
		count = 0;
	}

	public void countUp() {
		count++;
	}

	public void print(StringBuilder out) {
		if (count == 0) {
			out.append(". ");
			return;
		}
		out.append(count + " ");
	}

	public void performZero(IActionPerformer performer) {
		if (count == 0)
			performer.perform();
	}

}
