package by.jonline.module2.massiv2;

import java.util.Random;

public class Task13 {

	// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

	public static void main(String[] args) {

		int[][] aa;
		int[][] bb; 		// перевернем матрицу и используем тот же подход, что в задаче 12.

		System.out.println("Исходная матрица:");
		aa=matrixInitialization();
		printArray(aa);

		System.out.println();

		System.out.println("Столбцы по возрастанию:");
		bb = matrixRevers(aa);
		sortRise(bb);
		aa = matrixRevers(bb);
		printArray(aa);

		System.out.println();

		System.out.println("Столбцы по убыванию:");
		bb = matrixRevers(aa);
		sortFall(bb);
		aa = matrixRevers(bb);
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

	private static int[][] matrixRevers(int[][] qq) {

		int[][] hh = new int[qq[0].length][qq.length];

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				hh[j][i] = qq[i][j];
			}
		}
		return hh;
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
