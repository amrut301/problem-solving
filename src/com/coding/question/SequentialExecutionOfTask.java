package com.coding.question;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SequentialExecutionOfTask {
	public static void main(String[] args) {
		ExecutorService service = Executors.newSingleThreadExecutor();
		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < 5; i++) {
			tasks.add(new Task(i));
		}
		tasks.stream().forEach(t -> {
			service.submit(t);
		});

	}
}

class Task implements Runnable {
	int n;

	public Task(int n) {
		this.n = n;
	}

	@Override
	public void run() {
		System.out.println("Running :" + n);
	}

}