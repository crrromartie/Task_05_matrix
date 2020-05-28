package by.htp.les07.matrix;

public class Task14 {

	public static void task() {
		int size = 6;
		int[][] arr = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i + j) == (size - 1)) {
					arr[i][j] = size - j;
				}
			}
		}
		Matrix.print(arr);
	}

}
