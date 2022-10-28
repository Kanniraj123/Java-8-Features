package Stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sam","Jack","Anderson","Marry");
		
		//List<String> filterout = names.stream().filter( s -> s.length() > 3).collect(Collectors.toList());
		Stream<String> filterout = names.stream().filter( s -> s.length() > 3);
		filterout.forEach(System.out :: println);
	}
}
