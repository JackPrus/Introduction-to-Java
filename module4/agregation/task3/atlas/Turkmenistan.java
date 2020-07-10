package by.jonline.module4.agregation.task3.atlas;

import by.jonline.module4.agregation.task3.country.City;
import by.jonline.module4.agregation.task3.country.District;
import by.jonline.module4.agregation.task3.country.Government;
import by.jonline.module4.agregation.task3.country.Region;

public class Turkmenistan {

	
	City turkmenbashi = new City("Туркменбаши");  // балканский
	City mary = new City("Мары"); // марийский велоят
	City khazar = new City("Хазар"); // балканский
	City serdar = new City("Сердар"); // балканский
	City dostluk = new City("Достлук"); // лебапский
	City turkmenabad = new City("Туркменадабад"); // лебапский столица
	City gokdepe = new City("Гёкдепе"); //Ахалский велоят
	City capital = new City("Ашхабад"); // столица
	
	District tkmbashiDis = new District ("Туркменбашинский", turkmenbashi );
	District maryDis = new District ("Марийский", mary );
	District khazarDis = new District ("Хазарский", khazar );
	District serdarDis = new District ("Сердарский", serdar );
	District dostlukDis = new District ("Достлукский", dostluk );
	District turkmenabadDis = new District ("Туркменадабадский", turkmenabad );
	District gokdepeDis = new District ("Гёкдепе", gokdepe );
	
	Region balkanabat = new Region ("Балканский велоят", new City("Балканабат"), tkmbashiDis, khazarDis, serdarDis);
	Region askhabad = new Region ("Ашхабад", capital, new District("Ашхабад", capital));
	Region akhal = new Region ("Ахалский велоят", new City("Анау"), gokdepeDis);
	Region dashoguz = new Region ("Дашогузский велоят", new City("Дашогуз"));
	Region lebap = new Region ("Лебапский велоят", turkmenabad , dostlukDis, turkmenabadDis);
	Region maryReg = new Region ("Марыйский велоят", mary, maryDis);
	
	public Government turkmen = new Government("Туркменистан", capital, 491210, balkanabat, askhabad, akhal, dashoguz, lebap, maryReg);
	

	
	

}
