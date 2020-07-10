package by.jonline.module2.massiv2;

public class Task04 {

	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 * 1,2,3....n n,n-1,n-2...1 1,2,3....n n,n-1,n-2....
	 */

	public static void main(String[] args) {

		int n = 8;
		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = j + 1;
			}
		}

		for (int i = 1; i < n; i += 2) {
			for (int j = 0; j < n; j++) {
				a[i][j] = n - j;
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
