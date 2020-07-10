package by.jonline.module2.massiv2;

public class Task16 {

	// создать магический квадрат.

	

	public static void main(String[] args) {

		int n = 5; 					// задаем порядок магического квадрата (нечетное).

		int[][] aa;

		while (true) {
			if ((n % 2 != 0)&&(n>0)) {

				aa = matrixSiamInitialization(n);

			} else {

				System.out.println("Введите положительное нечетное число");
				break;
				
			}

			System.out.println();
			
			int sum = 0;
																
			for (int j = 0; j < aa[0].length; j++) { 					// контрольный подсчет суммы 0-й строки.

				sum = sum + aa[0][j];

			}

			if (
					checkSummStrok(aa, sum) && 
					checkSummStolb(aa, sum) && 
					checkFirstDiag(aa, sum) && 
					checkSecondDiag(aa, sum)
					) {

				printArray(aa);
				break;

			} else {

				System.out.println("Сгенерирована матрица не являющаяся магическим квадратом.");

			}

		}

	}

	private static int[][] matrixSiamInitialization(int n) {

		int qq[][] = new int[n][n];

		int y = 0;
		int x = n / 2;
		int square = n * n;

		for (int i = 1; i <= square; i++) {
			qq[y][x] = i;
			if (i % n == 0) {
				y++;
			} else {
				if (y == 0) {
					y = n - 1;
				} else {
					y--;
				}
				if (x == (n - 1)) {
					x = 0;
				} else {
					x++;
				}

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

	private static boolean checkSummStrok(int[][] qq, int sum) {

		int countRight = 0;

		for (int i = 0; i < qq.length; i++) {
			int localSumm = 0;
			for (int j = 0; j < qq.length; j++) {
				localSumm += qq[i][j];
			}
			if (localSumm == sum) {
				countRight++;
			}
		}

		if (countRight == qq.length) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean checkSummStolb(int[][] qq, int sum) {

		int countRight = 0;

		for (int i = 0; i < qq.length; i++) {
			int localSumm = 0;
			for (int j = 0; j < qq.length; j++) {
				localSumm += qq[j][i];
			}
			if (localSumm == sum) {
				countRight++;
			}
		}

		if (countRight == qq.length) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean checkFirstDiag(int[][] qq, int sum) {

		int localSumm = 0;

		for (int i = 0; i < qq.length; i++) {

			for (int j = 0; j < qq.length; j++) {
				if (i == j) {
					localSumm += qq[j][i];
				}
			}
		}

		if (localSumm == sum) {
			return true;
		} else {
			return false;
		}

	}

	private static boolean checkSecondDiag(int[][] qq, int sum) {

		int localSumm = 0;

		for (int i = 0; i < qq.length; i++) {

			for (int j = 0; j < qq.length; j++) {
				if (j == qq[i].length - 1 - i) {
					localSumm += qq[j][i];
				}
			}
		}

		if (localSumm == sum) {
			return true;
		} else {
			return false;
		}

	}

}
