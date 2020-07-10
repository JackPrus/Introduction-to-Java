package by.jonline.module3.strokmas;

public class Task05 {

	/*
	 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
	 * заменить на одиночные пробелы. Крайние пробелы в строке удалить.
	 */

	public static void main(String[] args) {

		String s = "удалить    лишние пробелы и пробелы   вконце строки    ";
		String newS = deleteExtraSpace(s);

		System.out.println(newS);

	}

	private static String deleteExtraSpace(String s) {

		char[] arrChar = s.toCharArray();

		if (arrChar.length > 1) {

			int counter = 0;

			// определяем сколько лишних пробелов.

			int extraSpaces = countDelete(arrChar);

			// создаем массив с учетом уборки лишних пробелов.

			char[] newLine = new char[arrChar.length - extraSpaces];

			newLine[0] = arrChar[0]; // нулевое значение по-любому добавляем.

			for (int i = 1; i < arrChar.length; i++) {
				if (!checkDelete(i, arrChar)) {
					if (i != arrChar.length - 1) {
					}
					newLine[i - counter] = arrChar[i];
				} else {
					counter++;
				}
			}

			char[] lastArray; // делаем проверку на последний символ пробела в массиве и корректируем.

			if (newLine[newLine.length - 1] == ' ') {
				lastArray = correctArray(newLine);
			} else
				lastArray = newLine;

			return buildString(lastArray);

		} else {
			System.out.println("у строки всего 1 символ");
		}
		return null;
	}

	private static char[] correctArray(char[] arr) {
		
		char[] newArr = new char[arr.length - 1];

		for (int i = 0; i < arr.length - 1; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	private static String buildString(char[] c) {

		StringBuilder sb = new StringBuilder();
		for (char arr : c) {
			sb.append(arr);
		}
		return sb.toString();
	}

	private static int countDelete(char[] arr) {

		int counter = 0;

		for (int i = 1; i < arr.length; i++) {
			if (checkDelete(i, arr)) {
				counter++;
			}
		}

		return counter;
	}

	// метод не учитывает последний символ пробела, если их вконце несколько подряд.
	// Поэтому делается дополнительная проверка в методе deleteExtraSpace()
	
	private static boolean checkDelete(int i, char[] arr) {

		if (arr[i] == ' ') {
			if ((arr[i - 1] == ' ') || (i == arr.length - 1)) {
				return true;
			}
		}
		return false;
	}

}