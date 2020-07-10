package by.jonline.module4.prost.task08;

import by.jonline.module4.prost.task08.journal.ListOfCustomer;

public class Task08 {

	/*
	 * Создать класс Customer, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль.
	 */
	
	public static void main(String[] args) {

        ListOfCustomer loc = new ListOfCustomer();
        loc.showSortByName();
        System.out.println();
        loc.showCustomerByCard(19801980, 19921992); //интервал кредитки.

	}

}
