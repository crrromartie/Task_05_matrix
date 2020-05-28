package by.htp.les07.matrix;

import java.util.Scanner;

public class Task34 {

	public static void task() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input sizeRow");
		while (!in.hasNextInt()) {
			in.next();
		}
		int sizeRow = in.nextInt();

		System.out.println("Input sizeCol");
		while (!in.hasNextInt()) {
			in.next();
		}
		int sizeCol;
		while ((sizeCol = in.nextInt()) > sizeRow || sizeCol < 1) {
			System.out.println("Incorrect input, try again");
			while (!in.hasNextInt()) {
				in.next();
			}
		}
		int[][] arr = new int[sizeRow][sizeCol];
		initZeroOne(arr, sizeCol);
		Matrix.print(arr);
	}

	public static void initZeroOne(int[][] mas, int sizeCol) {
		for (int j = 0; j < sizeCol; j++) {
			for (int i = 0; i < mas.length; i++) {
				if (i <= j) {
					mas[i][j] = 1;
				} else {
					mas[i][j] = 0;
				}
			}
		}
	}
}
