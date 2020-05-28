package by.htp.les07.matrix;

public class Task07 {

	public static void task() {
		int sizeRow = 5;
		int sizeCol = 5;
		int[][] arr = new int[sizeRow][sizeCol];
		int sum = 0;
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < 0 && arr[i][j] % 2 != 0) {
					sum += (int) Math.abs(arr[i][j]);
				}
			}
		}

		System.out.println("Sum = " + sum);
	}

}
