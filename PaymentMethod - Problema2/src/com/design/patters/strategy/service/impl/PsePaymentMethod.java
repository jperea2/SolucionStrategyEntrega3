package com.design.patters.strategy.service.impl;

import com.design.patters.strategy.service.PaymentMethodService;

public class PsePaymentMethod extends PaymentMethodService {

	private String bank; 

	public PsePaymentMethod(String buyerName, String email, String telephoneNumber, Double balance) {
		super(buyerName, email, telephoneNumber, balance); 
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	@Override
	public void pay(Double paymentMount) {
		setPaymentMount(paymentMount);
		System.out.println("Paying with PSE ...");
		System.out.println("Select bank");
		System.out.println("Validating data access");
		setBank("Bancolombia");		
		System.out.println("Bank selected: " + this.bank);
		if (!this.hasBalance()) {
            System.out.println("Insufficient balance!");
            return;
		}
		this.debit();
		System.out.println("PSE payment made successfully!");
		System.out.println("New balance: " + this.getBalance());
	}
}
