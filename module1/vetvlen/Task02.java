package by.jonline.module1.vetvlen;

public class Task02 {
	public static void main(String[] args) {

		// Найти max{min(a, b), min(c, d)}.

		int a = 4;
		int b = 6;
		int c = 8;
		int d = 10;
		int e; 
		
		e= Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println(e);

	}
}
