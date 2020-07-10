package by.jonline.module2.decomposition;

public class Task03 {

	// Вычислить площадь правильного шестиугольника со стороной а, используя метод
	// вычисления площади треугольника.

	public static void main(String[] args) {

		int a = 5; // задаем длину стороны шестиугольника.

		double sTriangle;
		double s;

		sTriangle = Math.pow(a, 2) * Math.sqrt(3) / 4;
		s = sTriangle * 6;

		System.out.println(s);

	}

}
