package by.jonline.module1.line;

public class Task05 {

	public static void main(String[] args) {

		/*
		 * Дано натуральное число Т, которое представляет длительность прошедшего
		 * времени в секундах. Вывести данное значение длительности в часах, минутах и
		 * секундах в следующей форме: ННч ММмин SSc.
		 */

		int t;               
		int hh;
		int mm;
		int ss; 
		
		t = 7100;                        		// тут устанавливаем количество прошедших секунд
		hh = t / 3600;
		mm = (t - (3600 * hh)) / 60;
		ss = t - (mm * 60) - (hh * 3600);
		
		System.out.println("HH" + hh + " MM" + mm + " SS" + ss);

	}
}
