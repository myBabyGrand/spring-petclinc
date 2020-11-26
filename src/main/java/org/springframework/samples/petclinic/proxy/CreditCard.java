package org.springframework.samples.petclinic.proxy;

public class CreditCard implements Payment{
	Payment cash = new Cash();
	Boolean creditCardAble = true;

	@Override
	public void pay(int amount){
		if(creditCardAble){
			payByCreditCard(amount);
		}else{
			cash.pay(amount);
		}

	}

	private void payByCreditCard(int amount) {
		System.out.println(amount + " 카드결제");
	}
}
