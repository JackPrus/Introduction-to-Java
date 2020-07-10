package by.jonline.module2.massiv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task08 {

	/*
	 * В числовой матрице поменять местами два столбца любых столбца, т. е. все
	 * элементы одного столбца поставить на соответствующие им позиции другого, а
	 * его элементы второго переместить в первый. Номера столбцов вводит
	 * пользователь с клавиатуры.
	 * 
	 */
	
	private static int n1;
	private static int n2;

	public static void main(String[] args) throws IOException {		

		int[][] aa = { 
				{ 1, 2, 3, 4 }, 
				{ 1, 2, 3, 4 }, 
				{ 1, 2, 3, 4 }, 
				{ 1, 2, 3, 4 } };

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))

		{

			System.out.println("Введите столбец №1");
			n1 = Integer.parseInt(reader.readLine());
			System.out.println("Введите столбец №2");
			n2 = Integer.parseInt(reader.readLine());

			swapStolb(aa);
			printArray(aa);
			

		} catch (IndexOutOfBoundsException e) {
			System.out.println("Введенного столбца нет в массиве.");
		} catch (NumberFormatException e) {
			System.out.println("Введите целое положительное число и повторите запуск программы");
		}

	}

	private static void printArray(int[][] qq) {

		for (int i = 0; i < qq.length; i++) {
			for (int j = 0; j < qq[i].length; j++) {
				System.out.print(qq[i][j] + "|");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static int[][] swapStolb (int[][] qq) {
		
		int f;
			
		for (int i = 0; i < qq.length; i++) {
			f = qq[i][n1];
			qq[i][n1] = qq[i][n2];
			qq[i][n2] = f;
		}
		
		return qq;
		
	}

}
