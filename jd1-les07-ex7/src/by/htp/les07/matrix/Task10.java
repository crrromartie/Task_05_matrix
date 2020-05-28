package by.htp.les07.matrix;

public class Task10 {

	public static void task() {
		int sizeRow = 5;
		int sizeCol = 8;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();
		int k = 5;
		int p = 4;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (k == (i + 1)) {
					System.out.printf("%3d  ", arr[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (p == (j + 1)) {
					System.out.printf("%3d  ", arr[i][j]);
				}
			}
			System.out.println();
		}

	}

}
