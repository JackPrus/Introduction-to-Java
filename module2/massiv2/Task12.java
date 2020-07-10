package by.jonline.module2.massiv2;

import java.util.Random;

public class Task12 {

	// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

	public static void main(String[] args) {

		int[][] aa;

		aa = matrixInitialization();
		printArray(aa);

		System.out.println();

		sortRise(aa);
		printArray(aa);

		System.out.println();

		sortFall(aa);
		printArray(aa);

	}

	private static int[][] matrixInitialization() {

		Random rand = new Random();
		
		int[][] qq = new int[20][10];

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				qq[i][j] = (rand.nextInt(10));
			}
		}
		return qq;
	}

	private static void printArray(int[][] qq) {

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				System.out.print(qq[i][j] + "|");
			}
			System.out.println();
		}
	}

	private static int[][] sortRise(int[][] qq) { // сортировка пузырьком.

		for (int i = 0; i < qq.length; i++) { //
			for (int k = qq[i].length - 1; k > 0; k--) {
				for (int j = 0; j < k; j++) {
					if (qq[i][j] > qq[i][j + 1]) {
						int tmp = qq[i][j];
						qq[i][j] = qq[i][j + 1];
						qq[i][j + 1] = tmp;
					}
				}
			}
		}
		return qq;

	}

	private static int[][] sortFall(int[][] qq) {

		for (int i = 0; i < qq.length; i++) { //
			for (int k = qq[i].length - 1; k > 0; k--) {
				for (int j = 0; j < k; j++) {
					if (qq[i][j] < qq[i][j + 1]) {
						int tmp = qq[i][j];
						qq[i][j] = qq[i][j + 1];
						qq[i][j + 1] = tmp;
					}
				}
			}
		}
		return qq;

	}

}
