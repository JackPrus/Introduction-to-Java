package by.jonline.module4.prost.task08.journal;

import java.util.*;

import by.jonline.module4.prost.task08.customer.Customer;

public class ListOfCustomer {

	private List<Customer> customerList = new ArrayList<Customer>();
	{
		customerList.add(new Customer(500, "Горбачев", "Михаил", "Сергеевич", "Медвежино", 19851991, 4234));
		customerList.add(new Customer(401, "Черненко", "Константин ", "Устинович", "Большая Тесь", 19841985, 2626));
		customerList.add(new Customer(302, "Андропов", "Юрий", "Владимирович", "Ставрополь", 19821984, 6572));
		customerList.add(new Customer(203, "Брежнев", "Леонид", "Ильич", "Каменское", 19641982, 9154));
		customerList.add(new Customer(104, "Хрущев", "Никита ", "Сергеевич", "Калиновка", 19531964, 1125));
		customerList.add(new Customer(101, "Берия", "Лаврентий ", "Павлович", "Мархеули", 19531953, 9167));
	}

	private Comparator<Customer> compareByName = new Comparator<Customer>() {
		@Override
		public int compare(Customer c1, Customer c2) {
			int result = c1.getSecondName().compareTo(c2.getSecondName());
			if (result == 0) {
				result = c1.getFirstName().compareTo(c2.getFirstName());
			}
			return result;
		}
	};

	public void showSortByName() {
		Collections.sort(customerList, compareByName);
		for (Customer cl : customerList) {
			System.out.println(cl);
		}
	}

	public void showCustomerByCard(long d1, long d2) { // диапазон номера карты от d1 до d2

		for (Customer cl : customerList) {
			if (cl.getCardNo() >= d1 && cl.getCardNo() < d2) {
				System.out.println(cl);
			}
		}

	}

}
