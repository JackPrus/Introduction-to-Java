package by.jonline.module4.agregation.task3;

import by.jonline.module4.agregation.task3.atlas.Turkmenistan;
import by.jonline.module4.agregation.task3.atlas.Westeros;

public class Task3 {

	/*
	 * Создать объект класса Государство, используя классы Область, Район, Город.
	 * Методы: вывести на консоль столицу, количество областей, площадь, областные
	 * центры.
	 */

	public static void main(String[] args) {
		
		Turkmenistan tkm = new Turkmenistan();
		tkm.turkmen.getName();
		tkm.turkmen.getArea();
		tkm.turkmen.getCapital();
		tkm.turkmen.getRegionquantity();
		tkm.turkmen.getRegioncenter();
		
		System.out.println();
		
		Westeros west = new Westeros();
		west.west.getName();
		west.west.getArea();
		west.west.getCapital();
		west.west.getRegionquantity();
		west.west.getRegioncenter();

	}

}
