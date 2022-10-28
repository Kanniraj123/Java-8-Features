package FunctionalInterface.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	static BiPredicate<Integer,Integer> example = (a,b) -> a>=50 && b<50;
	public static void main(String[] args) {
		System.out.println("Testing Bipredicate "+ example.test(50, 10));

	}

}
