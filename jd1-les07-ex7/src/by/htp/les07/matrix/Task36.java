package by.htp.les07.matrix;

public class Task36 {

	public static void task() {
		int sizeRow = 3;
		int sizeCol = 3;
		double[][] arr = new double[sizeRow][sizeCol];
		init(arr);
		print(arr);
		double[][] arr2 = new double[sizeRow][sizeCol];
		double sum;
		int kol_sosedej;
		for (int i = 0; i < sizeRow; i++) {
			for (int j = 0; j < sizeCol; j++) {
				sum = 0;
				kol_sosedej = 0;
				for (int k = i - 1; k <= i + 1; k++) {
					for (int l = j - 1; l <= j + 1; l++) {
						if (k >= 0 && l >= 0 && k < sizeRow && l < sizeCol) {
							if (k != i || l != j) {
								sum += arr[k][l];
								kol_sosedej++;
							}
						}
						if (k == i + 1 && l == j + 1) {
							arr2[i][j] = (sum / kol_sosedej);
						}
					}
				}
			}
		}
		System.out.println();
		print(arr2);
	}

	public static void init(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (Math.random() * 11 + 1);
			}
		}
	}

	public static void print(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%5.2f  ", mas[i][j]);
			}
			System.out.println();
		}
	}
}