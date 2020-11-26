package org.springframework.samples.petclinic.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

	@Test
	public void TestPay(){
		PayProxy payProxy = new PayProxy();
		Store store = new Store(payProxy);
		store.buy(100);
	}

}
