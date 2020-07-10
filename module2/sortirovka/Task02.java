package by.jonline.module2.sortirovka;

import java.util.Arrays;

public class Task02 {

	/*
	 * Даны две последовательности a1<=a2<=...an ; b1<=b2<=...bm. Образовать из них
	 * новую последовательность чисел так, чтобы она тоже была неубывающей.
	 * Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {
		
		int [] aa = {4,5,6,7,8,8,6,5,4,5};
		int [] bb = {2,2,2,3,3,3,4,4,4};
		
		int alength = aa.length;
		
		aa = Arrays.copyOf(aa, aa.length+bb.length);
		
		System.arraycopy(bb, 0, aa, alength, bb.length);
		
		Arrays.sort(aa);
		
		System.out.println(Arrays.toString(aa));
		

	}

}
