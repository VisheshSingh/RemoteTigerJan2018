package com.visheshthakur.transaction;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		List<Customer> custList = new ArrayList<Customer>();
		// ADDING CUSTOMERS
		for (int i = 0; i < 1000; i++) {
			custList.add(new Customer("Customer" + i, 5000));
		}
		// WITHOUT THREADING its sequential
		for (Customer c : custList) {
			ExecuteTransaction et = new ExecuteTransaction();
			// et.processTransaction(c, 1000);
			et.setCustomer(c, 1000);
			// IF THREAD IS IMPLEMENTED WE GET CUSTOMERS IN RANDOM ORDER BECAUSE OF THREAD
			// CALL
			Thread t = new Thread(et);
			t.start();
			// BINDING THREAD WITH JOIN WILL NOT LET OTHER THREAD TO EXECUTE UNTIL THE
			// CURRENT THREAD IS EXECUTED
			t.join();
		}
	}
}
