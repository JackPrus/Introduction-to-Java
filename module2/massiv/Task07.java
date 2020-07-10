package by.jonline.module2.massiv;

public class Task07 {
	public static void main(String[] args) {

		// Даны действительные числа а1, а2, ..., аn. Найти max(a1 + a2n, a2 + a2n-1,
		// ..., аn + an+1).

		double[] a = { 4.4, 5.2, 2.1, 16.7, 3.4, 1.0, 7.9 };

		double max = a[0] + a[a.length - 1];

		for (int i = 1; i < a.length / 2; i++) { 	// если у нас нечетное число эл-в. То средний элемент просто не участвует						

			double b = a.length - 1 - i; 			

			if ((a[i] + b) > max) { 				
				max = a[i] + b;
			}
		}

		System.out.println(max);

	}
}