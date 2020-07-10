package by.jonline.module3.asstring;

public class Task04 {

	// С помощью функции копирования и операции конкатенации составить из частей
	// слова “информатика” слово “торт”.

	public static void main(String[] args) {

		String s = "информатика";
		char[] tt = new char[4];
		String tort = "";

		s.getChars(7, 8, tt, 0);
		s.getChars(3, 5, tt, 1);
		s.getChars(7, 8, tt, 3);

		tort = String.valueOf(tt[0]) + String.valueOf(tt[1]) + String.valueOf(tt[2]) + String.valueOf(tt[3]);

		System.out.println(tort);

	}
}