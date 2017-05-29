package de.dhbw.objectcalisthenics.minesweeper;

import java.util.Scanner;

import de.dhbw.objectcalisthenics.minesweeper.field.EmptyFieldGenerator;
import de.dhbw.objectcalisthenics.minesweeper.field.GameField;
import de.dhbw.objectcalisthenics.minesweeper.field.MinePlacer;
import de.dhbw.objectcalisthenics.minesweeper.utils.Counter;
import de.dhbw.objectcalisthenics.minesweeper.utils.Position;

public class Main {

	public static void main(String[] args) {
		int rowCount = Integer.parseInt(args[0]);
		int columnCount = Integer.parseInt(args[1]);
		EmptyFieldGenerator generator = new EmptyFieldGenerator(rowCount, columnCount);
		GameField field = generator.generateField();
		int mineCount = Integer.parseInt(args[2]);
		new MinePlacer(field, mineCount).placeMines();
		Counter remainingCells = new Counter(columnCount * rowCount - mineCount);

		try (Scanner scan = new Scanner(System.in)) {
			playGame(field, scan, remainingCells);
		}
	}

	private static void playGame(GameField field, Scanner scan, Counter remainingCells) {
		do {
			StringBuilder out = new StringBuilder();
			field.print(out);
			System.out.println(out.toString());

			System.out.println("Insert [row,column] of the cell to reveal");
			String read = scan.nextLine();
			String rowText = read.split(",")[0];
			rowText = rowText.trim();
			String columnText = read.split(",")[1];
			columnText = columnText.trim();

			field.reveal(new Position(Integer.parseInt(rowText), Integer.parseInt(columnText)), remainingCells);
			remainingCells.performZero(new WinGamePerformer());
		} while (true);
	}
}
