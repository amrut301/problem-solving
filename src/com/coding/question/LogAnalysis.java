package com.coding.question;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LogAnalysis {
	public static void main(String[] args) {
		String lines[] = new String[] { "10.0.0.1 - log entry 1 11", "10.0.0.1 - log entry 2 213",
				"10.0.0.2 - log entry 133132", "10.0.0.2 - log entry 133132", "10.0.0.2 - log entry 133132" };
		Comparator<? super Entry<String, Long>> comparator = (a, b) -> {
			return a.getValue() > b.getValue() ? 1 : a.getValue() < b.getValue() ? -1 : 0;
		};
		Optional<Entry<String, Long>> dsf = Stream.of(lines).map(l -> l.split("-")[0])
				.collect(Collectors.groupingBy(ip -> ip, Collectors.counting()))
				.entrySet()
				.stream()
				.max(comparator);
		System.out.println(dsf.get().getKey());
	}
}
