package by.htp.les07.matrix;

public class Task03 {

	public static void task() {
		int sizeRow = 6;
		int sizeCol = 8;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + "  " + arr[i][arr.length]);
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || j == arr[i].length - 1) {
					System.out.printf("%3d  ", arr[i][j]);
				}
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j = j + arr[i].length - 1) {
				System.out.printf("%3d  ", arr[i][j]);
			}
			System.out.println();
		}

	}

}
