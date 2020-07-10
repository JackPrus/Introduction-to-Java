package by.jonline.module2.decomposition;


public class Task15 {

	/*
	 * Найти все натуральные n-значные числа, цифры в которых образуют строго
	 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
	 * использовать декомпозицию.
	 */

	public static void main(String[] args) {

		int n = 123;

		for (int i = 10; i <= n; i++) {

			int[] aa;

			aa = createMass(i);
			if (checkRise(aa)) {
				System.out.print(i + "|");
			}
		}

	}

	private static int getNumCount(int a) {			 // определим число знаков в числе k

		int counter = 0;

		while (a > 0.1) {
			counter++;
			a = a / 10;
		}
		return counter;

	}

	private static int[] createMass(int n) {

		int[] qq = new int[getNumCount(n)];

		for (int i = qq.length - 1; i >= 0; i--) {
			qq[i] = n % 10;
			n = n / 10;
		}

		return qq;

	}

	private static boolean checkRise(int[] qq) {				// проверка на возрастание элементов массива.

		int counter = 0;

		for (int i = 0; i < qq.length - 1; i++) {
			if (qq[i] < qq[i + 1]) {
				counter++;
			}
		}

		if (counter == (qq.length - 1)) {
			return true;
		} else {
			return false;
		}

	}

}
