package by.jonline.module5.task04;

import by.jonline.module5.task04.dragon.Dragon;

public class Task04 {

	/*
	 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения
	 * о 100 сокровищах в пещере дракона. Реализовать возможность просмотра
	 * сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на
	 * заданную сумму.
	 */

	public static void main(String[] args) {

		// при импорте проекта учитывать адрес расположения файла price.txt, путь
		// задается в классе Price.

		Dragon dragon = new Dragon(100); 

		// наполняем сундук рандомными драгоценностями рандомно до количества,
		// указанного в конструкторе выше.

		dragon.fillChest();
		dragon.showTheMostExpensiveJew(); // показать самое дорогое.
		
		System.out.println("_____________________________");
		System.out.println(dragon.getOutput());
		System.out.println("_____________________________");
		

		// выбор драгоценностей на определенную сумму. Используется "жадный" подход.

		System.out.println(dragon.getByTotalAmount(59240));

	}

}
