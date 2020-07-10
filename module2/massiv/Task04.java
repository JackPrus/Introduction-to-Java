package by.jonline.module2.massiv;

import java.util.Arrays;

public class Task04 {
	public static void main(String[] args) {

		/*
		 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
		 * наименьший элементы
		 */

		double[] mas = { 11.9, -1.4, 2.0, 4.6, -0.4, 6.7, -4.6, 4.7, 1.2, -7.5 };

		double max = mas[0];
		double min = mas[0];

		for (int i = 0; i < mas.length; i++) { 
			if (mas[i] > max) {
				max = mas[i];
			} else if (mas[i] < min) {
				min = mas[i];
			}
		}

		for (int i = 0; i < mas.length; i++) { 
			for (int j = 0; j < mas.length; j++) { 
				if (mas[j] == max) {
					mas[j] = min;
				}
			}
			if (mas[i] == min) {
				mas[i] = max;
			}
		}

		System.out.println("Максимум :" + max + "; Минимум: " + min + ";");
		System.out.println(Arrays.toString(mas));

	}

}
