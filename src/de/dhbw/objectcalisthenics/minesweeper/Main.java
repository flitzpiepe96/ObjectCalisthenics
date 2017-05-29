package de.dhbw.objectcalisthenics.minesweeper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FieldGenerator generator = new FieldGenerator(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		GameField field = generator.generateField();

		try (Scanner scan = new Scanner(System.in)) {
			playGame(field, scan);
		}
	}

	private static void playGame(GameField field, Scanner scan) {
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

			field.reveal(new Position(Integer.parseInt(rowText), Integer.parseInt(rowText)));
		} while (true);
		// TODO
	}
}
