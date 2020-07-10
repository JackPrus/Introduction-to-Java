package by.jonline.module1.vetvlen;

public class Task05 {
	public static void main(String[] args) {

		// Вычислить значение функции

		double x = 3;
		double fx = 0;

		if (x <= 3) {
			fx = Math.pow(x, 2) - (3 * x) + 9;
		}
		if (x > 3) {
			fx = 1 / (Math.pow(x, 3) + 6);
		} else {
			System.out.println("Введите корректное число");
		}
		System.out.println(fx);

	}
}
