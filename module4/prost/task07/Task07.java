package by.jonline.module4.prost.task07;

import by.jonline.module4.prost.task07.triangle.Triangle;
import by.jonline.module4.prost.task07.triangle.action.TriangleActions;

public class Task07 {

	/*
	 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
	 * объектов, вычисления площади, периметра и точки пересечения медиан.
	 */

	public static void main(String[] args) {

		Triangle tr1 = new Triangle(1, 2, 2, 3, 3, 2);
		TriangleActions ta = new TriangleActions(tr1);
			
		ta.showParametr("Площадь");
		ta.showParametr("Периметр");
		ta.showParametr("Пересечение медиан");
		ta.showParametr("Радиус вписаной окружности");

	}
}
