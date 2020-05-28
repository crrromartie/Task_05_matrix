package by.htp.les07.matrix;

import java.util.Random;

public class Task31 {

	public static void task() {
		int sizeRow = 4;
		int sizeCol = 4;
		int[][] arr = new int[sizeRow][sizeCol];
		init(arr);
		Matrix.print(arr);
		System.out.println();
		twoDigit(arr);
	}

	public static void init(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}
	}

	public static void twoDigit(int[][] mas) {
		int counter = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 9 && mas[i][j] < 100) {
					counter++;
				}
			}
		}
		System.out.printf("Count = %3d\n", counter);
	}

}
