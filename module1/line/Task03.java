package by.jonline.module1.line;

public class Task03 {

	public static void main(String[] args) {

		/* Вычислить значение выражения по формуле (все переменные принимают
		* действительные значения):
		* (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦 )/(𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦)*(𝑡𝑔 𝑥𝑦);
		*/ 

		double x = 90.0; // задаем значения в градусах
		double y = 270.0;
		double z; 

		double xtorad = Math.toRadians(x); 
		double ytorad = Math.toRadians(y);

		z = (Math.sin(xtorad) + Math.cos(ytorad)) / (Math.cos(xtorad) - Math.sin(ytorad));
		
		z = z * (Math.tan(Math.toRadians(x * y)));

		System.out.println(z);

	}
}
