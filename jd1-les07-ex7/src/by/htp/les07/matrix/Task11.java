package by.htp.les07.matrix;

public class Task11 {

	public static void task() {
		int sizeRow = 5;
		int sizeCol = 8;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i + 1) % 2 == 0) {
					System.out.printf("%3d  ", arr[i][j]);
				} else {
					System.out.printf("%3d  ", arr[i][arr[i].length - 1 - j]);
				}
			}
			System.out.println();
		}
	}

}
