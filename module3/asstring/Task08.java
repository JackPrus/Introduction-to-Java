package by.jonline.module3.asstring;

public class Task08 {

	/*
	 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и
	 * вывести его на экран. Случай, когда самых длинных слов может быть несколько,
	 * не обрабатывать.
	 * 
	 */

	public static void main(String[] args) {

		String s = "Релятиви́стская тео́рия гравита́ции (РТГ) — биметрическая теория гравитации "
				+ "развиваемая в рамках специальной теории относительности (в авторской интерпретации) "
				+ "и основанная на представлении гравитационного поля как симметричного тензорного "
				+ "физического поля валентности 2 в пространстве Минковского";

		String[] newS = s.split("\\s");

		System.out.println(searchTheLargest(newS));

	}

	private static int searchTheLargest(String[] s) {
		
		int maxSize = 0;

		for (String word : s) {
			if (word.length() > maxSize) {
				maxSize = word.length();
			}
		}
		return maxSize;
	}

}