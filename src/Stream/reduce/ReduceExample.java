package Stream.reduce;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ReduceExample {
	static BinaryOperator<Integer> bo = (a,b) -> a+b;
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
		
		System.out.println("Sum is (with optional for exception) "+ sum);
		System.out.println("Skip optional word and Sum is (with optional for exception) "+ sum.get());
		
		int sum1 = list.stream().mapToInt(i -> i).sum();
		System.out.println("Stream Sum with map method "+sum1);
		
		int sum2 = list.stream().reduce(0,bo);
		System.out.println("Stream Sum with reduce two arguments "+sum2);
	}

}
