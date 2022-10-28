package StreamNumeric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbericBoxingUnBoxingExample {

	public static void main(String[] args) {
		//boxing().forEach(System.out :: println);
		System.out.println("Sum for unboxing "+ unboxing(Arrays.asList(1,2,3,4,5,6)));
	}
	
	static List<Integer> boxing(){
		return IntStream.rangeClosed(0, 100)
				.boxed()
				.collect(Collectors.toList());
	}
	
	static int unboxing(List<Integer> lis) {
		return lis.stream()
				.mapToInt(Integer :: intValue)
				.sum();
	}

}
