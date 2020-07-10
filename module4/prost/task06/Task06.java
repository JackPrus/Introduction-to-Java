package by.jonline.module4.prost.task06;

public class Task06 {

	/*
	 * Составьте описание класса для представления времени. Предусмотрте возможности
	 * установки времени и изменения его отдельных полей (час, минута, секунда) с
	 * проверкой допустимости вводимых значений. В случае недопустимых значений
	 * полей поле устанавливается в значение 0. Создать методы изменения времени на
	 * заданное количество часов, минут и секунд.
	 */

	
	public static void main(String[] args) {
		
		Time t1 = new Time(1,22,20);   // часы, минуты, секунды
		
		System.out.println(t1); // 1:22:20
		t1.setMin(33);  
		System.out.println(t1); // 1:33:20
		t1.setMin(65); 
		System.out.println(t1); // 1:0:20
		
		t1.forvardHour(1); 
		System.out.println(t1); // 2:0:20
		t1.forvardMin(-20); 
		System.out.println(t1); // 1:40:20
		t1.forvardSek(1111);
		System.out.println(t1); // 1:58:51
		
		
	}
	
	
}
