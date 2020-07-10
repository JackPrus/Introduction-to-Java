package by.jonline.module2.sortirovka;

public class Task07 {

	/*
	 * Пусть даны две неубывающие последовательности действительных чисел
	 * a1<=a2....<=an; b1<=b...<=bm; Требуется указать те места, на которые нужно
	 * вставлять элементы последовательности в первую последовательность так, чтобы
	 * новая последовательность оставалась возрастающей.
	 * 
	 */

	public static void main(String[] args) {

		int[] aa = { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
		int[] bb = { -1, 0, 1, -1, 0, 1 };

		int counter = 0;

		for (int i = 0; i < bb.length; i++) {
			for (int j = 0; j < aa.length; j++) {
				if (bb[i] <= aa[j]) {
					System.out.println("Элемент " + bb[i] + " в позицию: " + (j + counter));
					counter++;
					break;
				}
			}
		}

	}

}
