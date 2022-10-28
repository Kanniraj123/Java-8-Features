package StreamNumeric;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class NumbericExample {
	static BinaryOperator<Integer> bo = (x,y) -> x+y;
	public static void main(String[] args) {
		//without stream
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println("Calculating Sum without numberic "+ findsumNoNumberic(list));
		IntStream intstream = IntStream.range(1, 5);
		System.out.println("Calculating Sum with numberic "+ findsumNumberic(intstream));
		IntStream intstreamClosed = IntStream.rangeClosed(1, 5);
		System.out.println("Calculating Sum with numberic "+ findsumNumberic(intstreamClosed));
	}
	
	static int findsumNoNumberic(List<Integer> list) {
		return list.stream().reduce(0, bo);
	}
	static int findsumNumberic(IntStream list) {
		return list.sum();
	}
	

}
