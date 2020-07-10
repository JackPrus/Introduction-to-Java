package by.jonline.module2.massiv;

import java.util.Arrays;

public class Task10 {

	/*
	 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из
	 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
	 * Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		a = createNewMass(a);
		System.out.println(Arrays.toString(a));

	}

	public static int[] createNewMass(int[] mass) {

		int schetchik = 1;

		if (mass.length < 2) {
			return mass;
		}

		else {
			for (int i = 2; i < mass.length; i += 2) {
				mass[schetchik] = mass[i];
				schetchik++;
			}

			if (mass.length % 2 == 0) {
				mass = Arrays.copyOf(mass, mass.length / 2);
			} else {
				mass = Arrays.copyOf(mass, (mass.length + 1) / 2);
			}

		}
		return mass;
	}

}