package by.jonline.module4.prost.task05;

import java.util.Random;

public class Tencounter {
	
	private int startValue; 
	private int finishValue;
	private int currentValue;
	
	{
		startValue=0;
		finishValue=9;
	}
	
	public Tencounter() {
		this.currentValue=counterInit();
	}
	
	public Tencounter(int currentValue) {
		this.currentValue=currentValue;
	}	
	
	public int getCurrentValue() {	
		return currentValue;
	}
	
	
	public int counterInit() {
		
		Random rand = new Random();
		
		int value = rand.nextInt(10);     
		
		return value;
	}
	
	public void plusValue() {
		
		int value =currentValue;
		
		if (value==finishValue) {
			value=startValue;
		}else {
			value++;
		}
		
		currentValue=value;
	}
	
	public void minusValue() {
		
		int value =currentValue;
		
		if (value==startValue) {
			value=finishValue;
		}else {
			value--;
		}
		
		currentValue=value;
	}
	

	

}
