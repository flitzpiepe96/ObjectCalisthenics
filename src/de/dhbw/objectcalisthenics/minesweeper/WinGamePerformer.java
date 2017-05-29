package de.dhbw.objectcalisthenics.minesweeper;

import de.dhbw.objectcalisthenics.minesweeper.utils.IActionPerformer;

public class WinGamePerformer implements IActionPerformer {

	@Override
	public void perform() {
		System.out.println("You won the game!");
		System.exit(0);
	}

}
