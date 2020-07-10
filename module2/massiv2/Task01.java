package by.jonline.module2.massiv2;

import java.util.Random;

public class Task01 {

	/*
	 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
	 * больше последнего.
	 */

	public static void main(String[] args) {

		int[][] a;

		a = matrixInitialization();
		printArray(a);

		for (int j = 0; j < a[0].length; j++) {
			if ((j % 2 != 0) && (a[0][j] < a[a.length - 1][j])) {
				System.out.println();
				System.out.print("Столбец " + j + ": ");
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i][j] + "|");
				}
			}
		}

	}

	private static int[][] matrixInitialization() {

		Random rand = new Random();
		int max = 11;
		int min = 2;

		int ii = min + rand.nextInt(max - min);
		int jj = min + rand.nextInt(max - min);

		int[][] aa = new int[ii][jj];

		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				aa[i][j] = (rand.nextInt(100 - 10)) + 10;
			}
		}
		return aa;
	}

	private static void printArray(int[][] qq) {

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				System.out.print(qq[i][j] + "|");
			}
			System.out.println();
		}
	}

}
