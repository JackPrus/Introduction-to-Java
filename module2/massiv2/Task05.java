package by.jonline.module2.massiv2;

public class Task05 {

	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 * 11...111 22...220 33...300 n0...000
	 * 
	 */

	public static void main(String[] args) {

		int n = 8;
		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = i + 1;
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j < n; j++) {
				a[i][j] = 0;
			}

		}

		printArray(a);

	}

	private static void printArray(int[][] qq) {

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				System.out.print(qq[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println();
	}

}
