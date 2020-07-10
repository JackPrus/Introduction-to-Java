package by.jonline.module4.agregation.task5.manager;

import java.util.ArrayList;
import java.util.List;

import by.jonline.module4.agregation.task5.trip.ExcursTrip;
import by.jonline.module4.agregation.task5.trip.HealthTrip;
import by.jonline.module4.agregation.task5.trip.RestTrip;
import by.jonline.module4.agregation.task5.trip.Trip;

public class TripManager {

	private List<Trip> tripBase = new ArrayList<>();
	private List<Trip> suitedTrip = new ArrayList<>(); // лист постоянно меняется в соответствии с заданными параметрами сортировки.

	{
		// База экскурсий

		Trip et1 = new ExcursTrip("Горная мечта", "Завтрак+ужин", 10, "Автобус", 450,
				"Прекрасный летний отдых на берегу черного моря с видом на горы", "Батуми");
		Trip et2 = new ExcursTrip("Hilton Wrozlav, Hilton Praga", "Только завтрак", 7, "Автобус", 1000,
				"Шикарный отдых с переездами в комфортабельном автобусе", "Вроцлав", "Прага");
		Trip et3 = new ExcursTrip("Anabel Hottel, Deuche Best, Franch Fest, Spanish Wine", "Завтрак+ужин", 10,
				"Автобус", 720, "Экскурсия по городам европы", "Варшава", "Берлин", "Кёльн", "Париж", "Барселона");
		Trip et4 = new ExcursTrip("Гостиница Украина, Жемчужина у моря", "только завтрак", 5, "Поезд", 300,
				"Тур по городам украины", "Киев", "Одесса");
		Trip et5 = new ExcursTrip("Тринити, Карпаты", "Только завтрак", 3, "Автобус", 440,
				"Прекрасный летний тур по западу украины. + Ночевка в корпатах.", "Львов");
		Trip et6 = new ExcursTrip("Berlin, Hamburg hottel", "только завтрак", 5, "Автобус", 550,
				"Экскурсионно-образовательный тур", "Познань", "Гамбург", "Берлин", "Лодзь");
		Trip et7 = new ExcursTrip("Siberia trip", "только завтрак", 10, "Самолет + Автобус", 490, "Северный тур",
				"Екатеринбург", "Новый Уренгой", "Тобольск", "Ханты-Мансийск");
		Trip et8 = new ExcursTrip("Bysta, Yagodna", "только завтрак", 7, "Автобус", 390,
				"Поездка по большим и малым татрам. Словакия.", "Кошице", "Попрад", "Мартин");
		Trip et9 = new ExcursTrip("Wrozlaw, Berlin, Good Morning, Wilhelmsen, Scandic ", "Только завтрак", 10,
				"Автобус", 990, "Летний тур по скандинавии", "Вроцлав", "Берлин", "Хельсинборг", "Осло", "Сола");

		tripBase.add(et1);
		tripBase.add(et2);
		tripBase.add(et3);
		tripBase.add(et4);
		tripBase.add(et5);
		tripBase.add(et6);
		tripBase.add(et7);
		tripBase.add(et8);
		tripBase.add(et9);

		// база путевок на отдых

		Trip rt1 = new RestTrip("Египет", "Sharm Resort", 5, "Всё включено", 14, "plane+transer", 800);
		Trip rt2 = new RestTrip("Египет", "Sharm Spa Resort", 4, "Всё включено", 7, "transer only", 300);
		Trip rt3 = new RestTrip("Египет", "Sharm El First", 5, "Ультра всё включено", 14, "plane only", 750);
		Trip rt4 = new RestTrip("Египет", "Rihana", 5, "Только завтрак", 14, "no", 400);
		Trip rt5 = new RestTrip("Египет", "Soft Pleasure", 4, "Только завтрак", 10, "plane+transer", 500);
		Trip rt6 = new RestTrip("Египет", "Sharm Resort Spa Best", 4, "Завтрак и ужин", 10, "plane+transer", 550);
		Trip rt7 = new RestTrip("Египет", "Egypt Pleasure", 5, "Всё включено", 14, "no", 600);
		Trip rt8 = new RestTrip("Египет", "Sharm Spa Sort Resort", 5, "Завтрак и ужин", 14, "plane+transer", 700);
		Trip rt9 = new RestTrip("Египет", "El Sharm", 5, "Всё включено", 7, "plane+transer", 550);

		tripBase.add(rt1);
		tripBase.add(rt2);
		tripBase.add(rt3);
		tripBase.add(rt4);
		tripBase.add(rt5);
		tripBase.add(rt6);
		tripBase.add(rt7);
		tripBase.add(rt8);
		tripBase.add(rt9);

		// оздоровительные путевки

		Trip ht1 = new HealthTrip("Беларусь", "Санаторий", "Сосны", "5 разовое", 21, "нет", 390);
		Trip ht2 = new HealthTrip("Беларусь", "Санаторий", "Народчанский Берег", "5 разовое", 21, "Автобус", 440);
		Trip ht3 = new HealthTrip("Украина", "Лагерь", "Солнечный Берег", "5 разовое", 21, "Поезд+Автобус", 210);
		Trip ht4 = new HealthTrip("Украина", "Лагерь", "Красная Гвоздика", "6 разовое", 22, "Поезд+Автобус", 250);
		Trip ht5 = new HealthTrip("Словакия", "Лагерь", "Bysta", "5 разовое", 21, "Автобус", 210);
		Trip ht6 = new HealthTrip("Украина", "Лагерь", "Чайка", "5 разовое", 21, "Поезд+Автобус", 200);
		Trip ht7 = new HealthTrip("Австрия", "Горные лыжи", "ELISABETHPARK HOTEL 4*", "Завтрак+Ужин", 7, "нет", 458);
		Trip ht8 = new HealthTrip("Андорра ", "Горные лыжи", "CALDEA", "только завтрак", 7, "авиа", 550);
		Trip ht9 = new HealthTrip("Польша ", "Санаторий", "Друскининкай", "5 разовое", 20, "Автобус", 669);

		tripBase.add(ht1);
		tripBase.add(ht2);
		tripBase.add(ht3);
		tripBase.add(ht4);
		tripBase.add(ht5);
		tripBase.add(ht6);
		tripBase.add(ht7);
		tripBase.add(ht8);
		tripBase.add(ht9);

	}

	public void showSuitedTrip(String typeOf, String transportation, int days, String nutrition) {
		suitedTrip.clear();
		suitedTrip.addAll(Trip.sortByParametrs(tripBase, typeOf, transportation, days, nutrition));
		showSortedByPrice();
	}

	public void showSortedByPrice() {
		List<Trip> sortedByPrice = new ArrayList<>();
		sortedByPrice.addAll(Trip.sortByPrice(suitedTrip));
		print(sortedByPrice);
	}

	public void print(List<Trip> listOfTrip) {
		for (Trip tr : listOfTrip) {
			System.out.println(tr);
		}
	}

}
