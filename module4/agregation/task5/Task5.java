package by.jonline.module4.agregation.task5;

import by.jonline.module4.agregation.task5.manager.TripManager;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок. 
 */

public class Task5 {

	public static void main(String[] args) {

		String typeOf; // Отдых, Экскурсия, Оздоровление
		String transportation; // plane+transfer, transfer only, автобус, самолёт, нет и тд.
		int days; // 4-21
		String nutrition; // всё включено, только завтрак, завтрак + ужин и тд.

		TripManager tm = new TripManager();

		typeOf = "Оздоровление"; // Тип путевки. обязательное поле. (Пустым быть не может )
		transportation = ""; // Тип трансфера. можно оставить пустым, если параметр не имеет значения.
		days = 21; // До какого количества дней путевка. можно оставить 0 по умолчанию если не имеет значения.
		nutrition = "5 разовое"; // тип питания.

		tm.showSuitedTrip(typeOf, transportation, days, nutrition); // метод покажет сразу отсортированный по цене список.

	}

}
