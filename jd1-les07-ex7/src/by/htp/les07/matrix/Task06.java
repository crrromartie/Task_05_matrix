package by.htp.les07.matrix;

public class Task06 {
	public static void task() {
		int sizeRow = 6;
		int sizeCol = 8;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j = j + 2) {
				if (arr[0][j] > arr[arr.length - 1][j])
					System.out.printf("%3d  ", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((j + 1) % 2 != 0 && arr[0][j] > arr[arr.length - 1][j]) {
					System.out.printf("%3d  ", arr[i][j]);
				}
			}
			System.out.println();
		}

	}

}
