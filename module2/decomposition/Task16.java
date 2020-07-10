package by.jonline.module2.decomposition;

public class Task16 {

	/*
	 * Написать программу, определяющую сумму n - значных чисел, содержащих только
	 * нечетные цифры. Определить также, сколько четных цифр в найденной сумме. Для
	 * решения задачи использовать декомпозицию
	 * 
	 */

	public static void main(String[] args) {

		int n = 1; // Ввести n, обозначающую сколько знаков будет у числа.
		
		if((n<1)||(n>7)) {
			System.out.println("Число не корректное, введите число от 0 до 8");
		}else {

	        double ot = Math.pow(10,n)-(Math.pow(10, n) - Math.pow(10, (n - 1)));
			double to = Math.pow(10, n);

			int sum = 0;

			for (int i = (int) ot; i < (int) to; i++) {

				int[] aa = createMass(i);

				if (checkOddArray(aa)) {
					sum += i;
				}

			}
			System.out.println(sum);

			int[] bb = createMass(sum);
			System.out.println(checkEvenCount(bb));
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

		for (int i = qq.length - 1; i >= 0; i--) {
			qq[i] = n % 10;
			n = n / 10;
		}

		return qq;

	}

	private static boolean checkOddArray(int[] qq) { // проверка что все числа массива нечетные.

		int counter = 0;

		for (int i = 0; i < qq.length; i++) {
			if (qq[i] % 2 != 0) {
				counter++;
			}
		}

		if (counter == (qq.length)) {
			return true;
		} else {
			return false;
		}

	}

	private static int checkEvenCount(int[] qq) { // сколько четных чисел в числе разбитом в массив.

		int counter = 0;

		for (int i = 0; i < qq.length; i++) {
			if (qq[i] % 2 == 0) {
				counter++;
			}
		}
		return counter;

	}

}
