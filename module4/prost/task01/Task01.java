package by.jonline.module4.prost.task01;

import by.jonline.module4.prost.task01.test.Test1;

/*
 * Создайте класс Test1 c двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение из
 * этих двух переменных.
 */

public class Task01 {

	public static void main(String[] args) {

		Test1 t = new Test1(4,5);

		t.print();

		System.out.println(t.sum());
		System.out.println(t.larger());

		t.print();

		System.out.println(t.sum());
		System.out.println(t.larger());

	}

}
