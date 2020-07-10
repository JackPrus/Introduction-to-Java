package by.jonline.module4.agregation.task2.car;

import by.jonline.module4.agregation.task2.car.component.Engine;
import by.jonline.module4.agregation.task2.car.component.Wheel;

public class Car {

	private String model;
	private Engine engine = new Engine();;
	private Wheel[] wheel = new Wheel[4];

	public Car(String model) {

		this.model = model;

		for (int i = 0; i < 4; i++) {
			wheel[i] = new Wheel();
		}

	}
	
	public String getModel() {
		return model;
	}

	public void fuelUp() {
		System.out.println("The tank has filled");
	}

	public void changeWheel(int i) {
		try 
		{
			wheel[i].changeWheel();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println ("There is no wheel under this number");
		}
		
	}

	public void move() {
		engine.move();
	}

}
