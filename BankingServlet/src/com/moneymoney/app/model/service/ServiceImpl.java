package com.moneymoney.app.model.service;

import java.util.ArrayList;
import java.util.Set;

import com.moneymoney.app.model.dao.DAOImpl;
import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.account.pojo.FundTransferring;
import com.moneymoney.framework.service.Service;

public class ServiceImpl implements Service {
	DAOImpl dao = new DAOImpl();
	
	
	@Override
	public void addBankAccount(BankAccount bankAccount) {
		System.out.println(bankAccount);
		dao.addBankAccount(bankAccount);
	}
	

	@Override
	public ArrayList<BankAccount> viewAllAccounts(){
		return dao.viewAllAccounts();
	}
	
	
	@Override
	public boolean FundTransfer(BankAccount sender,BankAccount reciever,double amount) {
		return FundTransferring.transfer(sender, reciever, amount);
	}

	@Override
	public void addCustomer(Customer customer) {
		dao.addCustomer(customer);
	}
	
	@Override
	public ArrayList<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return dao.viewAllCustomers();
	}

	@Override
	public BankAccount searchAccountById(int num) {
		// TODO Auto-generated method stub
		return dao.searchAccountById(num);
	}
	
	public String withdraw(int accNo,double amount) {
		BankAccount account = searchAccountById(accNo);
		return account.withdraw(amount);		
	}
	public void deposit(int accNo,double amount) {
		BankAccount account = searchAccountById(accNo);
		account.deposit(amount);		
	}
}
