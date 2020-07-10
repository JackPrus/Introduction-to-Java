package by.jonline.module1.zykl;

import java.math.*;

public class Task04 {
	public static void main(String[] args) {

		// Составить программу нахождения произведения квадратов первых двухсот чисел.

		BigInteger big = new BigInteger("1");

		for (int i = 1; i <= 200; i++) {
			big = big.multiply(BigInteger.valueOf(i * i));
		}
		System.out.println(big);

	}
}
