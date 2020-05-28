package by.htp.les07.matrix;

public class Task13 {

	public static void task() {
		int size = 6;
		int[][] arr = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i + 1) % 2 != 0) {
					arr[i][j] = j + 1;
				} else {
					arr[i][j] = size - j;
				}
			}
		}
		Matrix.print(arr);
	}
}