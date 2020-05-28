package by.htp.les07.matrix;

public class Task25 {

	public static void task() {
		int size = 10;
		int k = 0;
		int[][] arr = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = j + 1 + k;
			}
			k += size;
		}
		Matrix.print(arr);
	}
}
