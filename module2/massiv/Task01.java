package by.jonline.module2.massiv;

import java.util.Arrays;
import java.util.Random;

public class Task01 {

	private static int sum;

	public static void main(String[] args) {

		// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
		// кратны данному К.

		int k = 3;                                 // элементк K делимое для которого будем суммировать.

		Random rand = new Random();

		int[] a = new int[rand.nextInt(20)];     

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(49);             
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}

		System.out.println(Arrays.toString(a));   
		System.out.println(sum);                  

	}
}
