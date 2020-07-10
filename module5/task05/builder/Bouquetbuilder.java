package by.jonline.module5.task05.builder;

import by.jonline.module5.task05.bouquet.Bouquet;
import by.jonline.module5.task05.flower.*;
import by.jonline.module5.task05.wrap.Wrap;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bouquetbuilder {

	private List<Class<? extends Flower>> flowerClasses = new ArrayList<>(Arrays.asList(
			Rose.class, 
			Tulip.class, 
			Peony.class));

	private List<Wrap> wrapEnums = new ArrayList<>(Arrays.asList(
					Wrap.NEWSPAPER, 
					Wrap.COLORED_PAPER, 
					Wrap.TRANSPARENT_PAPER, 
					Wrap.NO));

	private Bouquet bouquet;
	private Flower[] flowers;
	private Wrap wrap;
	private Random rand = new Random();

	private void setRandomFlowers(int flowersQuantity) {

		this.flowers = new Flower[flowersQuantity];

		try {
			for (int i = 0; i < flowersQuantity; i++) {
				int j = rand.nextInt(flowerClasses.size());
				flowers[i] = (flowerClasses.get(j).newInstance());
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		}
	}

	private void setRandomWrap() {

		int j = rand.nextInt(wrapEnums.size());
		this.wrap = wrapEnums.get(j);
	}

	public void createRandomBucket(int flowersQuantity) {

		setRandomFlowers(flowersQuantity);
		setRandomWrap();
		create();
	}

	public void createBucket(Wrap wrap, Flower... flowers) {
		this.wrap = wrap;
		this.flowers = flowers;
		create();
	}

	public void createBucket(Flower... flowers) {
		this.wrap = Wrap.NO;
		this.flowers = flowers;
		create();
	}

	public void createBucket(String s) {

		this.wrap = getWrapFromText(s);
		this.flowers = getFlowerListFromText(s);
		create();

	}

	private Flower[] getFlowerListFromText(String text) {

		List<Flower> flower = new ArrayList<>();

		Pattern p1 = Pattern.compile("(([Тт]юльпан[аовы]?)( ?[-= \\/:] ?)(\\d*))"); // ищет тюльпаны
		Pattern p2 = Pattern.compile("(([Рр]оз[аы]?)( ?[-= \\/:] ?)(\\d*))"); // ищет розы
		Pattern p3 = Pattern.compile("(([Пп]ион[аовы]?)( ?[-= \\/:] ?)(\\d*))"); // ищет пионы
		Matcher m1 = p1.matcher(text); // тюльпаны
		Matcher m2 = p2.matcher(text); // розы
		Matcher m3 = p3.matcher(text); // пионы

		while (m1.find()) {
			int tulipColli = Integer.parseInt(m1.group(4)); // количество роз
			for (int i = 0; i < tulipColli; i++) {
				flower.add(new Tulip());
			}
		}
		while (m2.find()) {
			int roseColli = Integer.parseInt(m2.group(4)); // количество тюльпанов
			for (int i = 0; i < roseColli; i++) {
				flower.add(new Rose());
			}
		}
		while (m3.find()) {
			int peonyColli = Integer.parseInt(m3.group(4)); // количество пионов
			for (int i = 0; i < peonyColli; i++) {
				flower.add(new Peony());
			}
		}

		Flower[] flowerArray = new Flower[flower.size()];

		for (int i = 0; i < flowerArray.length; i++) {
			flowerArray[i] = flower.get(i);
		}
		return flowerArray;

	}

	private Wrap getWrapFromText(String text) {

		Wrap localWrap = Wrap.NO;

		Pattern p4 = Pattern.compile("([Гг]азет)|([Цц]ветн)|([Пп]розрачн)|([Нн]е[т]?)"); // ищет обертку
		Matcher m4 = p4.matcher(text); 
		// упаковка. группа 1 - газета, 2- цветная бумага , 3 - прозрачн. пленка, 4 -нет.

		while (m4.find()) {
			if (m4.group(1) != null) {
				localWrap = Wrap.NEWSPAPER;
				break;
			} else if (m4.group(2) != null) {
				localWrap = Wrap.COLORED_PAPER;
				break;
			} else if (m4.group(3) != null) {
				localWrap = Wrap.TRANSPARENT_PAPER;
				break;
			} else if (m4.group(4) != null) {
				localWrap = Wrap.NO;
			}

		}
		return localWrap;
	}

	private void create() {bouquet = new Bouquet(this.wrap, this.flowers);}

	public Bouquet getBucket() {return this.bouquet;}

}