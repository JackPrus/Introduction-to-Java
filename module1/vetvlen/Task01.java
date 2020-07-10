package by.jonline.module1.vetvlen;

public class Task01 {
	public static void main(String[] args) {

		/*
		 * Даны два угла треугольника (в градусах). Определить, существует ли такой
		 * треугольник, и если да, то будет ли он прямоугольным.
		 */

		int ugol1 = 45; 	// вводим угол 1 и угол 2 в градусах.
		int ugol2 = 45;

		if (180 - ugol1 - ugol2 > 0) {
			System.out.println("Треугольник существует.");
			if ((180 - ugol1 - ugol2) == 90 || ugol1 == 90 || ugol2 == 90) {
				System.out.println("Он прямоугольный");
			} else {
				System.out.println("Он не прямоугольный");
			}
		} else {
			System.out.println("Такого треугольника не существует");
		}

	}
}
