package by.htp.les07.matrix;

public class Task04 {

	public static void task() {
		int sizeRow = 6;
		int sizeCol = 8;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || i == arr.length - 1) {
					System.out.printf("%3d  ", arr[i][j]);
				}
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < arr.length; i = i + arr.length - 1) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d  ", arr[i][j]);
			}
			System.out.println();
		}

	}

}
