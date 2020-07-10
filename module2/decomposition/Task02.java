package by.jonline.module2.decomposition;

public class Task02 {

	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
	 * натуральных чисел.
	 * 
	 */

	public static void main(String[] args) {
		
		int a =4; 
		int b =8; 
		int c =12; 
		int d =16;
		
		
		int ab = getNod(a,b);
		int cd = getNod(c,d);
		int nod = getNod(ab,cd);
		
		System.out.println("НОД:"+nod);
		
	}
	
	private static int getNod(int a, int b) {

		while (a != 0 && b != 0) {
			if (Math.abs(a) > Math.abs(b)) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return b + a;
	}

}
