package by.jonline.module2.decomposition;

import java.util.Arrays;

public class Task12 {

	/*
	 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
	 * элементами которого являются числа, сумма цифр которых равна К и которые не
	 * большее N.
	 */

	public static void main(String[] args) {

		int k = 26; // вводим числа K и N здесь.
		int n = 5;

		int[] a;

		a = createMass(k, n);

		System.out.println(Arrays.toString(a));

	}

	private static int getCount(int a, int b) { // определим количество элементов будущего массива (отношение k к n)

		int counter = 0;

		while (a > 0) {
			counter++;
			a = a - b;
		}
		return counter;

	}

	private static int[] createMass(int k, int n) {

		int[] qq;
		int ost;
		int z = k;

		qq = new int[getCount(k, n)];

		for (int i = 0; i < qq.length; i++) {
			if (z % n != 0) {
				ost = k % n;
				qq[i] = ost;
				z = z - ost;
			} else {
				qq[i] = z / n;
			}
		}

		return qq;
	}

}
