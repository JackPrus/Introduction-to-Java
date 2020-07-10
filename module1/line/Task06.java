package by.jonline.module1.line;

public class Task06 {

	public static void main(String[] args) {

		/*
		 * составить линейную программу, которая печатает true, если точка с
		 * координатами (х, у) принадлежит закрашенной области, и false — в противном
		 * случае
		 */
		
		Task06 ss = new Task06();
		System.out.println(ss.goCheck(-2, 3)); // true

	}

	private boolean goCheck(int x, int y) {  

		if ((x > (-5) && x < 5 && y > (-4) && y < 1) || (x > (-3) && x < 3 && y > -1 && y < 5)) {
			return true;
		} else
			return false;
	}
}
