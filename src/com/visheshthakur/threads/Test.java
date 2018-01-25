package com.visheshthakur.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newCachedThreadPool();

		List<Customer> custList = new ArrayList<Customer>();
		// CREATING CUSTOMERS
		for (int i = 0; i < 10; i++) {
			Customer c = new Customer("Customer" + i, 5000);
			custList.add(c);
		}

		List<Future<Customer>> FutureList = new ArrayList<Future<Customer>>();

		for (Customer c : custList) {
			ExecuteTransaction et = new ExecuteTransaction();
			et.setCustomer(c, 100);
			// CALL THE THREAD
			FutureList.add(executor.submit(et));

		}

		for (Future<Customer> future : FutureList) {
			System.out.println(future.get());
		}
		executor.shutdown();
	}
}
