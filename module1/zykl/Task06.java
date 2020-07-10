package by.jonline.module1.zykl;

public class Task06 {
	public static void main(String[] args) {

		// Вывести на экран соответствие между символами и их численными обозначениями в
		// памяти компьютера.

		for (int i = 0; i < 17; i++) {

			String b = Integer.toBinaryString(i);

			System.out.print(i + "-" + b + " | ");
		}

	}
}
