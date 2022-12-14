package Stream.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple","Orange","Banana","Pineapple");
		
		List<Integer> fruitsLength = fruits
									.stream()
									.map(String :: length)
									.collect(Collectors.toList());
		System.out.println(fruitsLength);
	}
}
