package by.jonline.module2.massiv2;

public class Task02 {

	/*
	 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
	 */

	public static void main(String[] args) {

		int[][] a = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					System.out.print(a[i][j] + " ");
				}
			}
		}

	}
}
