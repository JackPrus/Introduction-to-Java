package by.jonline.module1.zykl;

public class Task02 {
	public static void main(String[] args) {

		// Вычислить значения функции на отрезке [а,b] c шагом h:

		int a = (-7); 		// Начальное значение
		int b = 6; 			// конечное значение
		int h = 1; 			// шаг.

		for (int i = a; i <= b; i = i + h) {
			
			int y = 0;
			
			if (i > 2) {
				y = i;
			} else if (i >= 0 && i <= 2) {
				y = (-i);
			} else if (i < 0) {
				y = i;
			}

			System.out.print(y + "|");

		}
	}
}