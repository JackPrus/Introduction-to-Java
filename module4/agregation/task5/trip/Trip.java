package by.jonline.module4.agregation.task5.trip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public abstract class Trip {
	
	protected String hotel;
	protected String nutrition;
	protected int days;
	protected String transportation;
	protected double price;

	public Trip(String hotel, String nutrition, int days, String transportation, double price) {
		this.hotel = hotel;
		this.nutrition = nutrition;
		this.days = days;
		this.transportation = transportation;
		this.price = price;
	}

	public String getHotel() {return hotel;}
	public void setHotel(String hotel) {this.hotel = hotel;}
	public String getNutrition() {return nutrition;}
	public void setNutrition(String nutrition) {this.nutrition = nutrition;}
	public int getDays() {return days;}
	public void setDays(int days) {this.days = days;}
	public String getTransportation() {return transportation;}
	public void setTransportation(String transportation) {this.transportation = transportation;}
	public double getPrice() {return price;}
	public void setPrice(double price) {this.price = price;}
	
	abstract public String toString();

	public static List<Trip> sortByParametrs(List<Trip> trips, String typeOf, String transportation, int days, String nutrition) {

		Class<? extends Trip> typeTrip = getTypeName(typeOf);
		List<Trip> sortedTrip = new ArrayList<>();

		for (Trip tr : trips) {

			if ((tr.getClass().equals(typeTrip))
					&& (tr.getTransportation().equalsIgnoreCase(transportation) || transportation.equals(""))
					&& (tr.getNutrition().equalsIgnoreCase(nutrition) || nutrition.equals(""))
					&& (tr.getDays() <= days || days <= 0)) {
				sortedTrip.add(tr);
			}
		}
		return sortedTrip;
	}

	public static List<Trip> sortByPrice(List<Trip> tripList) {
		List<Trip> sortedTrip = new ArrayList<>(tripList);
		Collections.sort(sortedTrip, compareByPrice);
		return sortedTrip;
	}

	private static Comparator<Trip> compareByPrice = new Comparator<Trip>() {
		@Override
		public int compare(Trip t1, Trip t2) {
			return (int) (t1.getPrice() - t2.getPrice());
		}
	};

	private static Class<? extends Trip> getTypeName(String type) {
		switch (type.toUpperCase()) {

		case "ОТДЫХ": return RestTrip.class;
		case "ЭКСКУРСИЯ": return ExcursTrip.class;
		case "ОЗДОРОВЛЕНИЕ": return HealthTrip.class;
		
		default:
			System.out.println("Такого типа путешествия \"" + type + "\" нет в списке");
			return null;
		}
	}
}
