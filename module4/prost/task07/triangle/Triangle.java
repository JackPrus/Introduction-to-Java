package by.jonline.module4.prost.task07.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

	private int ax;
	private int ay;
	private int bx;
	private int by;
	private int cx;
	private int cy;

	// создаем 3 уг-к по 6 координатам в плоскости Х Y.
	
	public Triangle(int ax, int ay, int bx, int by, int cx, int cy) { 

		this.ax = ax;
		this.ay = ay;
		this.bx = bx;
		this.by = by;
		this.cx = cx;
		this.cy = cy;
	}

	public Triangle() {createTriangle();}

	public int getAx() {return ax;}
	public void setAx(int ax) {this.ax = ax;}
	public int getAy() {return ay;}
	public void setAy(int ay) {	this.ay = ay;}
	public int getBx() {return bx;}
	public void setBx(int bx) {this.bx = bx;}
	public int getBy() {return by;}
	public void setBy(int by) {this.by = by;}
	public int getCx() {return cx;}
	public void setCx(int cx) {this.cx = cx;}
	public int getCy() {return cy;}
	public void setCy(int cy) {this.cy = cy;}

	private void createTriangle() {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Введите координаты X Точки А");
			this.ax = Integer.parseInt(reader.readLine());
			System.out.println("Введите координаты Y Точки А");
			this.ay = Integer.parseInt(reader.readLine());
			System.out.println("Введите координаты X Точки B");
			this.bx = Integer.parseInt(reader.readLine());
			System.out.println("Введите координаты Y Точки B");
			this.by = Integer.parseInt(reader.readLine());
			System.out.println("Введите координаты X Точки C");
			this.cx = Integer.parseInt(reader.readLine());
			System.out.println("Введите координаты Y Точки C");
			this.cy = Integer.parseInt(reader.readLine());

		} catch (NumberFormatException e) {
			System.out.println("Введите корректное число");
		} catch (IOException f) {
			f.printStackTrace();
		}

	}

}
