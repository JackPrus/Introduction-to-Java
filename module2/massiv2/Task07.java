package by.jonline.module2.massiv2;

public class Task07 {

	/*
	 * Сформировать квадратную матрицу порядка N по правилу: A[I,J]=sin((I^2-J^2)/N)
	 * и подсчитать количество положительных элементов в ней.
	 */

	public static void main(String[] args) {

		int n = 4;

		double[][] aa = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				double ii = Math.pow(i, 2);
				double jj = Math.pow(j, 2);
				double sin = Math.sin((ii - jj) / n);
				double okr = Math.pow(10, 2); 					// 2- это количество знаков после запятой при округлении
				
				aa[i][j] = Math.round(sin * okr) / okr; 		// Таким образом задаем округление до 2х знаков у sin.

			}
		}

		printArray(aa);

	}

	private static void printArray(double[][] qq) {

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				System.out.print(qq[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println();
	}

}
