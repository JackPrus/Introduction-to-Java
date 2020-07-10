package by.jonline.module4.agregation.task3.country;

import java.util.ArrayList;
import java.util.List;

public class Region {
	
	private String name;
	private City ceneter;
	private List <District> district = new ArrayList<District>();
	
	public Region (String name, City center, District...district ) {
		this.name = name;
		this.ceneter=center;
		for (District qq: district) {
			this.district.add(qq);
		}
	}
	
	public City getCenter() {
		return this.ceneter;
	}

}
