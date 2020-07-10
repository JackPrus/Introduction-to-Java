package by.jonline.module4.prost.task04;

import by.jonline.module4.prost.task04.depo.Depo;
import by.jonline.module4.prost.task04.train.Train;

/*Создайте класс Train, содержащий поля: название 
 * пункта назначения, номер поезда, время отправления. Создайте данные в массив из пяти элементов типа 
 * Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте возможность вывода 
 * информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массив по пункту 
 * назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления. 
 */

public class Task04 {
	
	public static void main(String[] args) {

        Depo depo = new Depo();

        Train tr1 = new Train(143, "Гомель", "16:24");
        Train tr2 = new Train(174, "Новозыбков", "13:41");
        Train tr3 = new Train(124, "Минск", "11:22");
        Train tr4 = new Train(432, "Гомель", "07:15");
        Train tr5 = new Train(130, "Гомель", "15:22");

        depo.setTrains(tr1,tr2,tr3,tr4,tr5);

        depo.sortByTrainNo();
        depo.print();

        System.out.println();

        depo.sortByDestination();
        depo.print();

        depo.infoByNumber(211);

	}

}
