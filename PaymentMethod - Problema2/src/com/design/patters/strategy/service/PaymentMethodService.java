package com.design.patters.strategy.service;

public abstract class PaymentMethodService {

	private String buyerName;
	private String email;
	private String telephoneNumber;
	private Double paymentMount;	
	private Double balance;
	
	public PaymentMethodService(String buyerName, String email, String telephoneNumber, Double balance) {
        this.buyerName = buyerName;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.balance = balance;
	}
	
	protected void debit() {		
		this.balance -= this.getPaymentMount();
	}
	
	protected boolean hasBalance() {
		return this.balance >= this.getPaymentMount();
	}
	
	public void setPaymentMount(Double paymentMount) {
		this.paymentMount = paymentMount;
	}
	
	public Double getPaymentMount() {
		return paymentMount;
	}
	
	public Double getBalance() {
		return balance;
	}

	public abstract void pay(Double paymentMount);
}
