package by.jonline.module4.agregation.task5.trip;

import java.util.Arrays;

public class ExcursTrip extends Trip {

	private String[] cities;
	private String descriprion;

	public ExcursTrip(String hotel, String nutrition, int days, String transportation, double price, String descriprion, String... cities) {
		super(hotel, nutrition, days, transportation, price);
		this.cities = cities;
		this.descriprion = descriprion;
	}

	public String[] getCities() {return cities;}
	public void setCities(String[] cities) {this.cities = cities;}
	public String getDescriprion() {return descriprion;}
	public void setDescriprion(String descriprion) {this.descriprion = descriprion;}

	@Override
	public String toString() {
		return "ExcursTrip /// " + 
				"Города: " + Arrays.asList(cities) + "; \n" + 
				"Отель: " + hotel + "; " + 
				"Питание: " + nutrition + "; " + 
				"Количество дней: " + days + "; " + 
				"Транспортировка: " + transportation + "; "+ 
				"Описание: " + descriprion + "; \n" + 
				"Цена: " + price + "; \n"
				+ "___________________________________________________________________________________";
	}

}
