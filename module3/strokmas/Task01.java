package by.jonline.module3.strokmas;

import java.util.Arrays;

public class Task01 {
	/*
	 * Дан массив названий переменных в camelCase. Преобразовать названия в
	 * snake_case.
	 */

	public static void main(String[] args) {

		String[] camel = { "ФилософияJava", "HeadFirst", "ЭффективноеПрограммирование" };

		String[] snake = new String[camel.length];

		snake = arrayToSnake(camel);
		System.out.println(Arrays.toString(snake));

	}

	private static String[] arrayToSnake(String[] s) {

		String[] snake = new String[s.length];

		for (int i = 0; i < s.length; i++) {
			snake[i] = toSnakeCase(s[i]);
		}

		return snake;

	}

	private static boolean isUpperCase(char element) {
		
		if (((int) element >= 1040 && (int) element <= 1071) ||  // коды русских заглавных букв
				((int) element == 1025) || 
				((int) element >= 65 && (int) element <= 90) // коды английских заглавных букв
		) {
			return true;
		} else {
			return false;
		}
	}

	private static int getQuantityOfUpperCase(char[] mass) {
		
		int quantity = 0;
		
		for (char qq : mass) {
			if (isUpperCase(qq)) {
				quantity++;
			}
		}
		return quantity;
	}

	private static String toSnakeCase(String s) {

		s = s.replace(" ", ""); // удаляем пробелы.
		
		char[] chars = s.toCharArray();
		int pluslength = getQuantityOfUpperCase(chars);
		char[] convertedArr = new char[chars.length + pluslength]; 
		
		// наш массив увеличится, т.к. будем добавлять новые знаки "_";

		int counter = 0;

		for (int i = 0; i < chars.length; i++) {

			if (isUpperCase(chars[i])) {
				convertedArr[i + counter] = '_';
				counter++;
				chars[i] = Character.toLowerCase(chars[i]);
			}
			convertedArr[i + counter] = chars[i];
		}
		
		String newLine = charToString(convertedArr);
		char firstElement = newLine.charAt(0);

		return (firstElement == '_') ? newLine.substring(1) : newLine;
	}

	private static String charToString(char[] chars) {
		
		StringBuilder sb = new StringBuilder();
		for (char ch : chars) {
			sb.append(ch);
		}
		return sb.toString();
	}

}