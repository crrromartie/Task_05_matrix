package by.htp.les07.matrix;

import java.util.Scanner;

public class Task39 {

	public static void task() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input sizeRow 1 matrix");
		while (!in.hasNextInt()) {
			in.next();
		}
		int sizeRow = in.nextInt();
		System.out.println("Input sizeCol 1 matrix");
		while (!in.hasNextInt()) {
			in.next();
		}
		int sizeCol = in.nextInt();
		System.out.println("Input sizeRow 2 matrix");
		while (!in.hasNextInt()) {
			in.next();
		}
		int sizeRow2;
		while ((sizeRow2 = in.nextInt()) != sizeCol) {
			System.out.println("Incorrect input, try again");
			while (!in.hasNextInt()) {
				in.next();
			}
		}
		System.out.println("Input sizeCol 2 matrix");
		while (!in.hasNextInt()) {
			in.next();
		}
		int sizeCol2 = in.nextInt();

		System.out.println("Size row 1 = " + sizeRow + "\nSize col 1 = " + sizeCol + "\nSize row 2 = " + sizeRow2
				+ "\nSize col 2 = " + sizeCol2);
		System.out.println();
		int[][] m = new int[sizeRow][sizeCol];
		int[][] m2 = new int[sizeRow2][sizeCol2];
		Matrix.init(m);
		Matrix.init(m2);
		Matrix.print(m);
		System.out.println();
		Matrix.print(m2);
		System.out.println();
		int[][] x = prodMatrix(m, m2, sizeRow, sizeCol2);
		Matrix.print(x);
	}

	public static int[][] prodMatrix(int[][] mas, int[][] mas2, int sizeRow, int sizeCol2) {
		int[][] mas3 = new int[sizeRow][sizeCol2];
		for (int i = 0; i < sizeRow; i++) {
			for (int j = 0; j < sizeCol2; j++) {
				mas3[i][j] = 0;
				for (int k = 0; k < sizeRow; k++) {
					mas3[i][j] += mas[i][k] * mas2[k][j];
				}
			}
		}
		return mas3;
	}
}