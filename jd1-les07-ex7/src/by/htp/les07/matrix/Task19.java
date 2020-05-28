package by.htp.les07.matrix;

public class Task19 {

	public static void task() {
		int size = 10;
		int[][] arr = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i + j <= size - 1) && i <= j || (i + j >= size - 1) && i >= j) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		Matrix.print(arr);
	}

}
