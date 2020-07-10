package by.jonline.module4.agregation.task3.country;

import java.util.ArrayList;
import java.util.List;

public class Government {
	
	private String name;
	private City capital; 
	private List <Region> regList = new ArrayList<>();
	private int area; 
	
	public Government (String name, City capital, int area, Region... region) {
		this.name=name;
		this.capital = capital;
		this.area=area;
		for (Region qq: region) {
			regList.add(qq);
		}
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void addRegion(Region ...regions) {
		for (Region qq: regions) {
			regList.add(qq);
		}
	}
	
	public void getRegionquantity() {
		System.out.println( "Количество областей: "+regList.size());
	}
	
	public void getArea() {
		System.out.println("Площадь: "+area+" m^2");
	}
	public void getCapital() {
		System.out.println("Столица: "+capital);
	}
	public void getRegioncenter() {
		String s ="Областные центры:|";
		for (Region qq : regList) {
			s+=(qq.getCenter())+"|";
		}
		System.out.println(s);
	}

}
