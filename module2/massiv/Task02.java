package by.jonline.module2.massiv;

import java.util.Arrays;
import java.util.Random;

public class Task02 {

	private static int count;

	public static void main(String[] args) {

		/*
		 * Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее
		 * члены, большие данного Z, этим числом. Подсчитать количество замен.
		 */

		int n = 15; 					// задаем длину массива тут.
		double z = 4.5; 				// задаем число больше которого будем искать. и заменять.

		Random rand = new Random();
		double min = -100; 				
		double max = 100;

		double[] a = new double[rand.nextInt(n)];

		for (int i = 0; i < a.length; i++) { 				
			a[i] = (rand.nextDouble() * (max - min)) + min;
		}

		System.out.println(Arrays.toString(a)); 			

		for (int i = 0; i < a.length; i++) { 			   
			if (a[i] > z) {
				count++;
				a[i] = z;
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println(count);

	}
}
