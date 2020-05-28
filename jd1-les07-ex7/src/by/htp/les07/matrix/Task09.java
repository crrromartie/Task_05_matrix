package by.htp.les07.matrix;

public class Task09 {

	public static void task() {
		int sizeRow = 5;
		int sizeCol = 5;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					System.out.printf("%3d  ", arr[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			System.out.printf("%3d  ", arr[j][j]);
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i + j) == (arr.length - 1)) {
					System.out.printf("%3d  ", arr[i][j]);
				}
			}
			System.out.println();
		}
	}

}
