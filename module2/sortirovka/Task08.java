package by.jonline.module2.sortirovka;

import java.util.Arrays;

public class Task08 {

	/*
	 * Даны дроби p1/q1 , p2/q2 ....pn/qn. p и q - натуральные. Составить программу,
	 * которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке
	 * возрастания.
	 * 
	 */

	public static void main(String[] args) {

		int[] pp = { 26, 22, 24, 28, 30, 22, 36, 34 };
		int[] qq = { 2, 4, 6, 8, 10, 12, 14, 16 };

		double[] ppqq;
		int max;
		int znam;

		ppqq = initArr(pp, qq);
		Arrays.sort(ppqq);

		max = getMax(qq);
		znam = getZnamenatel(qq, max);

		System.out.println("Общий знаменатель: "+znam);
		System.out.println(Arrays.toString(ppqq));

	}

	private static double[] initArr(int[] a, int[] b) {

		double[] qq = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			qq[i] = (double) (a[i] ) / b[i] ; 			// Явное приведение к double нужно, чтобы не терялась дробная часть.
		} 												
		return qq;
	}

	private static int getMax(int[] qq) {
		
		int max = 0;
		
		for (int i = 0; i < qq.length; i++) {
			if (qq[i] > max) {
				max = qq[i];
			}
		}
		return max;
	}

	private static int getZnamenatel(int[] qq, int max) {

		int znamenatel = max;

		while (true) {
			for (int i = 0; i < qq.length; i++) {
				if (znamenatel % qq[i] != 0) {
					znamenatel = znamenatel + max;
					i = 0;
				}
			}
			break;
		}
		return znamenatel;

	}

}
