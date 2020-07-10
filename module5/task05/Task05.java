package by.jonline.module5.task05;

import by.jonline.module5.task05.bouquet.Bouquet;
import by.jonline.module5.task05.builder.Bouquetbuilder;

public class Task05 {

	/*
	 * Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные
	 * композиции (объект, представляющий собой цветочную композицию). Составляющими
	 * цветочной композиции являются цветы и упаковка.
	 */

	public static void main(String[] args) {

		Bouquetbuilder bb = new Bouquetbuilder();

		bb.createBucket("Тюльпан - 1, роза - 2, газета");
		Bouquet bouquet = bb.getBucket();
		System.out.println(bouquet);

		bb.createBucket("Тюльпаны /2, розы / 3, нет");
		System.out.println(bb.getBucket());

		bb.createBucket("Роза = 9");
		System.out.println(bb.getBucket());

		bb.createRandomBucket(10);
		System.out.println(bb.getBucket());

	}

}
