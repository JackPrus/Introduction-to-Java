package by.jonline.module2.decomposition;

public class Task14 {

	/*
	 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
	 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
	 * числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
	 */

	public static void main(String[] args) {

		int k = 1000000; 						// ввести число до которого будем искать числа армстронга

		for (int j = 1; j <= k; j++) {

			int[] aa;
			int sum = 0;

			aa = createMass(j);									// создаем массив из чисел включающих j.

			for (int i = 0; i < aa.length; i++) {		
				sum += Math.pow(aa[i], getNumCount(j));			// каждоая цифра в степень количества цифр
			}
			if (sum == j) {
				System.out.print(sum + "|");
			}
		}

	}

	private static int getNumCount(int a) { // определим число знаков в числе k

		int counter = 0;

		while (a > 0.1) {
			counter++;
			a = a / 10;
		}
		return counter;

	}

	private static int[] createMass(int n) {

		int[] qq = new int[getNumCount(n)];

		for (int i = 0; i < qq.length; i++) {
			qq[i] = n % 10;
			n = n / 10;
		}

		return qq;

	}
}
