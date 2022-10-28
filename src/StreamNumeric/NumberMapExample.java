package StreamNumeric;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberMapExample {

	public static void main(String[] args) {
		System.out.println(ConvtoDouble());
		System.out.println(ConvtoLong());
		System.out.println(ConvtoObj());
	}

	static double ConvtoDouble() {
		return IntStream.rangeClosed(0, 100).mapToDouble(x -> x).sum();
	}

	static long ConvtoLong() {
		return IntStream.rangeClosed(0, 100).mapToLong(x -> x).sum();
	}

	static List<Integer> ConvtoObj() {
		return IntStream.rangeClosed(0, 10).mapToObj(x -> x).collect(Collectors.toList());
	}

}
