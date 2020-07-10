package by.jonline.module4.prost.task03;

import by.jonline.module4.prost.task03.student.Student;

public class Task03 {

	/*
	 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер
	 * группы, успеваемость (массив из пяти элементов). Создайте массив из десяти
	 * элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
	 * студентов, имеющих оценки, равные только 9 или 10.
	 */

	public static void main(String[] args) {
		

		Student st1 = new Student("Гарри Харламов", 10, new int[] { 8, 9, 8, 9, 8 });
		Student st2 = new Student("Андрей Скороход", 25, new int[] { 4, 6, 9, 5, 6 });
		Student st3 = new Student("Гарри Мартиросян", 10, new int[] { 9, 10, 10, 9, 10 });
		Student st4 = new Student("Павел Воля", 25, new int[] { 9, 10, 10, 9, 10 });
		Student st5 = new Student("Марина Кравец", 11, new int[] { 9, 10, 10, 9, 10 });
		Student st6 = new Student("Тимур Батрудинов", 31, new int[] { 7, 6, 8, 9, 6 });
		Student st7 = new Student("Александр Рева", 32, new int[] { 4, 6, 5, 4, 7 });
		Student st8 = new Student("Михаил Галустян", 25, new int[] { 9, 10, 10, 9, 10 });
		Student st9 = new Student("Вадим Галыгин", 31, new int[] { 9, 10, 10, 9, 10 });
		Student st10 = new Student("Демис Каребидис", 11, new int[] { 2, 3, 4, 2, 6 });


		Student[] st = new Student[10];
		st[0] = st1;
		st[1] = st2;
		st[2] = st3;
		st[3] = st4;
		st[4] = st5;
		st[5] = st6;
		st[6] = st7;
		st[7] = st8;
		st[8] = st9;
		st[9] = st10;

		for (Student qq : st) {
			qq.showGoodStudents();
		}

	}
}
