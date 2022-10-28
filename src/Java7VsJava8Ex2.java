import java.util.*;
import java.util.stream.Collectors;
public class Java7VsJava8Ex2 {

	public static void main(String[] args) {
		List<String> arr = Arrays.asList("Sam","Ram","Jack","Sam");
		
		List<String> unique7 = new ArrayList<>();
		
		for(String name:arr) {
			if(!unique7.contains(name)) {
				unique7.add(name);
			}
		}
		System.out.println("before Java 8 " + unique7);
		
		List<String> unique8 = arr.stream().distinct().collect(Collectors.toList());
		
		System.out.println("After Java 8 " + unique8);

	}

}
