package by.jonline.module2.decomposition;

public class Task01 {

	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя и
	 * наименьшего общего кратного двух натуральных чисел
	 */

	public static void main(String[] args) {

		int a;
		int b;
		int nok;
		int nod;

		a = 15; 			// задаем значения А и В здесь
		b = 5;

		try {

			nod = getNod(a, b);
			nok = a * b / nod;

			System.out.println("НОД: " + nod);
			System.out.println("НОК: " + nok);

		} catch (ArithmeticException e) {
			System.out.println("Арифметическая ошибка, введите хотябы одно число не равное 0");
		}

	}

	private static int getNod(int a, int b) {

		while (a != 0 && b != 0) {
			if (Math.abs(a) > Math.abs(b)) {
				a = a % b;
			} else {
				b = b % a;
			}
		}

		return b + a;
	}

}
