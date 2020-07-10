package by.jonline.module3.strokmas;

public class Task04 {

	// В строке найти количество чисел.

	public static void main(String[] args) {

		/*
		 * проверки. 
		 * .1234abc1abc - 2 числа 
		 * 1abc.2ab - 2 числа 
		 * abc.ab12.34ab2 - 2 числа
		 * abc13.14dul1.2....4444.a.4.b.c.d.4.4cdf. -5 чисел
		 */

		String qq = "abc13.14dul1.2....4444.a.4.b.c.d.4.4cdf.";

		byte[] qqff = qq.getBytes();
		int numbers = getNumbersQuantity(qqff);

		System.out.println(numbers);

	}

	private static int getNumbersQuantity(byte[] arr) {

		/*
		 * Если начиная с 1го элемента значение (i) равно цифре, то счетчик ++ в случае
		 * если предыдущее число не равно ни точке ни чису. Если значение (i) равно
		 * точке, то счетчик ++ если следующее значение равно цифре, а предыдущее не равно
		 * цифре. C нулевым элементом массива немного инче.
		 * 
		 */

		int counter = 0;

		if (checkNumber(0, arr)) { // у нулевого значения логика отличается. Поэтому отдельно.
			counter++;
		} else if (checkDot(0, arr) && arr.length > 1) {
			if (checkNumber(1, arr)) {
				counter++;
			}
		}

		if (arr.length > 1) { // чтобы не выйти за пределы массива проверяем подходящий ли размер массива

			for (int i = 1; i < arr.length; i++) {
				if (checkNumber(i, arr) && !checkNumber(i - 1, arr) && !checkDot(i - 1, arr)) {
					counter++;
				} else if (checkDot(i, arr) && (i != arr.length - 1)) {
					if (checkNumber(i + 1, arr) && (!checkNumber(i - 1, arr))) {
						counter++;
					}
				}
			}
		}
		return counter;

	}

	private static boolean checkNumber(int i, byte[] array) {

		return (array[i] >= 48 && array[i] <= 57) ? true : false;

	}

	private static boolean checkDot(int i, byte[] array) {
		
		return (array[i] == 46) ? true : false;
	}
}