/** 
 * This program demonstrats a solution to the
 * BankAccount and SavingsAccount Classes
 * programming challenge.
 */

import java.text.NumberFormat;

public class SavingsDemo {

	public static void main(String[] args) {
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		// Create a SavingsAccount object with a $100 balance,
		// 3% interest rate, and a monthly service charge
		// of $2.50
		
		SavingsAccount savings = new SavingsAccount(100.0, 0.03, 2.50);
		
		// Display what we've got
		
		System.out.println("Balance: " + currency.format(savings.getBalance()));
		System.out.println("Number of deposits: " + savings.getNumDeposits());
		System.out.println("Number of withdrawls: " + savings.getNumWithdrawals());
		System.out.println();
		
		// Make some deposits.
		savings.deposit(25.00);
		savings.deposit(10.00);
		savings.deposit(35.00);
		
		// Display what we've done so far.
		System.out.println("Balance : " + currency.format(savings.getBalance()));
		System.out.println("Number of deposits: " + savings.getNumDeposits());
		System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
		
		// Make some withdrawals
		savings.withdrawl(100.00);
		savings.withdrawl(50.00);
		savings.withdrawl(10.00);
		savings.withdrawl(1.00);
		savings.withdrawl(1.00);
		
		System.out.println("Balance : " + currency.format(savings.getBalance()));
		System.out.println("Number of deposits: " + savings.getNumDeposits());
		System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
		
		// Do the monthly processing
		savings.monthlyProcess();
		
		System.out.println("Balance : " + currency.format(savings.getBalance()));
		System.out.println("Number of deposits: " + savings.getNumDeposits());
		System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
		
		

	}

}
