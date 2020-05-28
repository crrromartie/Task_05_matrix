package by.htp.les07.matrix;

public class Task29 {

	public static void task() {
		int sizeRow = 5;
		int sizeCol = 5;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();
		posElMainD(arr);
	}

	public static void posElMainD(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j && (mas[i][j] > 0)) {
					System.out.printf("%3d  ", mas[i][j]);
				}
			}
		}
	}
}
