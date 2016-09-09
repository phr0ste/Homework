
public class SavingsAccount extends BankAccount {

	private boolean status;
	

	
public SavingsAccount(double bal, double intRate, double mon)
{
	super(bal, intRate, mon);
	
	if (bal < 25.0)
		
		status = false;  // Inactive
	
	else
		
		status = true;  // Active
}

public void withdrawl(double amount)
{
	
	if (status)
	{
		super.withdrawl(amount);
		if (getBalance() < 25)
			status = false;
	}
}

public void deposit(double amount)
{
	super.deposit(amount);
	if (!status)
	{
		if (getBalance() >= 25)
			status = true;
	}
}

/**
* The monthlyProcess method calls the super
* class's monthlyProcess method. If the number
* of withdraws is greater than 4, the
* monthly service charges are increased. 
*/

public void monthlyProcess()
{
	double msc; 	// Monthly service charge
	
	if (getNumWithdrawals() > 4)
	{
		// Get the monthly service Charges.
		msc = getMonthlyServiceCharges();
		
		// Increase the Monthly service charges.
		setMonthlyServiceCharges(msc + (getNumWithdrawals() - 4));
		
		// Do the monthly processing.
		super.monthlyProcess();
		
		// Set the monthly charges back
		setMonthlyServiceCharges(msc);
		
	}
	
	else
		super.monthlyProcess();

	}
}

