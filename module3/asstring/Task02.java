package by.jonline.module3.asstring;

public class Task02 {

	// В строке вставить после каждого символа 'a' символ 'b'.

	public static void main(String[] args) {

		String s = "a   a    a   c d bd fda asf a";

		String sab = createAB(s);

		System.out.println(sab);

	}

	private static String createAB(String s) {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			
			if (s.substring(i, i + 1).equals("a")) {
				sb.append(s.substring(i, i + 1));
				sb.append("b");
			} else {
				sb.append(s.substring(i, i + 1));
			}
		}

		return sb.toString();

	}

}
