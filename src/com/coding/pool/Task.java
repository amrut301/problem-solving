package com.coding.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executors = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			Future future = executors.submit(new Call(i));
			System.out.println(future.get());
		}
	}
}

class Call implements Callable {
	int i;
	float c=0x123_345;
	

	public Call(int i) {
		this.i = i;
	}

	@Override
	public Integer call() throws Exception {
		return i;
	}

}
