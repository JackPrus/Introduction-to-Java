package by.jonline.module3.asstring;

import java.util.*;


public class Task07 {

	/*
	 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все
	 * пробелы. Например, если было введено "abc cde def", то должно быть выведено
	 * "abcdef".
	 * 
	 */

	public static void main(String[] args) {

		String s = "aa bbb cdef ggg hhh iii jkaaaaa lbbbmmmcccnn      ";

		String newS = createCorrectLine(s);

		System.out.println(newS);

	}

	private static String createCorrectLine(String s) {

		List<Integer> deleteList = deleteArray(s);

		StringBuilder sb = new StringBuilder(s);

		int counter = 0; // т.к. массив уменьшается походу удаления счетчик помогает попадать в точные элементы.

		for (int i = 0; i < deleteList.size(); i++) {
			sb.deleteCharAt(deleteList.get(i) - counter);
			counter++;
		}

		return sb.toString();

	}

	
	private static List<Integer> deleteArray(String s) {
		
		//создаем массив индексов, которые будем удалять.

		List<Integer> deleteList = new ArrayList<>();

		if (s.substring(0, 1).equals(" ")) {
			deleteList.add(0);
		}

		for (int i = 1; i < s.length(); i++) {
			
			if (s.substring(i, i + 1).equals(" ")) {
				deleteList.add(i);
				
			} else
				for (int j = 0; j < i; j++) {
					
					if (s.substring(j, j + 1).equals(s.substring(i, i + 1))) {
						deleteList.add(i);
						break; 
						// брейк нужен для того, чтобы не записать в лист уже используемые элементы.
					}
				}
		}
		return deleteList;

	}

}