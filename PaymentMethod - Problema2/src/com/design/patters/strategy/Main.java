package com.design.patters.strategy;

import com.design.patters.strategy.service.PaymentMethodService;
import com.design.patters.strategy.service.impl.CreditCardPaymentMethod;
import com.design.patters.strategy.service.impl.DaviplataPaymentMethod;
import com.design.patters.strategy.service.impl.PsePaymentMethod;

public class Main {

	public static void main(String[] args) {
		
		PaymentMethodService daviplata = new DaviplataPaymentMethod("Jaun Perez", "juan.perez@gmail.com", "3003123473", 1000000d);
	    daviplata.pay(500000d);
	    System.out.println("--------------------------------------------------");	    
	    
	    PaymentMethodService nequi = new DaviplataPaymentMethod("Andrea Medina", "andrea.medina@gmail.com", "3078743473", 100000d);
	    nequi.pay(500000d);
	    System.out.println("--------------------------------------------------");
	    
	    PaymentMethodService creditCard = new CreditCardPaymentMethod("Carlos Torres", "carlos.torr@hotmail.com", "3104125499", 3800000d);
	    creditCard.pay(500000d);
	    System.out.println("--------------------------------------------------");
	    
	    PaymentMethodService pse = new PsePaymentMethod("Maria Guadalupe", "m.guada@latinmail.com", "3003123473", 30000d);
	    pse.pay(500000d);
	    System.out.println("--------------------------------------------------");
	}

}
