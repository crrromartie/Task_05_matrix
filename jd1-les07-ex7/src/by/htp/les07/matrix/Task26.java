package by.htp.les07.matrix;

import java.util.Scanner;

public class Task26 {

	public static void task() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input size row");
		while (!in.hasNextInt()) {
			in.next();
		}
		int sizeRow = in.nextInt();
		System.out.println("Input size col");
		while (!in.hasNextInt()) {
			in.next();
		}
		int sizeCol = in.nextInt();

		int[][] arr = new int[sizeRow][sizeCol];
		Matrix.init(arr);
		Matrix.print(arr);
		System.out.println();
		sumRowNeg(arr);
		System.out.println();
		maxElStr(arr);
		System.out.println();
		reversMaxMin(arr);
	}

	public static void sumRowNeg(int[][] mas) {
		int sum;
		for (int i = 0; i < mas.length; i++) {
			sum = 0;
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					sum += mas[i][j];
				}
			}
			System.out.printf("String = %d Sum = %d\n", i + 1, sum);
		}
	}

	public static void maxElStr(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			int max = mas[i][0];
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
			System.out.printf("String = %d Max = %d\n", i + 1, max);
		}
	}

	public static void reversMaxMin(int[][] mas) {
		int max = mas[0][0];
		int min = mas[0][0];
		int iMax = 0;
		int jMax = 0;
		int iMin = 0;
		int jMin = 0;
		int temp = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
					iMax = i;
					jMax = j;
				}
				if (mas[i][j] < min) {
					min = mas[i][j];
					iMin = i;
					jMin = j;
				}
			}
		}
		temp = mas[iMax][jMax];
		mas[iMax][jMax] = mas[iMin][jMin];
		mas[iMin][jMin] = temp;
		System.out.println(max);
		System.out.println(min);
		Matrix.print(mas);
	}
}
