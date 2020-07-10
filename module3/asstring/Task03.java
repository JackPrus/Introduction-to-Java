package by.jonline.module3.asstring;

public class Task03 {

	// Проверить, является ли заданное слово палиндромом.

	public static void main(String[] args) {

		String s = "топот";
		String n = "101";
		String kot = "кот";

		System.out.println(isPalindrom(s)); // true
		System.out.println(isPalindrom(n)); // true
		System.out.println(isPalindrom(kot)); // false

	}

	private static boolean isPalindrom(String s) {

		return s.equals(createPalinom(s)) ? true : false;

	}

	private static String createPalinom(String s) {

		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			sb.append(s.substring(i, i + 1));
		}
		return sb.toString();
	}

}