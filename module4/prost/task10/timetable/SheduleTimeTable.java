package by.jonline.module4.prost.task10.timetable;

import java.util.*;

import by.jonline.module4.prost.task10.airline.Airline;

public class SheduleTimeTable {

	private List <Airline> airline = new ArrayList<Airline>();
	private List <Airline> sortedAirline = new ArrayList<Airline>();
	
	
	public void addLine (Airline airline) {
		this.airline.add(airline);
	}
	
	public void sortByDestionation (String dest) {
		sortedAirline.clear();
		
		for (Airline qq : airline) {
			if (qq.getDestination().equalsIgnoreCase(dest)) {
				sortedAirline.add(qq);
			}
		}
	}
	
	public void sortByDay (String day) {
		sortedAirline.clear();
		
		for (Airline qq : airline) {
			if (qq.getWeekDay().equalsIgnoreCase(day)) {
				sortedAirline.add(qq);
			}
		}
	}
	
	public void sortDayAfterTime (String day, String time) {
		sortedAirline.clear();
		
		for (Airline qq : airline) {
			
			int f = qq.getTime().compareTo(time);
			
			if ((qq.getWeekDay().equalsIgnoreCase(day))&&(f>0)){
				sortedAirline.add(qq);
			}
		}
		
	}
	
	public void printSorted() {
		for (Airline qq : sortedAirline) {
			System.out.println(qq);
		}
	}
	
	
	
}
