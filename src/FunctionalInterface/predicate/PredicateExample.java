package FunctionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> greaterThen = (a) -> ( a > 50);
		Predicate<Integer> lessThen = (a) -> (a < 50);
		Predicate<Integer> equalTo = (a) -> (a == 50);
		System.out.println(greaterThen.test(50));
		System.out.println("And Example : "+ greaterThen.and(lessThen).test(50));
		System.out.println("Or Example : "+ greaterThen.or(lessThen).test(40));		
		System.out.println("Equal Example : "+ greaterThen.equals(lessThen));

	}

}
