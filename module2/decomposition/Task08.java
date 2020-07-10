package by.jonline.module2.decomposition;

public class Task08 {

	/*
	 * Задан массив D. Определить следующие суммы D[l] + D[2] + D[3]; D[3] + D[4] +
	 * D[5]; D[4] +D[5] +D[6]. Составить метод(методы) для вычисления суммы трех
	 * последовательно расположенных элементов массива с номерами от k до m.
	 */

	public static void main(String[] args) {
		
		int [] aa = {0,1,2,3,4,5,6,7,8,9};
		
		int k = 4;     // ввод числа к сумму 3х чисел после которого будем считать. 
		
		int summ = summArray(aa,k);
		
		System.out.println(summ);

	}
	
	private static int summArray (int [] qq, int m) {
		
		int localSum=0;
		
		if (m> qq.length-3) {
			System.out.println("Введите число (m) от 0 до "+(qq.length-3));
		}else {
			for(int i=m; i<qq[m+3]; i++) {
				localSum +=qq[i];
			}
		}
		return localSum;
	}
	
	

}
