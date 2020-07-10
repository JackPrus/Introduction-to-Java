package by.jonline.module5.task05.bouquet;

import java.util.Arrays;

import by.jonline.module5.task05.builder.Price;
import by.jonline.module5.task05.flower.*;
import by.jonline.module5.task05.wrap.Wrap;

public class Bouquet {

	Flower[] flowers;
	Wrap wrap;
	double price;

	public Bouquet(Wrap wrap, Flower... flowers) { // с упаковкой
		this.flowers = flowers;
		this.wrap = wrap;
		this.price = setPrice();
	}

	public Bouquet(Flower... flowers) { // без упаковки
		this.flowers = flowers;
		this.price = setPrice();
	}

	private double setPrice() {
		double cost = 0;
		for (Flower ff : flowers) {
			cost += Price.getPriceOfFlower(ff); //цены в файле
		}
		if (wrap != null) {
			cost += Price.getPriceOfWrap(wrap);
		}
		return cost;
	}

	@Override
	public String toString() {
		return "Bouquet: " + 
				"flowers: " + Arrays.toString(flowers) + 
				", wrap - " + wrap + 
				", total price :" + price;
	}

}