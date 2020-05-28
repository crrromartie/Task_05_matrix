package by.htp.les07.matrix;

public class Task16 {

	public static void task() {
		int size = 6;
		int[][] arr = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = (j + 1) * (j + 2);
				}
			}
		}
		Matrix.print(arr);
	}

}
