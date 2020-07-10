package by.jonline.module3.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {

	/*
	 * Дана строка, содержащая следующий текст (xml-документ): Напишите анализатор,
	 * позволяющий последовательно возвращать содержимое узлов xml-документа и его
	 * тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
	 * Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
	 * 
	 */

	public static void main(String[] args) {

		// для проверки работы паттерна использовался сайт https://regex101.com/

		String s = "<notes>\n" +
                "<note id = \"1\">\n" +
                "<to>Вася</to>\n" +
                "<from>Света</from>\n" +
                "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" +
                "</note> \n" +
                "<note id = \"2\">\n" +
                "<to>Петя</to>\n" +
                "<from>Маша</from>\n" +
                "<heading>Важное напоминание</heading>\n" +
                "<body/>\n" +
                "</note>\n" +
                "</notes> ";

		Pattern patern = Pattern.compile(
				"((?<open><.*?>)(?<body>.*?)(?<close><\\/.*?>))|" + // комплектная строка
				"(?<justopen><[^\\/].*?[^\\/]>)|" + // только открывающий тег
				"(?<bodywithotBody><.*\\/>)|" + // тело без тела
				"(?<justclose><\\/.*>)" // только закрывающий тег
				); 

		Matcher m = patern.matcher(s);

		while (m.find()) {

			if (m.group("open") != null && m.group("body") != null && m.group("close") != null) {
				
				System.out.println(
						"Открывающий тег: " + m.group("open") + "; " + 
						"Тело: \"" + m.group("body") + "\"; "+ 
						"Закрывающий тег: " + m.group("close")
						);
				
			} else if (m.group("justopen") != null) {
				System.out.println("Только открывающий тег: " + m.group("justopen"));
			} else if (m.group("justclose") != null) {
				System.out.println("Только закрывающий тег: " + m.group("justclose"));
			} else if (m.group("bodywithotBody") != null) {
				System.out.println("Тег без тела: " + m.group("bodywithotBody"));
			}
		}

	}

}
