package by.htp.les07.matrix;

public class Task37 {

	public static void task() {
		int sizeRow = 5;
		int sizeCol = 7;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();
		randomStr(arr, sizeRow, sizeCol);
		Matrix.print(arr);
	}

	public static void randomStr(int[][] arr, int sizeRow, int sizeCol) {
		int z = (int) (Math.random() * 10000);
		while (z > 0) {
			int x = (int) (Math.random() * sizeRow + 1);
			int y = (int) (Math.random() * sizeRow + 1);
			for (int j = 0; j < sizeCol; j++) {
				int temp = arr[x - 1][j];
				arr[x - 1][j] = arr[y - 1][j];
				arr[y - 1][j] = temp;
			}
			z /= 5;
		}
	}
}
