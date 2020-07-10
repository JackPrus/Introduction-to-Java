package by.jonline.module1.vetvlen;

public class Task04 {
	public static void main(String[] args) {

		/*
		 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		 * Определить, пройдет ли кирпич через отверстие.
		 */

		// ввод параметров

		int a = 4;
		int b = 6;
		int x = 5;
		int y = 5;
		int z = 3;

		if ((a > 0) && (b > 0) && (x > 0) && (y > 0) && (z > 0)) {

			if (((a - x) >= 0) && ((b - y) >= 0)) {
				System.out.println("Пройдёт");
			} else if (((a - x) >= 0) && ((b - z) >= 0)) {
				System.out.println("Пройдёт");
			} else if (((a - y) >= 0) && ((b - z) >= 0)) {
				System.out.println("Пройдёт");
			} else if (((a - y) >= 0) && ((b - x) >= 0)) {
				System.out.println("Пройдёт");
			} else if (((a - z) >= 0) && ((b - x) >= 0)) {
				System.out.println("Пройдёт");
			} else if (((a - z) >= 0) && ((b - y) >= 0)) {
				System.out.println("Пройдёт");
			} else {
				System.out.println("Не пройдёт!!!");
			}
		} else {
			System.out.println("Введите параметр больше нуля");
		}

	}
}
