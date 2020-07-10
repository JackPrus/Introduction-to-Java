package by.jonline.module4.prost.task10;

import by.jonline.module4.prost.task10.airline.Airline;
import by.jonline.module4.prost.task10.timetable.SheduleTimeTable;

public class Task10 {

	/*
	 * Создать класс Airline, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль.
	 */

	public static void main(String[] args) {
		
		SheduleTimeTable stt = new SheduleTimeTable();
		
		stt.addLine(new Airline("Туркменбаши", 1488, "Boeing", "12:45", "вт"));
		stt.addLine(new Airline("Ашхабад", 1322, "Airbus", "11:22", "ср"));
		stt.addLine(new Airline("Мары", 3645, "Boeing", "03:05", "вт"));
		stt.addLine(new Airline("Ташкент", 9899, "Boeing", "11:44", "пт"));
		stt.addLine(new Airline("Самарканд", 5454, "Mitsubishi", "16:55", "чт"));
		stt.addLine(new Airline("Душанбе", 1212, "CRAIC", "07:31", "вт"));
		stt.addLine(new Airline("Шымкент", 1336, "Comac", "20:33", "вс"));
		stt.addLine(new Airline("Алмаата", 1554, "Boeing", "22:55", "пт"));
		stt.addLine(new Airline("Душанбе", 1212, "CRAIC", "07:31", "чт"));
		stt.addLine(new Airline("Душанбе", 1212, "CRAIC", "07:31", "сб"));
		
		
		stt.sortByDay("вт"); // рейсы во вторник  
		stt.printSorted();
		System.out.println();
		
		stt.sortByDestionation("душанбе"); // рейсы в душанбе
		stt.printSorted();
		System.out.println();
		
		stt.sortDayAfterTime("вт", "05:22"); // рейсы во вторник после 05:22.
		stt.printSorted();
		
	}
	
	
}
