package by.jonline.module2.decomposition;

public class Task05 {

	/*
	 * Составить программу, которая в массиве A[N] находит второе по величине число
	 * (вывести на печать число, которое меньше максимального элемента массива, но
	 * больше всех других элементов).
	 */

	public static void main(String[] args) {

		int[] aa = { -3, -2, 8, 1, 2, 3, 4, 6, 9 };

		int max = 0;

		max = getMax(aa, max);
		max = getMax(aa, max);

		System.out.println(max);

	}

	private static int getMax(int[] qq, int max) {

		int localMax = 0;

		for (int i = 0; i < qq.length; i++) {
			if ((qq[i] > localMax) && (qq[i] != max)) {
				localMax = qq[i];
			}
		}
		return localMax;

	}

}
