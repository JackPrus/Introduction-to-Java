package by.jonline.module2.sortirovka;

import java.util.Arrays;

public class Task05 {

	// Сортировка вставками (возрастание)

	public static void main(String[] args) {

		int[] aa = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < aa.length; i++) {
			
			int m = aa[i];
			int j = i - 1;
			
			for (; j >= 0; j--) {

				if (m < aa[j]) {
					aa[j + 1] = aa[j];
				} else {
					break;
				}
			}
			aa[j + 1] = m;
		}

		System.out.println(Arrays.toString(aa));

	}

}
