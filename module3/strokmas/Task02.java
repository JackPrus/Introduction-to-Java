package by.jonline.module3.strokmas;

public class Task02 {

	// Замените в строке все вхождения 'word' на 'letter'.

	public static void main(String[] args) {

		String s = "You have to swap word word and letter";
		
		//для решения задачи используются исключительно массивы. 

		char[] c = s.toCharArray();
		String[] sArray = charToString(c); 
		
		// определяем как изменится длина массива с учетоам заменяемых слов
		int length = getNewArrayLength(sArray); 
		
		// создаем новый массив букв с учетом замены
		String[] newArray = swap(sArray, length); 

		// преобразуем в строку
		StringBuilder sb = new StringBuilder(); 
		for (int i = 0; i < newArray.length; i++) {
			sb.append(newArray[i]);
		}

		String swapedS = sb.toString();
		
		System.out.println(swapedS);

	}

	private static String[] swap(String[] sArray, int length) {

		String[] newArray = new String[length];

		int counter = 0;

		for (int i = 0; i < sArray.length; i++) {
			if (checkLetter(i, sArray)) { // следует ли за текущим символом комбинация "word".
				newArray[i + counter] = "w";
				newArray[i + 1 + counter] = "o";
				newArray[i + 2 + counter] = "r";
				newArray[i + 3 + counter] = "d";
				counter = counter - 2;
				i = i + 5;
			} else if (checkWord(i, sArray)) { //// следует ли за текущим символом комбинация "letter".
				newArray[i + counter] = "l";
				newArray[i + 1 + counter] = "e";
				newArray[i + 2 + counter] = "t";
				newArray[i + 3 + counter] = "t";
				newArray[i + 4 + counter] = "e";
				newArray[i + 5 + counter] = "r";
				counter = counter + 2;
				i = i + 3;
			} else {
				newArray[i + counter] = sArray[i];
			}
		}
		return newArray;
	}

	private static String[] charToString(char[] c) {

		String[] s = new String[c.length];
		for (int i = 0; i < c.length; i++) {
			s[i] = String.valueOf(c[i]);
		}
		return s;
	}

	private static int wordQuantity(String[] s) {

		int colli = 0;

		for (int i = 0; i < s.length; i++) {
			if (checkWord(i, s)) {
				colli++;
			}
		}
		return colli;
	}

	private static int letterQuantity(String[] s) {

		int colli = 0;

		for (int i = 0; i < s.length; i++) {
			if (checkLetter(i, s)) {
				colli++;
			}
		}
		return colli;
	}

	private static int getNewArrayLength(String[] s) {// находим длинну нового массива после замены.

		int wordColli;
		int letterColli;

		wordColli = wordQuantity(s);
		letterColli = letterQuantity(s);

		// т.к. "letter" на 2 символа больше чем "word" длина массива следующая:

		return (2 * (wordColli)) + ((-2) * letterColli) + s.length;

	}

	private static boolean checkWord(int i, String[] array) { // проверяет есть ли "word" на текущей позиции массива
		
		if (	array[i].equalsIgnoreCase("w") && 
				array[i + 1].equalsIgnoreCase("o")&& 
				array[i + 2].equalsIgnoreCase("r")&& 
				array[i + 3].equalsIgnoreCase("d")
				){
			return true;
		} else {
			return false;
		}
	}

	private static boolean checkLetter(int i, String[] array) { // проверяет есть ли "letter" на текущей позиции массива
		
		if (	array[i].equalsIgnoreCase("l") && 
				array[i + 1].equalsIgnoreCase("e")&& 
				array[i + 2].equalsIgnoreCase("t")&& 
				array[i + 3].equalsIgnoreCase("t")&& 
				array[i + 4].equalsIgnoreCase("e")&& 
				array[i + 5].equalsIgnoreCase("r")
				) {
			return true;
		} else {
			return false;
		}
	}

}
