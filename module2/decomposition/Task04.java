package by.jonline.module2.decomposition;

public class Task04 {

	/*
	 * На плоскости заданы своими координатами n точек. Написать метод(методы),
	 * определяющие, между какими из пар точек самое большое расстояние. Указание.
	 * Координаты точек занести в массив.
	 */

	public static void main(String[] args) {

		int[] x = { 1, 2, 4, 6, 8 }; // координаты задаются здесь.
		int[] y = { 4, 6, 8, 2, 9 }; // точки по порядку позиций 0, 1, 2, 3 ,4 соответственно

		double[][] xy;
		double maxLength;

		xy = getArrayLength(x, y);
		printArray(xy);

		maxLength = getMax(xy);
		getMaxIndex(xy, maxLength);

	}

	private static double getLength(int x1, int x2, int y1, int y2) {

		double length;

		double xx = Math.pow((x2 - x1), 2);
		double yy = Math.pow((y2 - y1), 2);

		length = Math.sqrt(xx + yy);

		return length;
	}

	private static double[][] getArrayLength(int[] xx, int[] yy) { // доработать инициализацию.

		double[][] array = new double[xx.length - 1][yy.length - 1];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = getLength(xx[j], xx[i], yy[j], yy[i]);
			}
		}

		return array;
	}

	private static void printArray(double[][] qq) {

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				System.out.print(qq[i][j] + "|");
			}
			System.out.println();
		}
	}

	private static double getMax(double[][] qq) {

		double max = 0;

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				if (qq[i][j] > max) {
					max = qq[i][j];
				}
			}
		}

		return max;
	}

	private static void getMaxIndex(double[][] qq, double max) {

		System.out.println();

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				if (qq[i][j] == max) {
					System.out.println("Максимальное расстояние от позиции " + i + " до позиции" + j);
				}
			}
		}
	}

}
