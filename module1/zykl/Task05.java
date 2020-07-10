package by.jonline.module1.zykl;

public class Task05 {

	private static double sum; // переменная куда будем записывать сумму.

	public static void main(String[] args) {

		/*
		 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
		 * которых больше или равен заданному е. Общий член ряда имеет вид: a =
		 * (1/(2^n))+(1/(3^n))
		 */

		int e = -4; // число "e" сумму от которого будем искать.

		for (int i = Math.abs(e); i < 100; i++) {       			// чем больше мы выставим оборотов цикла - тем точнее будет результат.
			sum = sum + ((1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i))));
		}

		System.out.println(sum);

	}
}
