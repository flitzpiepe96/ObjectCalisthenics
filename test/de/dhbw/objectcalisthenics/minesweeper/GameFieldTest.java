package de.dhbw.objectcalisthenics.minesweeper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.dhbw.objectcalisthenics.minesweeper.cells.CoveredEmptyCell;

public class GameFieldTest {

	@Test
	public void testPrint() throws Exception {
		GameField field = new GameField();

		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				field.setCell(new Position(row, column), new CoveredEmptyCell());
			}
		}

		StringBuilder out = new StringBuilder();
		field.print(out);

		assertEquals("###\n###\n###\n", out.toString());
	}

}
