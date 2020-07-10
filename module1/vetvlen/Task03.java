package by.jonline.module1.vetvlen;


public class Task03 {
	public static void main(String[] args) {
		
		// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
		// расположены на одной прямой.

		Task03 th = new Task03();
		th.goCheck(4, 5, 2, 1, 4, 6); // передаем параметры x1,y1 , x2,y2 , x3,y3 соответственно. 

	}

	private void goCheck(int x1, int y1, int x2, int y2, int x3, int y3) {

		int dx3 = x3 - x1;
		int dx2 = x2 - x1;
		int dy3 = y3 - y1;
		int dy2 = y2 - y1;
		int d = (dx3 / dx2) - (dy3 - dy2);

		if (d == 0) {
			System.out.println("Точки лежат на одной прямой");
		} else {
			System.out.println("Точки не лежат на одной прямой");
		}
		
	}
}
