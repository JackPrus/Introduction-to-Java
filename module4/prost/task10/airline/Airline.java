package by.jonline.module4.prost.task10.airline;

public class Airline {
	
	private String destination; 
	private int flightNumber;
	private String planeType;
	private String time;
	private String weekDay;
	
	
	public Airline(String destination, int flightNumber, String planeType, String time, String weekDay) {
		
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.time = time;
		this.weekDay = weekDay;
		
	}


	public String getDestination() {return destination;}
	public void setDestination(String destination) {this.destination = destination;}


	public int getFlightNumber() {return flightNumber;}
	public void setFlightNumber(int flightNumber) {this.flightNumber = flightNumber;}

	public String getPlaneType() {return planeType;}
	public void setPlaneType(String planeType) {this.planeType = planeType;}

	public String getTime() {return time;}
	public void setTime(String time) {this.time = time;}

	public String getWeekDay() {return weekDay;}
	public void setWeekDay(String weekDay) {this.weekDay = weekDay;}


	@Override
	public String toString() {
		return "Airline // "
				+ "Назначение=" + destination 
				+ ", Номер рейса=" + flightNumber 
				+ ", Тип самолёта=" + planeType
				+ ", Отправление=" + time + "/" + weekDay;
	}
	
}

