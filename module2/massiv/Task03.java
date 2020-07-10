package by.jonline.module2.massiv;

import java.util.Arrays;
import java.util.Random;

public class Task03 {

	private static int countplus;
	private static int countminus;
	private static int countnul;

	public static void main(String[] args) {

		/*
		 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
		 * в нем отрицательных, положительных и нулевых элементов.
		 */

		int n = 20; 							// Задаем размер массива тут.

		Random rand = new Random();
		double min = -1;
		double max = 1;

		double[] mass = new double[n];

		for (int i = 0; i < mass.length; i++) { 							
			mass[i] = (rand.nextDouble() * (max - min)) + min;					// присвоим массиву значинея от [-1 до +1);
			if (mass[i] > 0) {
				countplus++;
			} else if (mass[i] < 0) {
				countminus++;
			} else if (mass[i] == 0) {
				countnul++;
			}
		}

		System.out.println(Arrays.toString(mass));
		System.out.println(String.format("Чисел меньше нуля %d" + "\n" + 
										 "Чисел больше нуля %d" + "\n" + 
										 "Равных нулю %d",
										 countminus, countplus, countnul));

	}
}
