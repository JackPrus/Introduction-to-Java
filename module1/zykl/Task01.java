package by.jonline.module1.zykl;

import java.io.*;

public class Task01 {
	public static void main(String[] args) throws IOException {

		/*
		 * Напишите программу, где пользователь вводит любое целое положительное число.
		 * А программа суммирует все числа от 1 до введенного пользователем числа.
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Введите положительное целое число");

		try {

			while (true) {

				String ss = reader.readLine();
				int n = Integer.parseInt(ss);

				if (n > 0) {
					int b = 0;
					for (int i = 1; i <= n; i++) {
						b += i;
					}

					System.out.println("Cумма от 1 до " + n + ": " + b);
					break;

				} else {
					System.out.println("Вероятно вы ввели число меньше либо равное нулю. Повторите ввод заново");
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Вы ввели не целое число, либо вообще не число. Повторите запуск программы, используя корректные данные");
		}

	}
}
