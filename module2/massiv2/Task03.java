package by.jonline.module2.massiv2;

import java.util.Random;

public class Task03 {

	// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

	public static void main(String[] args) {

		int[][] a;
		int k = 4; 							// строка, которую будем выводить
		int r = 3; 							// столбец, который будем выводить.

		a = matrixInitialization();
		printArray(a);
		System.out.println("вывод строки k:");
		printStrok(a, k);
		System.out.println();
		System.out.println("вывод столбца r:");
		printStolb(a, r);

	}

	private static int[][] matrixInitialization() { // в этом случае создадим массив, где число столбцов
																// разное для каждой строки.

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

		System.out.println("Сгенерированный массив:");

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				System.out.print(qq[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println("________________________");
		System.out.println();
	}

	private static void printStrok(int[][] qq, int strok) {

		if (qq.length - 1 < strok) {
			System.out.print("Заданной строки нет в сгенерированном массиве");
		} else {
			for (int j = 0; j < qq[strok].length; j++) {
				System.out.print(qq[strok][j] + "|");
			}
		}
	}

	private static void printStolb(int[][] qq, int stolb) {

		for (int i = 0; i < qq.length; i++) {
			if (qq[i].length - 1 < stolb) {
				System.out.print(String.format("Столбца %d нет в строке %d |", stolb, i));
			} else {
				System.out.print(qq[i][stolb] + "|");
			}
		}

	}

}
