package by.jonline.module4.agregation.task3.atlas;

import by.jonline.module4.agregation.task3.country.City;
import by.jonline.module4.agregation.task3.country.District;
import by.jonline.module4.agregation.task3.country.Government;
import by.jonline.module4.agregation.task3.country.Region;

public class Westeros {

	City winterfell = new City("Винтерфелл");  
	City lordport = new City("Лордпорт"); 
	City riverrun = new City("Риверран"); 
	City eyrie = new City("Орилное Гнездо"); 
	City kingsLanding = new City("Королевская Гавань"); 
	City casterlyRock = new City("Утес Кастерли"); 
	City highgarden  = new City("Хайгарден"); 
	City storm  = new City("Штормовой Предел"); 
	City sunspear  = new City("Солнечное Копьё"); 
	
	
	City capital = kingsLanding;
	
	District winterfellDis = new District ("Королевство Севера", winterfell );
	District ironIslands = new District ("Железные Острова", lordport );
	District riverLands = new District ("Речные Земли", riverrun );
	District eyrieDis = new District ("Долина Аррен", eyrie );
	District crownlands = new District ("Королевские земли", kingsLanding );
	District westerlandsDis = new District ("Западные земли", casterlyRock );
	District reacland = new District ("Простор", highgarden );
	District stormDis = new District ("Штормовые Земли", storm );
	District sunspearDis = new District ("Дорнийские земли", sunspear );
	
	
	
	Region north = new Region ("Север", winterfell, winterfellDis);
	Region kingomOfIslandsAndRivers = new Region("Дяржава Королей Островов и Рек", kingsLanding,ironIslands, riverLands );
	Region valeofArryn = new Region ("Долина Аррен", eyrie, eyrieDis);
	Region westerlands = new Region("Западные Земли", casterlyRock, westerlandsDis );
	Region reach = new Region ("Простор", highgarden, reacland);
	Region stormlands = new Region ("Штормовые Земли", storm, stormDis);
	Region dorne = new Region ("Дорн", sunspear, sunspearDis);
	
	public Government west = new Government("7 Королевств", capital, 3500000, north, kingomOfIslandsAndRivers, valeofArryn, westerlands, reach, stormlands,dorne);
	
}
