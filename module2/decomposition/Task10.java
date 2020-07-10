package by.jonline.module2.decomposition;

import java.util.Arrays;

public class Task10 {

	/*
	 * Дано натуральное число N. Написать метод(методы) для формирования массива,
	 * элементами которого являются цифры числа N.
	 */

	public static void main(String[] args) {

		int n = 123456; 			// вводим натуральное число.
		int aa[];

		aa = createArray(n);

		System.out.println(Arrays.toString(aa));

	}

	private static int[] createArray(int n) {

		int znak = 0;
		int counter = n;
		int[] qq;
		int ostatok;

		while (counter > 0.1) {					// определяем количество знаков в числе. 
			znak++;
			counter = counter / 10;
		}

		qq = new int[znak];

		for (int i = znak - 1; i >= 0; i--) {
			ostatok = n % 10;
			qq[i] = ostatok;
			n = n / 10;
		}
		return qq;
	}
}
