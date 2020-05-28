package by.htp.les07.matrix;

public class Task33 {

	public static void task() {
		int sizeRow = 4;
		int sizeCol = 6;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		sortColUp(arr, sizeCol);
		System.out.println();
		Matrix.print(arr);
		sortColDown(arr, sizeCol);
		System.out.println();
		Matrix.print(arr);

	}

	public static void sortColUp(int[][] mas, int sizeCol) {
		for (int j = 0; j < sizeCol; j++) {
			for (int i = 0; i < mas.length; i++) {
				for (int k = 0; k < mas.length - 1; k++) {
					if (mas[k][j] > mas[i][j]) {
						int temp = mas[k][j];
						mas[k][j] = mas[i][j];
						mas[i][j] = temp;
					}
				}
			}
		}
	}

	public static void sortColDown(int[][] mas, int sizeCol) {
		for (int j = 0; j < sizeCol; j++) {
			for (int i = 0; i < mas.length; i++) {
				for (int k = 0; k < mas.length - 1; k++) {
					if (mas[k][j] < mas[i][j]) {
						int temp = mas[k][j];
						mas[k][j] = mas[i][j];
						mas[i][j] = temp;
					}
				}
			}
		}
	}
}
