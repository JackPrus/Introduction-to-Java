package by.jonline.module2.decomposition;

import java.util.Arrays;

public class Task13 {

	/*
	 * Два простых числа называются «близнецами», если они отличаются друг от друга
	 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
	 * [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
	 * использовать декомпозицию.
	 */

	public static void main(String[] args) {

		int n = 45; // ввести число n;
		int[] a;

		a = createMass(n);
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i + 1] - a[i] == 2) {
				System.out.print(a[i] + "~" + a[i + 1] + "|");
			}
		}

	}

	private static boolean checkProst(int qq) { // метод, определяющий является ли число простым

		if ((qq == 0) || (qq == 1)) { 			// т.к. 0 и 1 не являются простыми - выбрасываем для них false
			return false;
		} else if (qq == 2) { 					// т.к. 2 - первое простое число списка - для него true.
			return true;
		}

		for (int i = 2; i < qq; i++) {
			if (qq % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static int[] createMass(int n) {

		int lengthqq = 0;

		for (int i = 0; i <= 2 * n; i++) { // определим количество элементов массива.
			if (checkProst(i)) {
				lengthqq++;
			}
		}

		int[] qq = new int[lengthqq];

		int j = 0;
		for (int i = 0; i < 2 * n; i++) {
			if (checkProst(i)) {
				qq[j] = i;
				j++;
			}
		}

		return qq;

	}

}
