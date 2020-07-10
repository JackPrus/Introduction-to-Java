package by.jonline.module4.agregation.task5.trip;

public class HealthTrip extends Trip {

	private String country;
	private String type;

	public HealthTrip(String country, String type, String hotel, String nutrition, int days, String transportation, double price) {
		super(hotel, nutrition, days, transportation, price);
		this.country = country;
		this.type = type;
	}

	public String getCountry() {return country;}
	public void setCountry(String country) {this.country = country;}
	public String getType() {return type;}
	public void setType(String type) {this.type = type;}

	@Override
	public String toString() {
		return "HealthTrip /// " + 
				"Страна: " + country + "; " + 
				"Тип отдыха: " + type + "; " + 
				"Отель: " + hotel + "; "+ 
				"Питание: " + nutrition + "; " + 
				"Количество дней: " + days + "; " + 
				"Транспортировка: "+ transportation + "; " + 
				"Цена: " + price;
	}

}
