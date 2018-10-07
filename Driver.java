import java.util.ArrayList;
import java.util.Collections;

public class Driver {
	public static void main(String[] args) {

		ArrayList<BankAccount> list = new ArrayList<BankAccount>();

		BankAccount John = new BankAccount(1, 1000); 

		BankAccount Anna = new BankAccount(2, 2000);

		BankAccount Helen = new BankAccount(3, 3000);

		BankAccount Tom = new BankAccount(4, 4000);

		BankAccount David = new BankAccount(5, 5000);

		list.add(David);
		list.add(Helen);
		list.add(John);
		list.add(Anna);
		list.add(Tom);

		//Print the unsort list
		for (int i = 0; i < list.size(); i++) 
		{
			BankAccount b = list.get(i);
			System.out.println(b.getBalance());
		}

		Collections.sort(list);

		// Sort by Balance
		// Print the sorted list

		for (int i = 0; i < list.size(); i++) 
		{
			BankAccount b = list.get(i);
			System.out.println(b.getBalance());
		}

	}

}
