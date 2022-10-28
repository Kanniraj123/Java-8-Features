package FunctionalInterface.Function;

import java.util.function.Function;

public class FunctionExample {
	static Function<String, Integer> transform = (a) -> a.length();
	public static void main(String[] args) {
		System.out.println("Function Example " + transform.apply("Java 8"));
		
	}

}
