package by.jonline.module4.prost.task02;

import by.jonline.module4.prost.task02.test.Test2;

public class Task02 {

	/*
	 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными
	 * параметрами. Добавьте конструктор, инициализирующий члены класса по
	 * умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
	 */

	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		
		System.out.println(t2.getA());
		System.out.println(t2.getB());
		
		t2.setA(6);
		t2.setB(7);
		
		System.out.println(t2.getA());
		System.out.println(t2.getB());
		
	}
	
}
