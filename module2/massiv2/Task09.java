package by.jonline.module2.massiv2;

import java.util.Random;

public class Task09 {

	/*
	 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	 * столбце. Определить, какой столбец содержит максимальную сумму
	 * 
	 * (Решение учитывает разную длину строк)
	 * 
	 */

	public static void main(String[] args) {

		int[][] aa;
		int maxStrok;
		int max;

		aa = matrixInitialization();
		printArray(aa);
		
		maxStrok = getMaxStrok(aa); 				// Находим макс длину строки чтобы знать до какого момента делать отсчет столбцов.

		int[] summArray = new int[maxStrok]; 		// массив в который запишем суммы каждого столбца

		summArray = getSummStolb(aa, maxStrok);  	// определяем суммы столбцов и записываем в массив.
		prinSummArray(summArray);					// выводим на экран суммы столбцов для предварительной проверки
		max = findMaxSummArray(summArray);			
		
		printMaxSummArray(summArray, max);

	}

	private static int[][] matrixInitialization() {

		Random rand = new Random();
		int max = 11;
		int min = 2;

		int ii = min + rand.nextInt(max - min);

		int[][] aa = new int[ii][];

		for (int i = 0; i < aa.length; i++) {
			aa[i] = new int[rand.nextInt(10)];
			for (int j = 0; j < aa[i].length; j++) {
				aa[i][j] = (rand.nextInt(100 - 10)) + 10;
			}
		}
		return aa;
	}

	private static void printArray(int[][] qq) {

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				System.out.print(qq[i][j] + "|");
			}
			System.out.println();
		}
	}

	private static int getMaxStrok(int[][] aa) {

		int maxStrok = 0;

		for (int i = 0; i < aa.length; i++) {
			if (aa[i].length > maxStrok) {
				maxStrok = aa[i].length;
			}
		}
		return maxStrok;
	}

	private static int[] getSummStolb(int[][] aa, int maxStrok) {

		int[] summArray = new int[maxStrok];

		for (int j = 0; j < maxStrok; j++) {
			int sum = 0;
			for (int i = 0; i < aa.length; i++) {
				if (j < aa[i].length) {
					sum += aa[i][j];
				}
			}
			summArray[j] = sum;
		}
		return summArray;
	}

	private static void prinSummArray(int[] qq) {

		System.out.println("_________________________");

		for (int i = 0; i < qq.length; i++) {
			System.out.println("В столбце " + i + " сумма элементов: " + qq[i]);
		}
		
		System.out.println("_________________________");
	}

	private static int findMaxSummArray(int[] summArray) {

		int maxSummArray = 0;

		for (int i = 0; i < summArray.length; i++) {
			if (summArray[i] > maxSummArray) {
				maxSummArray = summArray[i];
			}
		}

		return maxSummArray;

	}

	private static void printMaxSummArray(int[] qq, int max) {

		for (int i = 0; i < qq.length; i++) {
			if (qq[i] == max) {
				System.out.println("Сумма столбца " + i + " максимальна: " + qq[i]);
			}
		}

	}

}
