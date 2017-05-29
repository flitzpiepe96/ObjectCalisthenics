package de.dhbw.objectcalisthenics.minesweeper.utils;

public class Counter {

	private int count;

	public Counter(int initial) {
		count = initial;
	}

	public void countUp() {
		count++;
	}

	public void countDown() {
		count--;
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
