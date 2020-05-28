package by.htp.les07.matrix;

import java.util.Random;

public class Task30 {

	public static void task() {
		int sizeRow = 10;
		int sizeCol = 20;
		int[][] arr = new int[sizeRow][sizeCol];
		init(arr);
		Matrix.print(arr);
		System.out.println();
		fiveThree(arr);
	}

	public static void init(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(16);
			}
		}
	}

	public static void fiveThree(int[][] mas) {
		int counter;
		for (int i = 0; i < mas.length; i++) {
			counter = 0;
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5) {
					counter++;
				}
			}
			if (counter >= 3) {
				System.out.printf("String = %3d\n", i + 1);
			}
		}
	}
}
