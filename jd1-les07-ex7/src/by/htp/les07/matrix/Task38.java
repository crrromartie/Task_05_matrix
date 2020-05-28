package by.htp.les07.matrix;

public class Task38 {

	public static void task() {
		int sizeRow = 3;
		int sizeCol = 2;
		int[][] arr = new int[sizeRow][sizeCol];
		int[][] arr2 = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();
		Matrix.init(arr2);
		Matrix.print(arr2);
		System.out.println();
		int[][] x = sumMatrix(arr, arr2, sizeCol);
		Matrix.print(x);
	}

	public static int[][] sumMatrix(int[][] arr, int[][] arr2, int sizeCol) {
		int[][] arr3 = new int[arr.length][sizeCol];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr3[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		return arr3;
	}
}
