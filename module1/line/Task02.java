package by.jonline.module1.line;

public class Task02 {
	public static void main(String[] args) {

		// вычислить значение переменной z = ((𝑏 + √(𝑏2 + 4𝑎𝑐) / (2𝑎)) − 𝑎3𝑐 +𝑏−2 )

		int a = 10;
		int b = 15;
		int c = 4;
		double z;

		z = Math.pow(b, 2) - (4 * a * c);
		z = Math.sqrt(z);
		z = (z + b) / (2 * a);
		z = z - (Math.pow(a, 3) * c + (Math.pow(b, -2)));

		System.out.println(z);

	}

}
