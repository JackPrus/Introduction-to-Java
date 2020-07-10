package by.jonline.module2.decomposition;

public class Task09 {

	/*
	 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
	 * вычисления его площади, если угол между сторонами длиной X и Y— прямой
	 */

	public static void main(String[] args) {

		double x = 4;
		double y = 5;
		double z = 7;
		double t = 2;

		double d1; // диагональ между X и Y.
		double s;

		d1 = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		if (
				((t + z) > d1) &&
				((d1 + z) > t) &&
				((d1 + t) > z) &&
				(x > 0) &&
				(y > 0) &&
				(z > 0) &&
				(t > 0))
		{
			s = getArea(x, y, d1) + getArea(d1, z, t);

			System.out.println("Площадь четырёхугольника :" + s);

		} else {
			System.out.println("Такой 4х угольник не существует. Задайте стороны заново");
		}

	}

	private static double getArea(double a, double b, double c) { // вычисляем площадь треугольника по 3 известным
																	// сторонам.

		double s;
		double p;

		p = (a + b + c) / 2;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return s;
	}

}
