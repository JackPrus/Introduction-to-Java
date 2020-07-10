package by.jonline.module4.agregation.task4;


public class Task4 {

	/*
	 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
	 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
	 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
	 * положительный и отрицательный балансы отдельно.
	 */

	public static void main(String[] args) {
	
        Bank randomBank = new Bank("Priorbank");

        Client petrov = new Client("Ivan", "Ivanov", "TB6848664");
        Client fedorov = new Client("Petr", "Petrov", "TB8974739");

        randomBank.addNewClient(petrov);
        randomBank.addNewClient(fedorov);

        petrov.openAccount(new Account(105.25));
        petrov.openAccount(new Account(200.99));
        petrov.openAccount(new Account(-500.01));
        petrov.openAccount(new Account(300.13));

        fedorov.openAccount(new Account(150.80));
        fedorov.openAccount(new Account(-100.75));
        fedorov.openAccount(new Account(1000.23));
        fedorov.openAccount(new Account(500.08));

        //lock check
        System.out.println(randomBank.getClient("TB6848664").getAccount(1).getStatus());
        randomBank.getClient("TB6848664").blockAccaunt(1);
        System.out.println(randomBank.getClient("TB6848664").getAccount(1).getStatus() + "\n");

        //sorting check
        System.out.println(randomBank.getClient("TB6848664").getInformation());
        randomBank.getClient("TB6848664").sortByBalance();
        System.out.println(randomBank.getClient("TB6848664").getInformation());
        randomBank.getClient("TB8974739").sortByBalance();
        System.out.println(randomBank.getClient("TB8974739").getInformation());

        //print the total balance
        System.out.println(petrov.toString() + ", total balance: " + petrov.getBalance());
        System.out.println(fedorov.toString() + ", total balance: " + fedorov.getBalance());

        //print balance of positive accounts
        System.out.println();
        System.out.println(petrov.toString() + ", positive balance: " + petrov.getBalancePositiveAccounts());
        System.out.println(fedorov.toString() + ", positive balance: " + fedorov.getBalancePositiveAccounts());

        //print balance of negative accounts
        System.out.println();
        System.out.println(petrov.toString() + ", negative balance: " + petrov.getBalanceNegativeAccounts());
        System.out.println(fedorov.toString() + ", negative balance: " + fedorov.getBalanceNegativeAccounts());
    }

}
