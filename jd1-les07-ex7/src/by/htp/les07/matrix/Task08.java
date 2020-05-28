package by.htp.les07.matrix;

public class Task08 {

	public static void task() {
		int sizeRow = 5;
		int sizeCol = 5;
		int[][] arr = new int[sizeRow][sizeCol];
		int counter = 0;
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 7) {
					counter++;
				}
			}
		}

		System.out.println("Cont 7 = " + counter);
	}

}
