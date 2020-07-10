package by.jonline.module4.agregation.task5.trip;

public class RestTrip extends Trip {

	private String country;
	private int stars;

	public RestTrip(String country, String hotel, int stars, String nutrition, int days, String transportation, double price) {
		super(hotel, nutrition, days, transportation, price);
		this.country = country;
		this.stars = stars;
	}

	public String getCountry() {return country;}
	public void setCountry(String country) {this.country = country;}
	public int getStars() {return stars;}
	public void setStars(int stars) {this.stars = stars;}

	@Override
	public String toString() {
		return "RestTrip /// " + 
				"Страна: " + country + "; " + 
				"Отель: " + hotel + "; " + 
				"Категория отеля: " + stars + "*; " + 
				"Питание: " + nutrition + "; " + 
				"Количество дней: " + days + "; " + 
				"Транспортировка: " + transportation + "; " + 
				"Цена: " + price;
	}

}
