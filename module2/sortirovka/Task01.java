package by.jonline.module2.sortirovka;

import java.util.Arrays;

public class Task01 {

	/*
	 * Заданы два одномерных массива с различным количеством элементов и натуральное
	 * число k. Объединить их в один массив, включив второй массив между k-м и (k+1)
	 * - м элементами первого, при этом не используя дополнительный массив.
	 */

	public static void main(String[] args) {
		
		int k = 4;    // ввести позицию в которую будем копировать 2й массив. 
		
		int [] aa = {1,2,3,4,5,6,7,8,9,10};
		int [] bb = {0,0,0,0,0};
		
		if ((k>aa.length-2)||(k<0)) {
			System.out.println("Введите число (к) в диапазоне от 0 до "+(aa.length-2));
		} else {
			
			int position = aa.length-1;
			
			aa=Arrays.copyOf(aa, aa.length+(bb.length));
			
			int counter=0;
			
			for (int i=position; i>k; i--) {				//перемещаем элементы после к в конец массива. 
				aa[aa.length-1-counter]=aa[i];
				counter++;
			}
			
			System.arraycopy(bb, 0, aa, k+1, bb.length);
			
			System.out.println(Arrays.toString(aa));
		} 

	}

}
