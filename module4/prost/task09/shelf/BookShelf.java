package by.jonline.module4.prost.task09.shelf;

import java.util.*;

import by.jonline.module4.prost.task09.book.Book;

public class BookShelf {

	Book b;
	private List<Book> bookList = new ArrayList<Book>();

	public void booksAdd(Book b) { // добавить книгу
		bookList.add(b);
	}

	public Book getBookById(int id) { // достать книгу по ID, чтобы добавить инфо
		for (Book bb : bookList) {
			if (bb.getId() == id) {
				return bb;
			}
		}
		return null;
	}

	public void showBookByAuthor(String author) { // показать информацию о книге определенного автора.
		for (Book b : bookList) {
			if (b.getAuthor().equals(author)) {
				System.out.println(b);
			}

		}
	}

	public void showBookByPublishing(String publishing) { // показать информацию о книгах издательства
		for (Book b : bookList) {
			if (b.getPublishing().equals(publishing)) {
				System.out.println(b);
			}
		}
	}

	public void showBookAfterYear(int year) { // список книг после определенного года
		for (Book b : bookList) {
			if (b.getYear() < year) {
				System.out.println(b);
			}
		}
	}

	public void showAllBook() { // показать информацию о всех книгах.
		for (Book b : bookList) {
			System.out.println(b);
		}
	}

}
