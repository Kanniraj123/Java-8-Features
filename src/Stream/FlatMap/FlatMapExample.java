package Stream.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<Integer> oddno = Arrays.asList(1,3,5,7,9);
		List<Integer> evenno = Arrays.asList(2,4,6,8,10);
		
		List<List<Integer>> combined = Arrays.asList(oddno,evenno);
		
		System.out.println("Before Stream apply "+ combined);
		
		List<Integer> st = combined
						   .stream()
						   .flatMap(List :: stream)
						   .collect(Collectors.toList());
		System.out.println("After Stream applied "+ st);
	}

}
