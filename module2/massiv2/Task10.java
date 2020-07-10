package by.jonline.module2.massiv2;

public class Task10 {

	// Найти положительные элементы главной диагонали квадратной матрицы.

	public static void main(String[] args) {

		int[][] aa = { 
				{ 1, 2, 3, 4 },
				{ -1, -2, -3, -4 },
				{ 5, 6, 7, 8 },
				{ -5, -6, -7, -8 } };

		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				if ((i == j) && (aa[i][j] > 0)) {
					System.out.print(aa[i][j] + "|");
				}
			}
		}

	}

}
