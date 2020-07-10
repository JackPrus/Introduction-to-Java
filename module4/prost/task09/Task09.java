package by.jonline.module4.prost.task09;

import by.jonline.module4.prost.task09.book.Book;
import by.jonline.module4.prost.task09.shelf.BookShelf;

public class Task09 {

	/*
	 * Создать класс Book, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Book, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль.
	 */

	public static void main(String[] args) {

		BookShelf bs = new BookShelf();

		bs.booksAdd(new Book(1132, "Философия Java", "Эккель", "Питер", 2019, 1168, 79, "Твердый"));
		bs.booksAdd(new Book(1142, "Закат Европы", "Шпенглер", "Философия Москва", 1998, 265, 13, "Твердый"));
		bs.booksAdd(new Book(1151, "Критика чистого разума", "Кант", "Философия Москва", 1998, 336, 189, "Твердый"));
		bs.booksAdd(new Book(1242, "Основы метафизики нравственности", "Кант", "Философия Питер", 2003, 165, 33,"Твердый"));
		bs.booksAdd(new Book(1488, "Критика способности суждения", "Кант", "Философия Питер", 2011, 664, 28, "Твердый"));
		bs.booksAdd(new Book(1367, "Афоризмы житейской мудрости", "Шопенгауэр", "Философия Москва", 2001, 126, 18,"Твердый"));
		bs.booksAdd(new Book(3211, "Капитал", "Маркс", "Философия Москва", 2011, 115, 18, "Твердый"));
		bs.booksAdd(new Book(4133, "Воля к власти", "Ницше", "Философия Москва", 2019, 155, 18, "Мягкий"));
		bs.booksAdd(new Book(5646, "Мир как воля и представление", "Шопенгауэр", "Философия Питер", 2009, 298, 18,"Твердый"));

		bs.showBookByAuthor("Кант");
		System.out.println();
		bs.showBookByPublishing("Философия Москва");
		System.out.println();
		bs.showBookAfterYear(2003);

	}

}
