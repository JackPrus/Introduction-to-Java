package by.jonline.module1.line;

public class Task04 {

	public static void main(String[] args) {

		/*
		 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
		 * целой частях). Поменять местами дробную и целую части числа и вывести
		 * полученное значение числа.
		 */

		double a = 555.333;                 // исходное число.
		double b;
		double c; 
		int d;
		int e;
		double ff;

		b = a % 1;                  	 // выносим всю часть после запятой.
		c = b * 1000;               	 // получаем число близкое к 333. 
		d = (int) (c + 0.5);            // 333 классическое математическое округление (+0,5).
		e = (int) (a - (a % 1));        // 555
		ff = d + ((double) e / 1000);

		System.out.println(ff);

	}
}
