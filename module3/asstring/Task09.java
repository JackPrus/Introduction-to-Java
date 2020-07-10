package by.jonline.module3.asstring;

public class Task09 {

	/*
	 * Посчитать количество строчных (маленьких) и прописных (больших) букв в
	 * введенной строке. Учитывать только английские буквы.
	 * 
	 */

	public static void main(String[] args) {

		String s = "London is the capital of Great Britain, its political, economic and cultural centre.";

		checkCase(s);

	}

	private static void checkCase(String s) {

		int upCase = 0;
		int lowCase = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				upCase++;
			} else if (Character.isLowerCase(s.charAt(i))) {
				lowCase++;
			}
		}

		System.out.println("Up case: " + upCase);
		System.out.println("Low case: " + lowCase);

	}
}