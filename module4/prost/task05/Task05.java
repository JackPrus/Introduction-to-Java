package by.jonline.module4.prost.task05;

public class Task05 {

	/*
	 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или
	 * уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите
	 * инициализацию счетчика значениями по умолчанию и произвольными значениями.
	 * Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
	 * получить его текущее состояние. Написать код, демонстрирующий все возможности
	 * класса.
	 */

	public static void main(String[] args) {
		
		Tencounter tc1 = new Tencounter(); 
		Tencounter tc2 = new Tencounter(9);
		
		System.out.println(tc1.getCurrentValue());
		tc1.plusValue();
		tc1.plusValue();
		tc1.minusValue();
		System.out.println(tc1.getCurrentValue());
		
		System.out.println(tc2.getCurrentValue());
		tc2.plusValue();
		tc2.plusValue();
		tc2.minusValue();
		System.out.println(tc2.getCurrentValue());
		

	}

}
