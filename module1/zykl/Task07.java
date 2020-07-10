package by.jonline.module1.zykl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task07 {
	public static void main(String[] args) throws IOException {

		/*
		 * Для каждого натурального числа в промежутке от a до b вывести все делители,
		 * кроме единицы и самого числа. a и b вводятся с клавиатуры.
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите число (а)");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("Введите число (b)");
		int b = Integer.parseInt(reader.readLine());

		int c = 36; // число, которому будем определять делители.

		List<Integer> list = new ArrayList<>();

		if (c > a && c < b) {
			for (int i = 2; i < c; i++) {
				if (c % i == 0) {
					list.add(i);
				} else {
				}
				continue;
			}
			for (int s : list) {
				System.out.print(s + "|");
			}
		} else {
			System.out.println(String.format(
					"Во введенном диапазоне нет делителей, удовлетворяющих условию. Возможно число %d не принадлежит этому диапазону.",c));
		}

	}
}
