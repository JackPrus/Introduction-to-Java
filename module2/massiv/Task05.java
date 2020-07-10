package by.jonline.module2.massiv;

public class Task05 {
	public static void main(String[] args) {

		/*
		 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
		 * которых аi > i.
		 */

		int[] a = { 4, 7, 5, 4, 7, 8, 89, 6, 4, 5, 345, 45, 76, 69, 789, 45, 6, 345, 35, 5, 767, 6987, 0 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] > i) {
				System.out.print(a[i] + "|");
			}

		}
	}
}
