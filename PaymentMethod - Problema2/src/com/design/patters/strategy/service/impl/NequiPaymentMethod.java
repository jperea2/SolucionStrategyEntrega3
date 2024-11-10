package com.design.patters.strategy.service.impl;

import com.design.patters.strategy.service.PaymentMethodService;

public class NequiPaymentMethod extends PaymentMethodService {

	public NequiPaymentMethod(String buyerName, String email, String telephoneNumber, Double balance) {
		super(buyerName, email, telephoneNumber, balance);
	}

	@Override
	public void pay(Double paymentMount) {
		setPaymentMount(paymentMount);
		System.out.println("Paying with Nequi ...");
		System.out.println("Sending verification code");
		System.out.println("Validating verification code");
		setPaymentMount(paymentMount);
		if (!this.hasBalance()) {
			System.out.println("Insufficient balance!");
			return;
		}
		this.debit();
		System.out.println("Nequi payment made successfully!");
		System.out.println("New balance: " + this.getBalance());
	}
}