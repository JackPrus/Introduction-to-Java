package by.jonline.module4.agregation.task1;

import by.jonline.module4.agregation.task1.component.Sentence;
import by.jonline.module4.agregation.task1.component.Text;
import by.jonline.module4.agregation.task1.component.Word;

public class Task1 {

	/*
	 * Создать объект класса Текст, используя классы Предложение, Слово. Методы:
	 * дополнить текст, вывести на консоль текст, заголовок текста.
	 */

	public static void main(String[] args) {

		Text t = new Text("Евангелие от Иоанна"); // текст с заголовком. 
		Sentence se1 = new Sentence("В начале было Слово,"); // создали предложение
		Word w1 = new Word ("и"); // создаем слова 
		Word w2 = new Word ("Слово");
		Word w3 = new Word ("было");
		Word w4 = new Word ("у");
		Word w5 = new Word ("Бога,");
		Sentence se2 = new Sentence(w1,w2,w3,w4,w5); // компануем предложение из слов. 
		Word w6 = new Word ("Бог"); // создаем еще слово
		t.addSent(se1,se2); // добавляем к тексту созданные предложения
		t.addWord(w1, w2, w3, w6); // добавляем к тексту слова. 


		//Текст готов. 
		
		System.out.println(t.getTitle());
		t.print();
	}

}
