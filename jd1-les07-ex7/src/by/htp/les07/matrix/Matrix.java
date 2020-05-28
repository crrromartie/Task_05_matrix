package by.htp.les07.matrix;

public class Matrix {

	public static void print(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d  ", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static void init(int[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = (int) (Math.random() * 11+1);
			}
		}
	}

}
