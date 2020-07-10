package by.jonline.module2.decomposition;

public class Task17 {

	/*
	 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его
	 * цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для
	 * решения задачи использовать декомпозицию.
	 */

	public static void main(String[] args) {

		int n = 1234567;
		int count = 0;

		while (n > 9) {

			int[] aa = createMass(n);
			n = getSum(aa);
			count++;

		}
		System.out.println(count);

	}

	private static int[] createMass(int n) {

		int[] qq = new int[getNumCount(n)];

		for (int i = qq.length - 1; i >= 0; i--) {
			qq[i] = n % 10;
			n = n / 10;
		}

		return qq;

	}

	private static int getNumCount(int a) { // определим число элементов

		int counter = 0;

		while (a > 0.1) {
			counter++;
			a = a / 10;
		}
		return counter;

	}

	private static int getSum(int[] qq) {
		int sum = 0;

		for (int i = 0; i < qq.length; i++) {
			sum += qq[i];
		}
		return sum;
	}

}
