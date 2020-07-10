package by.jonline.module2.massiv2;

import java.util.Random;

public class Task14 {

	/*
	 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в
	 * каждом столбце число единиц равно номеру столбца
	 */

	public static void main(String[] args) {

		int aa[][];

		aa = matrixInitialization();

		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				if (j > i) {
					aa[i][j] = 1;
				}
			}
		}

		printArray(aa);

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
				aa[i][j] = (rand.nextInt(1));
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
