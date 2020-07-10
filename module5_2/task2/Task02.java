package by.jonline.module5_2.task2;

import by.jonline.module5_2.task2.payment.NotEnoughMoneyException;
import by.jonline.module5_2.task2.payment.Payment;

public class Task02 {

	/*
	 * Создать класс Payment с внутренним классом, с помощью объектов которого можно
	 * сформировать покупку из нескольких товаров.
	 */

	public static void main(String[] args) {
		
        Payment payment = new Payment(1000); // в конструкторе баланс кошелька при совершении покупок.

        try {

            payment.newPurchase(Payment.PurchaseType.CAR); // цена -100
            payment.newPurchase(Payment.PurchaseType.BOAT); // цена - 200
            payment.newPurchase(Payment.PurchaseType.HOUSE); // цена - 500
            payment.newPurchase(Payment.PurchaseType.HOUSE); // вот здесь выбросит исключение "недостаточно денег"

        } catch (NotEnoughMoneyException |
                UnsupportedOperationException |
                IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println(payment.print());

	}

}
