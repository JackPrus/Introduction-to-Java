package by.jonline.module3.asstring;

public class Task06 {

	// Из заданной строки получить новую, повторив каждый символ дважды.

	public static void main(String[] args) {

		String s = "a b c d e f g h i j k";
		String newS = createNewS(s);

		System.out.println(newS);

	}


	private static String createNewS(String s) {
		
		// пробел не дублирует, все остальные символы дублирует.

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			
			String sLocal = s.substring(i, i + 1);
			
			if (sLocal.equals(" ")) {
				sb.append(sLocal);
			} else {
				sb.append(sLocal);
				sb.append(sLocal);
			}

		}

		return sb.toString();
	}
}