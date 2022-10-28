package Optional;

import java.util.Optional;

public class OptionalMethodExample {
	public static void main(String[] args) {
		Optional<String> isNullable = Optional.ofNullable("Java 8");
		System.out.println(isNullable.isPresent() ? isNullable.get() : Optional.empty());
		
		Optional<String> of = Optional.of("With Of method");//if it is null throw exception
		System.out.println(of.isPresent() ? of.get() : Optional.empty());
		
		System.out.println(Optional.empty());
	}
}
