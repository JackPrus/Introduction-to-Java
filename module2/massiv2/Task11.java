package by.jonline.module2.massiv2;

import java.util.Random;

public class Task11 {

	/*
	 * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
	 * матрицу и номера строк, в которых число 5 встречается три и более раз.
	 */

	public static void main(String[] args) {

		int[][] aa;

		aa = matrixInitialization();

		printArray(aa);
		System.out.println("___________________________________________________");
		checkFive(aa);

	}

	private static int[][] matrixInitialization() {

		Random rand = new Random();
		
		int[][] qq = new int[20][10];

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				qq[i][j] = (rand.nextInt(15));
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

	private static void checkFive(int[][] qq) {

		for (int i = 0; i < qq.length; i++) {

			int fiveCounter = 0;

			for (int j = 0; j < qq[i].length; j++) {
				if (qq[i][j] == 5) {
					fiveCounter++;
				}
			}
			if (fiveCounter >= 3) {
				System.out.println("В строке " + i + " число \"5\" встречается " 
									+ fiveCounter + " раз(а);");
			}
		}

	}

}
