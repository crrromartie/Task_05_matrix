package by.htp.les07.matrix;

import java.util.Scanner;

public class Task27 {

	public static void task() {
		int sizeRow = 5;
		int sizeCol = 8;
		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input 1 col");
		while (!in.hasNextInt()) {
			in.next();
		}
		int a;
		while ((a = in.nextInt()) < 1 || a > sizeCol) {
			System.out.println("Incorrect input, try again");
			while (!in.hasNextInt()) {
				in.next();
			}
		}
		System.out.println("Input 2 col");
		while (!in.hasNextInt()) {
			in.next();
		}
		int b;
		while ((b = in.nextInt()) < 1 || b > sizeCol || a == b) {
			System.out.println("Incorrect input, try again");
			while (!in.hasNextInt()) {
				in.next();
			}
		}

		System.out.println("1 col = " + a + "\n2 col = " + b + "\n");
		arr = changeCol(arr, a, b);
		Matrix.print(arr);
	}

	public static int[][] changeCol(int[][] arr, int a, int b) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i][a - 1];
			arr[i][a - 1] = arr[i][b - 1];
			arr[i][b - 1] = temp;
		}
		return arr;
	}
}
