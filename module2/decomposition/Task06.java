package by.jonline.module2.decomposition;

public class Task06 {
	
	//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
	
	public static void main(String[] args) {
		
		int a = 3;				// Задаем числа, которые проверяем простые ли они. 
		int b = 5;
		int c = 7;
		
		System.out.println(checkProst(a)&&
						   checkProst(b)&&
						   checkProst(c));
		
	}
	
	
	private static boolean checkProst(int qq) { // метод, определяющий является ли число простым

		if ((qq == 0) || (qq == 1)) { 			// т.к. 0 и 1 не являются простыми - выбрасываем для них false
			return false;
		} else if (qq == 2) { 					// т.к. 2 - первое простое число списка - для него true.
			return true;
		}

		for (int i = 2; i < qq; i++) {
			if (qq % i == 0) {
				return false;
			}
		}
		return true;
	}

}
