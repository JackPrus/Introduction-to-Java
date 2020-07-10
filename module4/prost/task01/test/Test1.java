package by.jonline.module4.prost.task01.test;

public class Test1 {

	private int a;
	private int b;
	
	public Test1 (int a, int b) {
		this.a=a;
		this.b=b;
	}

	public int getA() {return a;}
	public void setA(int a) {this.a = a;}

	public int getB() {return b;}
	public void setB(int b) {this.b = b;}

	public void print() {

		System.out.println("int a=" + a);
		System.out.println("int b=" + b);

	}

	public int sum() {
		return a + b;
	}

	public int larger() {
		return a > b ? a : b;
	}
	
}
