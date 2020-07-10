package by.jonline.module3.asstring;

public class Task01 {

	// Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в
	// нем.

	public static void main(String[] args) {

		String s = "определить    максимальное          количество    пробелов"; //10

		int maxGeneral = 0;
		int maxLocal = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.substring(i, i + 1).equals(" ")) {
				maxLocal++;
				
			} else {
				
				if (maxLocal > maxGeneral) {
					maxGeneral = maxLocal;
					
				}
				
				maxLocal = 0;
			}
		}

		System.out.println(maxGeneral);

	}

}
