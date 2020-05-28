package by.htp.les07.matrix;

public class Task23 {

	public static void task() {
		int size = 5;
		double[][] arr = new double[size][size];
		initD(arr);
		printD(arr);
		int rez = foundNeg(arr);
		System.out.println();
		System.out.println("Rez = " + rez);
	}

	public static void initD(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / mas.length);
			}
		}
	}

	public static void printD(double[][] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%5.2f  ", mas[i][j]);
			}
			System.out.println();
		}
	}

	public static int foundNeg(double[][] mas) {
		int counter = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 0) {
					counter++;
				}
			}
		}
		return counter;
	}
}
