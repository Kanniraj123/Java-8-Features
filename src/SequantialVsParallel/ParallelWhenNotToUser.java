package SequantialVsParallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelWhenNotToUser {

	public static void main(String[] args) {
		List<Integer> list = IntStream.rangeClosed(0, 10000).boxed().collect(Collectors.toList());
		sequential(list);
		parallel(list);
	}
	
	static void sequential(List<Integer> ls) {
		long start = System.currentTimeMillis();
		int total = ls.stream().reduce(0, (x,y) -> x+y);
		long end = System.currentTimeMillis();
		System.out.println("Sequential Duration " + (end - start));
	}
	static void parallel(List<Integer> ls) {
		long start = System.currentTimeMillis();
		int total = ls.parallelStream().reduce(0, (x,y) -> x+y);
		long end = System.currentTimeMillis();
		System.out.println("Parallel Duration " + (end - start));
	}

}
