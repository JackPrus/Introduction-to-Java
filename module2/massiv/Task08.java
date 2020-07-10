package by.jonline.module2.massiv;

import java.util.Arrays;

public class Task08 {
	public static void main(String[] args) {

		/*
		 * Дана последовательность целых чисел a1,a2..an . Образовать новую
		 * последовательность, выбросив из исходной те члены, которые равны ) min(
		 * a1,a2..an).
		 */

		int[] a = { 4, 6, 7, 1, 6, 5, 1, 8, 5, 1, 6, 8, 8, 243, 435, 467, 567, 3, 452, 21, 23, 11, 1, 1, 1, 14, 5, 7 };
		int[] b;
		int count;
		int min;

		min = findMin(a);
		count = countMin(a, min);
		b = createNewMass(a, min, count);

		System.out.println(min);
		System.out.println(count);
		System.out.println(Arrays.toString(b));

	}

	private static int findMin(int[] qq) {

		int min = qq[0];

		for (int i = 0; i < qq.length; i++) {
			if (qq[i] < min) {
				min = qq[i];
			}
		}
		return min;
	}

	private static int countMin(int[] qq, int min) {

		int count = 0;

		for (int i = 0; i < qq.length; i++) {
			if (qq[i] == min) {
				count++;
			}
		}
		return count;
	}

	private static int[] createNewMass(int[] aa, int min, int countmin) {

		int[] bb = new int[aa.length - countmin];

		int i = 0;
		int j = 0;

		for (j = 0; j < aa.length;) {
			if (aa[j] != min) {
				bb[i] = aa[j];
				i++;
				j++;
			} else {
				j++;
			}
		}
		return bb;
	}

}
