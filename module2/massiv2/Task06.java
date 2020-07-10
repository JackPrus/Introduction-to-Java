package by.jonline.module2.massiv2;

public class Task06 {

	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 * 111...111 011...110 001...100 ''''''''' 011...110 111...111
	 */

	public static void main(String[] args) {

		int n = 24; // устанавливаем порядок матрицы тут.

		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = 1;
			}
		}

		for (int i = 1; i < n / 2; i++) {
			for (int j = 0; j < i; j++) {
				a[i][j] = 0;
			}
			for (int j = n - 1; j > n - 1 - i; j--) {
				a[i][j] = 0;
			}

		}

		for (int i = n - 1 - 1; i >= n / 2; i--) {
			for (int j = 0; j < n - i - 1; j++) {
				a[i][j] = 0;
			}
			for (int j = n - 1; j > i; j--) {
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
