import java.util.ArrayList;
import java.util.Collections;

class BankAccount implements Comparable<BankAccount> {

private int accountNumber;
private double balance;

public BankAccount(int anAccountNumber) 
{
	accountNumber = anAccountNumber;
	balance = 0;
}

public BankAccount(int anAccountNumber, double initialBalance) 
{
	accountNumber = anAccountNumber;
	balance = initialBalance;
}


public int getAccountNumber() 
{
	return accountNumber;
}

public void deposit(double amount)
{
	double newBalance = balance + amount;
	balance = newBalance;
}

public void withdraw(double amount)
{
	double newBalance = balance - amount;
	balance = newBalance;
}

public double getBalance()
{
	return balance;
}
//Compare by balance
public int compareTo(BankAccount BankAcc) 
{
	if (balance < BankAcc.balance)
		return -1;
	if (balance == BankAcc.balance)
		return 0;
	return 1;
}

}

