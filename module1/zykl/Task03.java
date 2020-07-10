package by.jonline.module1.zykl;

public class Task03 {
	public static void main(String[] args) {

		// Найти сумму квадратов первых ста чисел.

		float f = 0f;

		for (int i = 1; i <= 100; i++) {
			f = f + (i * i);
		}
		
		System.out.println(f);

	}
}
