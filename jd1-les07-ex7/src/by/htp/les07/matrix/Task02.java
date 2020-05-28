package by.htp.les07.matrix;

import java.util.Random;

public class Task02 {

	public static void task() {
		int[][] arr = new int[2][3];
		init(arr);
		Matrix.print(arr);
	}
	
	public static void init(int[][] mas) {
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
	}
}
