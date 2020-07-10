package by.jonline.module2.sortirovka;

import java.util.Arrays;

public class Task03 {

	// Сортировка выбором (по убыванию.)

	public static void main(String[] args) {

		int[] aa = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };  // исходный массив

		for (int i = 0; i < aa.length; i++) {
			int m = i;
			for (int j = i; j < aa.length; j++) {
				if (aa[j] > aa[m]) {
					m = j;
				}
			}
			swap(aa, i, m);
		}

		System.out.println(Arrays.toString(aa));

	}

	private static void swap(int[] qq, int a, int b) {

		int m;
		m = qq[a];
		qq[a] = qq[b];
		qq[b] = m;

	}

}
