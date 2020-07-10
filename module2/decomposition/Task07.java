package by.jonline.module2.decomposition;

public class Task07 {

	// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
	// от 1 до 9.

	public static void main(String[] args) {

		int n = 800000; // сумму факториалов нечетных чисел до которого будем искать

		if (n > 800000) {
			System.out.println("Время ожидания вычисления слишком большое. Укажите число меньше");
		} else {
			long sumfac;

			sumfac = sumFact(n);

			System.out.println(sumfac);
		}

	}

	private static long sumFact(int n) {

		long sumFac = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				int fac = 1;
				for (int j = 1; j <= i; j++) {
					fac = fac * j;
				}
				sumFac = sumFac + fac;
			}

		}
		return sumFac;
	}

}
