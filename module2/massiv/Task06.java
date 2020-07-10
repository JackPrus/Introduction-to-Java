package by.jonline.module2.massiv;

import java.util.Arrays;
import java.util.Random;

public class Task06 {

	private static double summ;

	public static void main(String[] args) {

		/*
		 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		 * порядковые номера которых являются простыми числами.
		 */

		Random rand = new Random();

		double[] mas = new double[rand.nextInt(10)];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() * 100; // Задаем значения массива от 0 до 99
			if (checkProst(i)) {
				summ += mas[i];
			}

		}

		System.out.println(Arrays.toString(mas));
		System.out.println(summ);

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

}
