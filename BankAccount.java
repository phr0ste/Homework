
public abstract class BankAccount {
	
	private double balance;		// Account balance
	private int numDeposits;	// Number of deposits
	private int numWithdrawals;	// Number of withdraws
	private double interestRate; // Interest rate
	private double monthlyServiceCharges; // Service charges
		


public BankAccount(double bal, double intRate, double mon)
{
	balance = bal;
	interestRate = intRate;
	monthlyServiceCharges = mon;
	numWithdrawals = 0;
}

public void deposit(double amount)
{
	balance += amount;
	numDeposits++;
}

public void withdrawl(double amount)
{
	balance -= amount;
	numWithdrawals++;
	
}
	
private void calcInterest()
{
	// Get the monthly interest rate.
	double monIntRate = interestRate / 12;
	
	// Get the amount of interest for the month.
	double monInterest = balance * monIntRate;
	
	// Add the interest to the balance
	balance += monInterest;
}

/** 
 * The monthlyProcess method substracts the
 * monthly service charge from the account
 * balance and adds the monthly interest.
 * The number of deposits and number of
 * withdraws are set to 0
 */

public void monthlyProcess()
{
	// Subtract the monthly service charges
	// from the balance.
	
	balance -= monthlyServiceCharges;
	
	// Calculate and add the interest for
	// the month
	
	calcInterest();
	
	// Rest the number of deposits and
	// withdrawls to zero
	
	numDeposits = 0;
	numWithdrawals = 0;

}

/** 
 * The setMonthlyServiceCharges method sets
 * the monthly service charge to a specified amount
 * @param m The amount of monthly service charge
 */

public void setMonthlyServiceCharges(double m)
{
	monthlyServiceCharges = m;
	
}

/**
 * The getBalance method returns the account balance.
 * @return The account balance.
 */

public double getBalance()
{
	return balance;
}

/** 
 * the getNumDeposits method returns the
 * number of deposits.
 * @return The number of deposits
 */

public int getNumDeposits()
{
	return numDeposits;
}

/** 
 * The getNumWithdraws method returns the
 * number of withdraws
 * @return The number of withdraws
*/

public int getNumWithdrawals()
{
	return numWithdrawals;
}

/**
* The getInterestRate method returns the
* interest rate.
* @return The interest rate.
*/

public double getInterestRate()
{
	return interestRate;
	
}

/** 
* The getMonthlyServiceCharges method returns
* the monthly service charges
* @return The monthly service charges.
*/

public double getMonthlyServiceCharges()
{
	return monthlyServiceCharges;
}

}