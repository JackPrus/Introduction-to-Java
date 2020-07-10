package by.jonline.module3.regexp;

import java.util.Arrays;
import java.util.Comparator;

public class Task01 {

	/*
	 * Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее
	 * выполнять с текстом три различных операции: отсортировать абзацы по
	 * количеству предложений; в каждом предложении отсортировать слова по длине;
	 * отсортировать лексемы в предложении по убыванию количества вхождений
	 * заданного символа, а в случае равенства – по алфавиту.
	 */

	public static void main(String[] args) {

		String s = "Мой дед родился в Кронштадте, моя жена – ленинградка, так что в Петербурге я чувствую себя не совсем чужим. "
				+ "Впрочем, в России трудно найти человека,в чьей жизни этот город ничего бы не значил. "
				+ "Все мы так или иначе связаны с ним, а через него друг с другом.\n"
				+ "В Петербурге мало зелени, зато много воды и неба. "
				+ "Город раскинулся на равнине, и небо над ним необъятно. "
				+ "Можно подолгу наслаждаться спектаклями, которые на этой сцене разыгрывают облака и закаты. "
				+ "Актерами управляет лучший на свете режиссер – ветер.\n "
				+ "Декорации из крыш, куполов и шпилей остаются неизменными, но никогда не надоедают. ";

		String symbol = "а"; // заданный символ для сортировки.

		// System.out.println(sortAbzBySentences(s));
		// System.out.println(sortSentencesByWordsLength(s));
		System.out.println(sortWordsBySymbol(s, symbol));
	}

	// сортировка слов по количеству входных символов. Если они равны - по длине. 
	
	private static String sortWordsBySymbol(String text, String symbol) {

		String[] words = sentenceToWords(text);

		Arrays.sort(words, new Comparator<String>() {
			@Override
			public int compare(String w1, String w2) {
				
				int w1colli = symbolQuantity(w1, symbol);
				int w2colli = symbolQuantity(w2, symbol);

				if (w2colli > w1colli) {
					return 1;
				} else if (w2colli < w1colli) {
					return -1;
				} else {
					return w2.length() - w1.length();
				}

			}
		});
		return buildStringWords(words);
	}
	
	// сортировка абзацев по числу предложений. 

	private static String sortAbzBySentences(String text) {

		String abz[] = textToParagraphs(text);
		
		Arrays.sort(abz, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return textToSentences(s1).length - textToSentences(s2).length;
			}
		});
		return buildStringAbz(abz);
	}

	// сортировака предложений текста по длинне слов.
	
	private static String sortSentencesByWordsLength(String text) {

		String[] s = textToSentences(text);
		String[] newSentence = new String[s.length];

		for (int i = 0; i < s.length; i++) {
			String[] words = sentenceToWords(s[i]); // не сортирует слова.
			Arrays.sort(words, new Comparator<String>() {
				@Override
				public int compare(String w1, String w2) {
					return w1.length() - w2.length();
				}
			});
			newSentence[i] = buildStringWords(words);
		}
		return buildStringSentences(newSentence);
	}

	private static String[] textToParagraphs(String text) {
		return text.split("\\n");
	}

	private static String[] textToSentences(String paragraph) {
		return paragraph.split("[\\!|\\?|\\.]");
	}

	private static String[] sentenceToWords(String sentence) {
		return sentence.split("\\s");
	}

	private static int symbolQuantity(String s, String symbol) {
		
		// найдем количество заданных символов в слове.
		
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == symbol.charAt(0)) {
				counter++;
			}
		}
		return counter;
	}

	
	// следующие методы фактически дублируют друг друга, но созданы лишь для
	// наглядности при проверке.
	// сортированные абзацы разделяет ничего, предложения - точка, а слова - пробел.
	
	
	private static String buildStringWords(String[] line) {
		StringBuilder sb = new StringBuilder();

		for (String ss : line) {
			sb.append(ss);
			sb.append(" ");
		}
		return sb.toString();
	}

	private static String buildStringSentences(String[] line) {
		StringBuilder sb = new StringBuilder();

		for (String ss : line) {
			sb.append(ss);
			sb.append(".");
		}
		return sb.toString();
	}

	private static String buildStringAbz(String[] line) {
		StringBuilder sb = new StringBuilder();

		for (String ss : line) {
			sb.append(ss);
		}
		return sb.toString();
	}
}