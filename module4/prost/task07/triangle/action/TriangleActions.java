package by.jonline.module4.prost.task07.triangle.action;

import by.jonline.module4.prost.task07.triangle.Triangle;

public class TriangleActions {

	private Triangle tr;
	private double perimetrOfTriangle;
	private double areaOfTriangle;
	private double sideA;
	private double sideB;
	private double sideC;

	private double krestMedX;
	private double krestMedY;

	public TriangleActions(Triangle triangle) {
		this.tr = triangle;
		checkItReal();
		countPerimetr();
		countArea();
		countKrestMed();
	}

	private void checkItReal() {

		sideLength();

		double a = sideA;
		double b = sideB;
		double c = sideC;

		if (((a + b) < c) || ((b + c) < a) || ((a + c) < b)) {
			System.out.println("Такой треугольник не существует");
		}

	}

	private void sideLength() {

		double aax = Math.pow(tr.getBx() - tr.getAx(), 2);
		double aay = Math.pow(tr.getBy() - tr.getAy(), 2);
		double bbx = Math.pow(tr.getCx() - tr.getBx(), 2);
		double bby = Math.pow(tr.getCy() - tr.getCx(), 2);
		double ccx = Math.pow(tr.getAx() - tr.getCx(), 2);
		double ccy = Math.pow(tr.getAy() - tr.getCy(), 2);

		sideA = Math.sqrt(aax + aay);
		sideB = Math.sqrt(bbx + bby);
		sideC = Math.sqrt(ccx + ccy);

	}

	private void countPerimetr() {
		perimetrOfTriangle = sideA + sideB + sideC;
	}

	private void countArea() {

		double a = sideA;
		double b = sideB;
		double c = sideC;
		double p = perimetrOfTriangle;

		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		areaOfTriangle = s;

	}

	private void countKrestMed() {

		double mX = (double) (tr.getBx() + tr.getCx()) / 2; // точка медианы на стороне bc
		double mY = (double) (tr.getBy() + tr.getCy()) / 2;
		double nX = (double) (tr.getAx() + tr.getBx()) / 2; // точка медианы на стороне ab
		double nY = (double) (tr.getAy() + tr.getBy()) / 2; // если явно не привести - потеряем точность.

		double a1 = tr.getAy() - mY;
		double b1 = mX - tr.getAx();
		double a2 = tr.getCy() - nY;
		double b2 = nX - tr.getCx();

		double d = a1 * b2 - a2 * b1;
		if (d != 0) {
			double c1 = (mX * tr.getAx()) - (mX * tr.getAy());
			double c2 = (nY * tr.getCx()) - (nX * tr.getCy());

			krestMedX = (b1 * c2 - b2 * c1) / d;
			krestMedY = (a2 * c1 - a1 * c2) / d;
		} else {
			System.out.println("Медианы не пересекаются. Треугольник составлен неверно");
		}

	}

	public void showParametr(String param) {
		switch (param) {
		case "Площадь":
			System.out.println(String.format("Площадь : %.2f", areaOfTriangle));
			break;
		case "Периметр":
			System.out.println(String.format("Периметр : %.2f", perimetrOfTriangle));
			break;
		case "Пересечение медиан":
			System.out.println(String.format("Пересечение медиан X: %.2f У: %.2f", krestMedX, krestMedY));
			break;
		default:
			System.out.println("Нет такого параметра \"" + param + "\"");
			break;
		}
	}

}
