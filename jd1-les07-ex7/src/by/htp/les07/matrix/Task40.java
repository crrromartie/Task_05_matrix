package by.htp.les07.matrix;

import java.util.Scanner;

public class Task40 {

	public static void task() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Input n [3, 5, 7 ...]");// for odd numbers
		while (!in.hasNextInt()) {
			in.next();
		}
		int n;
		while ((n = in.nextInt()) % 2 == 0 || n < 3) {
			System.out.println("Incorrect input, try again");
			while (!in.hasNextInt()) {
				in.next();
			}
		}
		int[][] matrix = new int[n][n];
		int nsqr = n * n;
		int i = 0, j = n / 2;

		for (int k = 1; k <= nsqr; k++) {
			matrix[i][j] = k;
			i--;
			j++;
			if (k % n == 0) {
				i += 2;
				j--;
			} else {
				if (j == n) {
					j -= n;
				} else if (i < 0) {
					i += n;
				}
			}
		}
		Matrix.print(matrix);
	}

}
