package by.jonline.module2.massiv;

import java.util.Arrays;

public class Task09 {

	/*
	 * В массиве целых чисел с количеством элементов n найти наиболее часто
	 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
	 * них.
	 */

	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 57, 8, 9, 9, 9, 7, 5, 12, 14, 16, 19, 21, 24, 26, 5, 44, 32 };
		int[] b;
		int max;
		int minFromMax;

		b = initializeB(a);
		max = findMax(b);
		minFromMax = findMinFromMax(a, max);

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(max);
		System.out.println(minFromMax);

	}

	private static int[] initializeB(int[] qq) {

		int[] b = new int[qq.length];

		for (int i = 0; i < qq.length; i++) {
			b[i] = countFrequency(qq, qq[i]);
		}
		return b;
	}

	private static int countFrequency(int[] qq, int element) {

		int count = 0;

		for (int i = 0; i < qq.length; i++) {
			if (qq[i] == element) {
				count++;
			}
		}

		return count;
	}

	private static int findMax(int[] qq) {

		int max = 0;

		for (int i = 0; i < qq.length; i++) {
			if (qq[i] > max) {
				max = qq[i];
			}
		}

		return max;
	}


	private static int findMinFromMax(int[] qq, int max) {

		int min = 2147483647;

		for (int i = 0; i < qq.length; i++) {
			if (countFrequency(qq, qq[i]) == max) {
				if (qq[i] < min) {
					min = qq[i];
				}
			}
		}
		return min;
	}

}
