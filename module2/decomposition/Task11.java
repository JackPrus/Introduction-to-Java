package by.jonline.module2.decomposition;

public class Task11 {

	// Написать метод(методы), определяющий, в каком из данных двух чисел больше
	// цифр.

	public static void main(String[] args) {

		int a = 12345678;
		int b = 12345;

		System.out.println(getLarger(a, b));

	}

	private static int getLarger(int a, int b) {

		int counterA;
		int counterB;

		counterA = getCount(a);
		counterB = getCount(b);

		if (counterA > counterB) {
			return a;
		} else {
			return b;
		}

	}

	private static int getCount(int a) {

		int counter = 0;

		while (a > 0.1) {
			counter++;
			a = a / 10;
		}
		return counter;

	}

}
