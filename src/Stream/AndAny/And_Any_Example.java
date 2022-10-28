package Stream.AndAny;

import java.util.Arrays;
import java.util.List;

public class And_Any_Example {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple","orange","banana","mango","pinepple");
		
		System.out.println("Check length "+ fruits.stream().allMatch(s -> s.length() < 4));
		System.out.println("Check length "+ fruits.stream().anyMatch(s -> s.length() > 4));
	}
}
