package by.jonline.module2.massiv2;

import java.util.Random;

public class Task15 {

	// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

	public static void main(String[] args) {

		int[][] aa;
		int max;

		System.out.println("Исходный массив:");
		aa = matrixInitialization();
		printArray(aa);

		max = findMax(aa);

		System.out.println();
		System.out.println("Максимум : " + max);
		System.out.println();

		aa = swapElements(aa, max);
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
				aa[i][j] = (rand.nextInt(100));
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

	private static int findMax(int[][] qq) {

		int max = 0;

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				if (qq[i][j] > max) {
					max = qq[i][j];
				}
			}
		}
		return max;
	}

	private static int[][] swapElements(int[][] qq, int max) {

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				if (qq[i][j] % 2 != 0) {
					qq[i][j] = max;
				}
			}
		}
		return qq;
	}

}
