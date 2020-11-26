package org.springframework.samples.petclinic.proxy;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;

public class Cash implements Payment {
	@Override
	public void pay(int amount) {
		System.out.println(amount +" 현금결제");
	}
}
