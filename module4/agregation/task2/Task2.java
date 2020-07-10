package by.jonline.module4.agregation.task2;

import by.jonline.module4.agregation.task2.car.Car;

public class Task2 {

	/*
	 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы:
	 * ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
	 */

	public static void main(String[] args) {

		Car car = new Car("Ford Model T");

		System.out.println(car.getModel());
		
		car.fuelUp();  // заправиться
		car.changeWheel(2); // указываем какое из 4х колес поменять 
		car.move();  

	}

}
