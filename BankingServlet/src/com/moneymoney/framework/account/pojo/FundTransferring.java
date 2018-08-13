package com.moneymoney.framework.account.pojo;

/**
 * 
 * Payment Gateway for Account to Account transfer
 *
 */
public class FundTransferring {
	// method to transfer the given amount from the sender to target account.
	public static boolean transfer(BankAccount sender, BankAccount reciever, double amount) {
		
		boolean status;
		if (sender.getAccountBalance() >= amount) {
			sender.withdraw(amount);
			reciever.deposit(amount);
			status = true;
		} else {
			status = false;
		}
		return status;
	}
}