package com.design.patters.strategy.service.impl;

import com.design.patters.strategy.service.PaymentMethodService;

public class CreditCardPaymentMethod extends PaymentMethodService {

	private int quotas;

	public CreditCardPaymentMethod(String buyerName, String email, String telephoneNumber, Double balance) {
		super(buyerName, email, telephoneNumber, balance);
		quotas = 24;
	}

	@Override
	public void pay(Double paymentMount) {
		setPaymentMount(paymentMount);
		System.out.println("Paying with credit card ...");
		System.out.println("Select quotas");
		setQuotas(24);
		System.out.println("Quotas selected: " + this.quotas);
		if (!this.hasBalance()) {
			System.out.println("Insufficient balance!");
			return;
		}
		this.debit();
		System.out.println("Credit card payment made successfully!");
		System.out.println("New balance: " + this.getBalance());
	}
	
	public void setQuotas(int quotas) {
		this.quotas = quotas;
	}
}