package by.htp.les07.matrix;

public class Task24 {

	public static void task() {
		int size = 4;
		int[] arr = new int[size];

		init(arr);
		print(arr);

		int[][] arr2 = new int[size][size];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = (int) Math.pow(arr[j], (i + 1));
			}
		}

		System.out.println();
		System.out.println();

		Matrix.print(arr2);
	}

	public static void init(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 5 + 1);
		}
	}

	public static void print(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%3d", mas[i]);
		}
	}
}
