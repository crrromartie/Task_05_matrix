package by.htp.les07.matrix;

import java.util.Random;

public class Task28 {

	public static void task() {
		int sizeRow = 3;
		int sizeCol = 5;
		int[][] arr = new int[sizeRow][sizeCol];
		init(arr);
		Matrix.print(arr);
		System.out.println();
		sumColMax(arr, sizeCol);
	}

	public static void init(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
	}

	public static void sumColMax(int[][] mas, int sizeCol) {
		int sum = 0;
		int col = 0;
		int s;
		for (int j = 0; j < sizeCol; j++) {
			s = 0;
			for (int i = 0; i < mas.length; i++) {
				s += mas[i][j];
			}
			System.out.printf("%3d  ", s);
			if (s > sum) {
				sum = s;
				col = j + 1;
			}
		}
		System.out.println();
		System.out.println("Max sum col = " + col);
	}
}
