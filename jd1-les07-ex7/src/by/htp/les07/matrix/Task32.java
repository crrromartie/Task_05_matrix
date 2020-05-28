package by.htp.les07.matrix;

public class Task32 {

	public static void task() {
		int sizeRow = 4;
		int sizeCol = 6;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);

		System.out.println();
		sortStrUp(arr);
		Matrix.print(arr);

		System.out.println();
		sortStrDown(arr);
		Matrix.print(arr);
//		System.out.println();
//		sortUp(arr);
//		Matrix.print(arr);
//		System.out.println();
//		sortDown(arr);
//		Matrix.print(arr);
	}

	public static void sortStrUp(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (int k = 0; k < mas[i].length - 1; k++) {
					if (mas[i][k] > mas[i][j]) {
						int temp = mas[i][k];
						mas[i][k] = mas[i][j];
						mas[i][j] = temp;
					}
				}
			}
		}
	}

	public static void sortStrDown(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (int k = 0; k < mas[i].length - 1; k++) {
					if (mas[i][k] < mas[i][j]) {
						int temp = mas[i][k];
						mas[i][k] = mas[i][j];
						mas[i][j] = temp;
					}
				}
			}
		}
	}

	public static void sortUp(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (int l = 0; l < mas.length; l++) {
					for (int k = 0; k < mas[i].length; k++) {
						if (mas[l][k] > mas[i][j]) {
							int temp = mas[i][j];
							mas[i][j] = mas[l][k];
							mas[l][k] = temp;
						}
					}
				}
			}
		}
	}

	public static void sortDown(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				for (int l = 0; l < mas.length; l++) {
					for (int k = 0; k < mas[i].length; k++) {
						if (mas[l][k] < mas[i][j]) {
							int temp = mas[i][j];
							mas[i][j] = mas[l][k];
							mas[l][k] = temp;
						}
					}
				}
			}
		}
	}
}
