package by.jonline.module3.strokmas;

public class Task03 {

	// В строке найти количество цифр.

	public static void main(String[] args) {

		String s = "8 этой стр04ке 6удет спрятан0 10 цифр. Пр08ерим эт0:";

		System.out.println(getNumbersQuantity(s));

	}

	public static int getNumbersQuantity(String s) {

		char[] c = s.toCharArray();
		int colli = 0;

		for (char mass : c) {
			if (mass >= 48 && mass <= 57) {
				colli++;
			}
		}
		return colli;
	}

}
