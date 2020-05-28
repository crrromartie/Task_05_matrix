package by.htp.les07.matrix;

public class Task17 {

	public static void task() {
		int size = 6;
		int[][] arr = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
					arr[i][j] = 1;
				}
			}
		}
		Matrix.print(arr);
	}

}
